package JAVA_ORIGIN.Thread;

public class ThreadTest extends Thread {

    // Thread를 extend하여 Thread를 구현할 수 있다.

    // Thread는 Runnable을 implements하여야 한다.
    @Override
    public void run() {
        // runnable에 넣는 것을 run 시에 실행한다.
        System.out.println("Thread를 extend하여 Thread를 구현할 수 있다. ");
    }




}
