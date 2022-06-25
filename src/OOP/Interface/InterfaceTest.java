package OOP.Interface;

/*
* 인터페이스는 interface 로 명시된다.
* 아주 높은 추상화 정도를 가진다, 즉 내용이 거의 없다.
* 어떻게 만들건지에 대한 대략적인 정보만 있다.
* */
public interface InterfaceTest {

    public static final String name = "Interface";// 인터페이스에서는 상수만 선언할 수 있다.
    /*
    * 1. 내용을 가진 메서드는 선언이 불가하다.
    * 빨간줄을 통해서 Compile 에러 발생
    * */
    /*  public void iHaveContent() {
        system.out.println("나는 내용이 있습니다.. " )
    }*/

    /*
    * 2. 내용이 없는 추상메서드는 선언이 가능하다.
    * {}가 있어서는 안된다.
    * */
    public abstract void iDontHaveAnyContent();


}
