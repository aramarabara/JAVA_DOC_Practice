package EffectiveJava.CH1_ObjectMakeNDestroy.Item_8_9_resouceDestroy;

import EffectiveJava.ExampleCode.Room;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class A_ExampleCode {

    public static void main(String[] args) throws Exception {

        // 1. finalizer와 cleaner 사용을 피하라
        // ** finalizer는 java9 에서 사용 자제(deprecated 되어 있다)

        //@Deprecated
        /* The finalization mechanism is inherently problematic.
        Finalization can lead to performance issues, deadlocks, and hangs.
        Errors in finalizers can lead to resource leaks; there is no way to cancel finalization if it is no longer necessary;
        and no ordering is specified among calls to finalize methods of different objects. Furthermore, there are no guarantees regarding the timing of finalization.
        The finalize method might be called on a finalizable object only after an indefinite delay, if at all.
        Classes whose instances hold non-heap resources should provide a method to enable explicit release of those resources,
        and they should also implement AutoCloseable if appropriate.
        The Cleaner and PhantomReference provide more flexible and efficient ways to release resources when an object becomes unreachable.*/

        // 즉, 대체메서드가 있으며 사이드이펙트가 너무 위험하기 때문에 사용 자제를 권고하고 있다.

        // 1) 언제 객체가 닫힐 지 알수 없다.
        // finalize는 우선순위가 낮기 때문에, 쓰레드에 계속 쌓여 outOfMemoryError가 발생할 수 있다.

        // 2) GB(Garbage Collector)의 성능을 떨어뜨린다.
        // ** 테스트 코드 필요

        // 3) 보안문제가 발생한다. finalizer는 GB가 수집하지 못하도록 자기 자신을 참조할 수 있다.

        // 예시, fileInputStream
        //FileInputStream fis = new FileInputStream("C:\\temp\\test.txt");
        // * @apiNote
        // * To release resources used by this stream {@link #close} should be called
        // * directly or by try-with-resources. Subclasses are responsible for the cleanup
        // * of resources acquired by the subclass.
        // * Subclasses that override {@link #finalize} in order to perform cleanup
        // * should be modified to use alternative cleanup mechanisms such as
        // * {@link java.lang.ref.Cleaner} and remove the overriding {@code finalize} method.

        // ** finalize를 override하여 사용하지 말고, try-with-resource 문 혹은 cleaner를 사용하라고 적혀 있다.
        // factory Method ExecutorService를 사용하여 풀링된 스레드 중 하나를 사용, 작업을 실행하는 클래스이다.

        // ** ThreadPool(동시진행하는 작업 개수)사이즈, Task Over시 스레드 대기시간 & 대기시간 설정 객체, 실행에 필요한 Queue 객체를 넣어 생성한다.
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>());

        // @Deprecated 되어있으나 안전망 ( 공격 방어 ) 형태의 finalizer를 제공한다.
        // 빈 finalizer는 보안 공격( 자기 자신을 참조하여 GB 수집을 막는 ) 에 안전하게 구현할 수 있다.
        //threadPoolExecutor.finalize();

        Room room = new Room(100);
        System.out.println("1. 자동청소가 없는 방에서 시간을 보낸다.");

        try(Room myRomm = new Room(100000)) {
            System.out.println("2. 자동청소가 있는 방에서 시간을 보낸다.");
        }

        // 이렇게 꼭 회수해야하는 자원이면 finazlie, cleaner, try-fianlly를 사용하지 말고
         // try-with-resource를 사용하여 회수한다면 안전하게 회수 가능하다. ( 자원을 사용하는 쓰레드가 종료되면 자동으로 회수한다. )

    }


}
