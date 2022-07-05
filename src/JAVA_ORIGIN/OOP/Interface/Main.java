package JAVA_ORIGIN.OOP.Interface;

public class Main {

    public static void main(String[] args) {

        // 혼자서는 Instance화가 불가능하다. 인터페이스는 상속을 받아서 구현하는 Class가 항상 필요하다.
        /*InterfaceTest test = new InterfaceTest();*/

        /*
        * 언어의 형용사와 같이 생각하면 쉽다. ~을 할 수 있는 등의 부가기능을 붙여준다.
        * */
        InterfaceTest test = new InterfaceTestClass();
        test.iDontHaveAnyContent();

    }
}
