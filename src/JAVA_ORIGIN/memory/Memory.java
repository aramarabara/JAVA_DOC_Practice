package JAVA_ORIGIN.memory;

/*
*  기초자료형 Stack & Queue
*
*  *java.util.Queue 및 java.util.Stack 참조
*  출처 : JAVA SE 15 & JDK 15 API
* */

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Memory {

    public static void main(String[] args) {

        /*
        * 타입제한을 위해 Generic 제공, @Override 다수
        *
        * INSERT / REMOVE / Examine  제공
        * Queue<String> queue = new Queue() {};
        *
        * Queue는 interface이기 때문에, 그냥 new 연산자로 생성하면 Override를 필요로 한다.
        * 즉, 만들어져 있는 구현체가 필요하다..
        *
        * */

        /*
        * implementation is not synchronized**, 멀티쓰레드를 지원하지 않는다..
        * Collections.synchronizedList(new LinkedList(...));
        * 를 통해서 멀티쓰레드 환경에서 안전하게 동작시킬 수 있다.
        *
        *  보통 List 순회 시 concurrentModificationException 발생하는데,
        * 이 Exception은 객체가 순회 도중 변화하면 발생한다..
        * 결국 iterator가 변화된 객체에서 돌 수 없기 때문에 발생하는 Exception
        * = fail fast : 순차접근 실패시 예외 발생시킴
        *
        *   이런 상황을 방지하기 위해 immutable 객체를 사용하여 원천 봉쇄하는 방법도 있다.
        * 출처 : https://m.blog.naver.com/tmondev/220393974518
        *
        * 오래된 코드들이 iterator 를 for loop로 돌리면서 자기자신을 제거하는 이유가,
        * 이런식으로 List가 Immutable 한 상황을 만들기 때문
        *
        *
        * */

        /*1. conCurrentModificationException을 발생시킨다. */
        try {
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < 10; i++) { queue.add(i); }
            for (Integer i : queue) {
                System.out.println(queue.peek());
                if(i == 2) queue.remove();
            }
        } catch (Exception e) {
            /*로그 남기기*/
            e.printStackTrace();
        }


        /*2. java에서 제공하는 queue를 implement하는 다른 객체를 사용해서 Exception을 방지해본다. */
        try {
            ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
            for (int i = 0; i < 10; i++) { deque.add(i); }
            for (Integer i : deque) {
                System.out.println(deque.toString());
                if(i==2) deque.remove();
                //remove 말고 다른 것을 써서 Exception을 방지할 수 도 있다.
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*3. immutable 객체, unmodifiableList를 사용하면 원천방지가 가능하다. */
        /*UnsupportedOperationException : readOnly로 생성된 객체에 변형을 가하려 하면
        * 주어지는 Exception
        * */
        try {
            Queue<Integer> queue = new LinkedList<>();
            for (int i = 0; i < 10; i++) { queue.add(i); }
            List<Integer> immutableList = Collections.unmodifiableList((List<Integer>)queue);
            for (Integer i : immutableList) {
                System.out.println(immutableList.size());
                if(i == 2) immutableList.remove(1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }

        /*4. stack 구조 실습
        *
        *  Queue가 Interface형식인 반면 Stack은 Class이다.
        *   Vector 클래스를 상속한다.
        * 특이한 점은 RandomAccess를 Implement 한다는 점이다.
        *
        * JAVA 1.0부터 존재하던 Legacy class이다. (이후에는 Collection Framework 사용함 )
        *
        * 배열기반이며, 가변적인 크기를 가진다 ( default는 10 )
        *
        * Iterator 기반으로 반복문 동작할 수 있으나 역시 Queue의 사례와 같이 ConcurrentModificationException 발생시킨다.
        *
        * Synchronized, 즉 멀티쓰레드에서 JAVA_ORIGIN.Thread-safe를 보증한다.
        *   <> ArrayList와는 대조적
        * */
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) { stack.push(i); }

        Vector<Integer> vector = new Vector<>();
        for (int i = 0; i < 20; i++) { vector.add(i); }




    }

}
