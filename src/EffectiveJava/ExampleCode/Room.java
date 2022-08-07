package EffectiveJava.ExampleCode;

import java.lang.ref.Cleaner;

public class Room implements AutoCloseable {

    private static final Cleaner cleaner = Cleaner.create();


    // 청소가 필요한( 회수가 필요한 ) 자원, 절대 Room을 참조해서는 안된다. 만약 참조한다면 GB가 객체를 가져가지 못하는
    // 순환참조 ( 객체가 서로 참조중이기 때문에 State와 Room이 서로 메모리에 잔존 ) 가 발생하게 된다.
    private static class State implements Runnable {

        int numJunkPiles; // 방 안의 쓰레기 개수

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        @Override
        public void run() {
            System.out.println("방청소");
            numJunkPiles = 0;
        }
    }

    // 방의 상태를 Cleaner와 공유하여 청소가 실행되는지 알수 있도록 한다.
    private final State state;

    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        this.state = new State(numJunkPiles);
        this.cleanable = Cleaner.create().register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }
    
    
    
}
