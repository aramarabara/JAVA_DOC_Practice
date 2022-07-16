package EffectiveJava.UsePrivateConstructor_4;

public abstract class AbstractClass {

    // 단순히 abstract class를 만든다면, 상속해서 사용하라는 것으로 오해할 수 있다.

    // Private으로 막아버린다면 명시적으로 인스턴스화를 방지할 수 있다.
    // 반드시 주석을 남겨주는 것이 좋다.

    // 인스턴스 방지용 private Constructor
    private AbstractClass() {
        // 확실히 하기 위해서 역설적인 경우(말이 안되는 경우)를 나타내는 Assertion Error를 명시한다면 가독성도 챙길 수 있다.
        throw new AssertionError();
    }

    public static void staticMethod() {
        // static method
    }

}
