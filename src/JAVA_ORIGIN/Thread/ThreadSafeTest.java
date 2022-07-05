package JAVA_ORIGIN.Thread;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/*
*  Baeldung의 Testing Multi-Threaded Code in Java 참조
*  DOC : https://www.baeldung.com/java-testing-multithreaded
*
* */
public class ThreadSafeTest
{
    public class MyCounter {
        private int count;
        public void increment() {
            int temp = count;
            count = temp + 1;
        }

        // Getter for count
        public int getCount() {
            return count;
        }

    }

    /*
    * Intellij IDEA 를 이용하여 외부 junit4 라이브러리를 가져와 사용
    * */
    @Test
    public void testCounter() {
        MyCounter counter = new MyCounter();
        for (int i = 0; i < 500; i++) {
            counter.increment();
        }
        assertEquals(500, counter.getCount());
    }

}
