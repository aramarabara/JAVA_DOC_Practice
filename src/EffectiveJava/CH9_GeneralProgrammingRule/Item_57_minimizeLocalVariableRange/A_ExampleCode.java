package EffectiveJava.CH9_GeneralProgrammingRule.Item_57_minimizeLocalVariableRange;

public class A_ExampleCode {

    public static void main(String[] args) {

        // 이 배열을 활용하여 숫자를 간단하게 출력하는 기능을 만들어보자.
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // index라는 변수를 이용하여 array의 값을 차례대로 출력한다.
        int index = 0;
        while ( index <= array.length ) {
            System.out.print(index);
            index++;
        }


        System.out.println("\r\n-----------------------------------------------------");
        // 누군가 같은 기능을 개선하기 위해, 코드를 복사 붙여넣기하여 수정한다.
        // 인덱스를 2씩 늘려 짝수번째의 값을 출력하도록 의도하였다.
        while ( index <= array.length ) {
            System.out.print(index);
            index++;
            index++;
        }

        // 이 사람이 예상하는 결과는 아래와 같다.
        // 첫번째 줄 : 012345678910
        // 두번째 줄 : 0246810

        // 실제 실행 결과는 아래와 같다.
        // 첫번째 줄 : 012345678910
        // 두번째 줄 : 나오지 않음!

        // index라는 변수가 처음의 0 값으로 되돌려지지 못하고 다시 사용되어서 문제가 발생하였다.

    }
}
