package Thread;

public class SynchronizeTest extends Thread {

    public void run() {
        // runnable에 넣는 것을 run 시에 실행한다.
        System.out.println("Thread를 extend하여 Thread를 구현할 수 있다. ");
    }

    public synchronized void syncronizedMethod() {
        System.out.println("Synchronized Method");
    }

}
