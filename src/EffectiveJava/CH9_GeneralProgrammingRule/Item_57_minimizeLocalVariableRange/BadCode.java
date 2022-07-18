package EffectiveJava.CH9_GeneralProgrammingRule.Item_57_minimizeLocalVariableRange;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class BadCode {

    public static void main(String[] args) {

        // 변수를 위로 끌어올려 한 번에 선언하고 있다.
        // 어떤 변수가 쓰이는지 한눈에 볼 수 있지만, 결국 어떤 메서드에 쓰이는지는 명확하지 못하다.
        int coverage = 1245;
        int year = 2020;
        double price = 1234.5678;
        long current = System.currentTimeMillis();
        int index = 0;

        int[] listArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
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

        Iterator i = list.iterator();
        for(; i.hasNext();) {
            System.out.println(i.next());
        }

        // 현재 우리가 필요한 것은 똑같은 코드, index 변수를 통해 array라는 배열을 012345678910으로 출력하는 것이다.
        // 그러나 여기에 쓰이는 index가 무엇인지, array가 무엇인지 너무나 불분명하다.
        // 계속 위로 올려가며 확인해야 한다..
        while ( index <= array.length ) {
            System.out.print(index);
            index++;
            index++;
        }


        // 설상가상으로 이 밑쪽에 수많은 코드들이 한번 더 실행되고, 그 이후에 비슷한 메서드를 복사 붙여넣기 한다 생각해보자.
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

        Iterator i2 = list.iterator();
        for(; i2.hasNext();) {
            System.out.println(i2.next());
        }

        // 똑같은 배열의 짝수를 출력하지만, 역시 실수로 index의 초기화를 놓치기 너무나도 쉽다.
        // 이는 실행시켜야 의도하지 않은 결과가 표시되기 때문에, 오류를 조기에 발견하기 어렵게 된다.
        while ( index <= array.length ) {
            System.out.print(index);
            index++;
            index++;
        }

    }

}
