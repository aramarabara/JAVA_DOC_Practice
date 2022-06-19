package EffectiveJava;

public class Main {

    public static void main(String[] args) {

        /*
        * 1. 일반적인 점층적 생성자 패턴
        * (IDE의 도움을 받지 않는다면) 매개변수 의미를 파악하기 어렵고 변수가 많아질 때마다 가독성이 저하된다.
        * */
        NormalConstructor normal = new NormalConstructor("normal");
        NormalConstructor normal2 = new NormalConstructor("normal", "red");
        NormalConstructor normal3 = new NormalConstructor("normal", "red", "rectangle");


        /*
        * 2. JavaBean 객체
        * Setter를 통해 만듬으로써 매개변수 의미파악이 빠르다.
        * 그러나, 객체의 일관성이 무너진다 ( 즉, 필수값이 들어가지 못할 수 있다.
        * 이 경우에는 컴파일 오류 없이 런타임에서 잡아내야 한다 )
        *
        * */
        JavaBean bean = new JavaBean();
        bean.setName("normal");
        bean.setColor("red");
        bean.setShape("rectangle");

        /*
        * 3. Builder Pattern 객체
        *
        * 일관성( 필수요소 반드시 포함 ) 을 확보한다.
        * 또한 만들어진 이후에 불변이며 가독성 좋다.
        * named Optional Parameters를 흉내낸 패턴이다.
        *
        * 매개변수 갯수가 항상 일정할 경우 ( 또 적을경우 ) 빌터패턴보다는 생성자가 좋다.
        * 그러나 매개변수의 갯수는 증가할 수 있기 때문에 빌터패턴으로 전환되는 경우가 많아
        * 빌터패턴으로 만들어 두는 것이 보통 좋다.
        *
        * */
        NewBuilder newBuilder = new NewBuilder
                .Builder("builder", "red")
                .shape("rectangle")
                .build();



    }

}
