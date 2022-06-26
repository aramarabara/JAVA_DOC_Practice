package Thread;

public class Main {

    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        test.start();
        // 이 Test를 실행시키면 run() 메소드가 실행된다.
        // run 메서드는 stack구조로  실행된다.

    }

}
