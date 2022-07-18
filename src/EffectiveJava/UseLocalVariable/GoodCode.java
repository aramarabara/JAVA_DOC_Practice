package EffectiveJava.UseLocalVariable;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class GoodCode {

    public static void main(String[] args) {

        int coverage = 1245;
        int year = 2020;
        double price = 1234.5678;
        long current = System.currentTimeMillis();
        // int index = 0;  이 index를 쓰이는 곳 바로 위에 붙여주자.

        int[] listArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // 이 Array도 쓰이는 곳 바로 위에 선언하여 초기화해주자.
        int[] timeArray = {1231241414, 124141241, 190401098, 12424124};

        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> list = new ArrayList<>();
        Set<String> set = new HashMap<String, List<String>>().keySet();
        File file = new File("");

        // 우리가 실행하고자 하는 기능과는 무관한 기존의 로직이다. ( 위와 같음 )
        if(file.exists()) {
            file.getAbsolutePath();
        } else {
            file.getPath();
        }

        try {
            URL url = new URL("http://www.google.com");
            url.getHost();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        list.set(0, "첫번째");
        list.set(1, "두번째");
        list.set(2, "세번째");
        list.set(3, "네번째");

        Iterator iterator = list.iterator();
        for(; iterator.hasNext();) {
            System.out.println(iterator.next());
        }

        //무엇을 대상으로 하는지 훨씬 깔끔해졌다.
        // 복사, 붙여넣기 시에도 위의 변수들을 같이 가져갈 가능성이 높으므로 유지보수, 기능확장에 좋다.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = 0;
        while ( index <= array.length ) {
            System.out.print(index);
            index++;
            index++;
        }

        if(file.exists()) {
            file.getAbsolutePath();
        } else {
            file.getPath();
        }

        try {
            URL url = new URL("http://www.google.com");
            url.getHost();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        list.set(0, "첫번째");
        list.set(1, "두번째");
        list.set(2, "세번째");
        list.set(3, "네번째");

        Iterator i2 = list.iterator();
        for(; i2.hasNext();) {
            System.out.println(i2.next());
        }

        // 그러나 변수명만 살짝 바꾸는 것만으로는 밑에 참조한 변수를 가져가지 않는 실수를 범할 수 있다.
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index2 = 0;
        while ( index <= array.length ) {
            System.out.print(index);
            index++;
            index++; // 새로 초기화된 index2가 아니라, index를 계속 사용하는 실수를 할 수 있다!
        }

        // 그래서 변수가 확실히 하나의 코드블럭에만 쓰일 수 있는 for문을 적극 사용하자.
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 미리 있는 변수명을 사용하려고 하면, 컴파일 오류를 주어 바로바로 의도에 맞지 않는 변수를 걸러낼 수 있다.
        //index는 미리 사용하고 있으므로 컴파일 오류가 발생한다.
        /*for (int index = 0; index < array3.length; index++) {
            System.out.print(index);
            index++;
            index++;
        }*/
        for (int newIndex = 0; newIndex < array3.length; newIndex++) {
            System.out.print(newIndex);
            newIndex++;
            newIndex++;
        }


    }


    // 가장 완벽한 방법은 로직을 따로 떼어내서, 완전히 독립된 메서드로 분리시키는 것이다. (메서드분리)
    // 이 메서드는 언제 어디에서 부른다 해도 index가 항상 0으로 초기화되고, 똑같은 배열을 사용하므로 위와 같은 실수가 절대 나지 않는다.
    public void printArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < array.length; index++) {
            System.out.print(index);
            index++;
        }
    }

    //짝수번째를 출력하고 싶다면, 다른 메서드를 만들어 변수를 격리시키기만 하면 된다. (하나의 메서드는 하나의 기능)
    public void printArrayEvenNumber() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int index = 0; index < array.length; index++) {
            System.out.print(index);
            index++;
            index++;
        }
    }

}
