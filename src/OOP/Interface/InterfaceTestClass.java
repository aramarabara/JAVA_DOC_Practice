package OOP.Interface;

public class InterfaceTestClass implements InterfaceTest, InterfaceTest2, InterfaceTest3 {
    @Override

    /*메서드 구현을 강제할 수 있다.
    * 인터페이스를 implement로 상속받으면, 추상메서드를 반드시 Override해서 선언해야 한다.
    * */
    public void iDontHaveAnyContent() {
        // 이때 선언부의 ReturnType이 중요하다.
        System.out.println("Override해서 새로운 내용을 만듭니다. ");
    }


    /*
    * 인터페이스는 다중상속이 가능하다. 상속받은만큼 필수요소만 구현하면 된다.
    * */
    @Override
    public void iDontHaveAnyContent2() {
        System.out.println("Override해서 새로운 내용을 만듭니다. ");
    }

    @Override
    public void iDontHaveAnyContent3() {
        System.out.println("Override해서 새로운 내용을 만듭니다. ");
    }
}
