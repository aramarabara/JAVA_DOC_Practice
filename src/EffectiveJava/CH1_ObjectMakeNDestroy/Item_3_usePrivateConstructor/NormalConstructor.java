package EffectiveJava.CH1_ObjectMakeNDestroy.Item_3_usePrivateConstructor;

public class NormalConstructor {

    private String name;
    private String color;
    private String shape;

    /*
    * 일반적인 점층적 생성자 패턴
    * Overloading 사용을 통해 매개변수 별 생성자를 다르게 만든다.
    *
    * */
    NormalConstructor(String name) {
        this.name = name;
        this.color = color;
        this.shape = shape;
    }

    NormalConstructor(String name, String color) {
        this.name = name;
        this.color = color;
        this.shape = shape;
    }

    NormalConstructor(String name, String color, String shape) {
        this.name = name;
        this.color = color;
        this.shape = shape;
    }


}
