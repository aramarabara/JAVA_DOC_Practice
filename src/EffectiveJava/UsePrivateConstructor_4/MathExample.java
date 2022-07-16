package EffectiveJava.UsePrivateConstructor_4;

public class MathExample {

    // Math class는 처음부터 Static으로 선언되어 있다.
    // Math는 private으로 instance화가 막혀있으며, 클래스를 분류하기 위하여 존재한다.

    // Math math = new Math(); 이렇게 생성하면 오류가 발생한다.

    double random = Math.random();

}
