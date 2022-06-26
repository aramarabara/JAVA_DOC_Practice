package Thread;

public class Main {

    public static void main(String[] args) {

        ThreadTest test = new ThreadTest();
        test.start();
        // 이 Test를 실행시키면 run() 메소드가 실행된다.
        // run 메서드는 stack구조로  실행된다.

        DeamonThread demon = new DeamonThread();
        demon.setDaemon(true); // 데몬스레드로 설정한다.
        // 주 스레드가 종료되면 데몬스레드도 종료된다.
        // 주 스레드가 start() 를 호출하기 전에 데몬스레드의 setDeamon(true)를 호출하면 된다.

        SynchronizeTest sync = new SynchronizeTest();
        sync.start();
        sync.syncronizedMethod();
        // synchronizedMethod() 메서드를 두 개 이상의 스레드에서 접근 시
        // 임계 영역을 갖는다.
        // 이 임계 영역에서 자원을 이용하려면 다른 스레드에서 임계 영역을 탈출해야 한다.

        // 다른 스레드는 먼저 들어간 스레드가 종료되면서 임계 영역을 탈출할 때까지
        // 대기한다.



    }

}
