package EffectiveJava.CH1_ObjectMakeNDestroy.Item_6_7_objectCreateNDestroy;

import EffectiveJava.ExampleCode.RomanNumbers;

import java.time.Instant;

public class A_ExampleCode {

    public static void main(String[] args) {

        // 불필요한 객체 생성을 피하라

        // 객체를 이미 만들어서 String 객체에 넘겨주고 있다.
        String s = new String("bikini");

        // 개선된 버전
        String s2 = "bikini";
        // 하나의 인스턴스를 사용한다, 또한 이 객체를 사용하는 모든 코드가 같은 객체를 사용함이 보장된다.

        // 정적 팩토리 메서드는 불필요한 객체 생성을 예방한다
        Boolean bool = Boolean.valueOf("true");

        // 생성 비용이 비싼 객체를 재사용할 수 있다.
        // ** 정규표현식 Pattern 인스턴스는 유한 상태 머신 (finite state machine) 을 만들기 때문에 인스턴스 생성 비용이 높다
        // ** 예를 들어, (\d)+  (Number)을 찾는 정규표현식의 경우 있다면 값을 반환, 없다면 반환하지 않는 형태로
        // 여러 상태를 가지기 때문에 FSM으로 전환될 수 있다.
        // 이렇게 정규표현식 인스턴스는 각 상태에 대해서 유한한 조건의 경우의 수를 모두 가지고 있어야 하기 때문에 생성비용이 매우 높다
        String string = "12;44";
        long curtime = Instant.now().toEpochMilli();
        System.out.println(Instant.now());
        for (int i = 0; i < 1000; i++) {
            boolean isRoman = string.matches("^(?=. )M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3}) (I[XV] |V?I{0,3})$");
        }
        long curtime2 = Instant.now().toEpochMilli();

        System.out.println("1. 인스턴스를 100번 만들 때 걸리는 시간 : " + (curtime2 - curtime));


        // static 객체로 만들어진 특정 상황에 대한 정규표현식 객체를 불러 재사용한다
        long curtime3 = Instant.now().toEpochMilli();
        System.out.println(Instant.now());
        for (int i = 0; i < 1000; i++) {
            RomanNumbers.isRomanNumber(string);
        }
        long curtime4 = Instant.now().toEpochMilli();

        System.out.println("2. 인스턴스를 100번 재사용 할 때 걸리는 시간 : " + (curtime4 - curtime3));
        System.out.println("\r\n결과 : 약 6배 차이가 난다");

        // Boxing Type을 잘못 사용하면 새로 객체가 계속 생성될 수 있으므로 주의해야 한다.
        // 1. Boxing 사용
        long curtimeWithBoxing = Instant.now().toEpochMilli();
        for (long i = 0; i < 1000000; i++) {
            Long res =+ i;
        }
        long curtimeWithBoxing2 = Instant.now().toEpochMilli();
        System.out.println();
        System.out.println("3. Boxing 사용 걸린 시간 : " + (curtimeWithBoxing2 - curtimeWithBoxing));
        // 2. Boxing 사용 안함

        long curtimeWithoutBoxing = Instant.now().toEpochMilli();
        for (long i = 0; i < 1000000; i++) {
             long res =+ i;
        }
        long curtimeWithoutBoxing2 = Instant.now().toEpochMilli();
        System.out.println("4. Boxing 사용 안함 걸린 시간 : " + (curtimeWithoutBoxing - curtimeWithoutBoxing));

        System.out.println("\r\n결과 : 측정할 수 없을만큼 엄청나게 차이난다");

    }


}
