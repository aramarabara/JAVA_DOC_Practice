package EffectiveJava.CH1_ObjectMakeNDestroy.Item_6_7_objectCreateNDestroy;

public class A_ExampleCode {

    // 불필요한 객체 생성을 피하라

    // 객체를 이미 만들어서 String 객체에 넘겨주고 있다.
    String s = new String("bikini");

    // 개선된 버전
    String s2 = "bikini";
    // 하나의 인스턴스를 사용한다, 또한 이 객체를 사용하는 모든 코드가 같은 객체를 사용함이 보장된다.

    // 정적 팩토리 메서드는 불필요한 객체 생성을 예방한다
    Boolean bool = Boolean.valueOf("true");



}
