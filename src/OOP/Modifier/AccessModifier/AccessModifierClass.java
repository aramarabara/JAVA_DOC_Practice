package OOP.Modifier.AccessModifier;

public class AccessModifierClass {

    /*
    * 접근 제한자는 객체들간의 접근을 막기 위해서
    *
    * 즉, 캡슐화(Encapsulation)를 구현하기 위해서 사용된다.
    * */

    /*1. 모두가 접근할 수 있게 하기 위해서는 public 을 사용한다.
    *
    * */
    public void iamPublic() {
        System.out.println("anyone can access to me!");
    }

    /*
    * 2. 클래스 내부에서만 접근할 수 있게 하기 위해서는 private을 선언한다.
    *
    * 이 메서드를 부르려면 접근가능한 다른 클래스 내부 메서드가 불러주어야 한다.
   * */
    private void iamPrivate() {
        System.out.println("only I can access to me");
    }
    public void callPrivateMethod() {
        System.out.println("I call prviate Method");
        iamPrivate();
    }

    /*
    * 3. 확장을 고려하여 (나중에 새로운 자손이 생겨 필드+기능이 늘어날 것을 고려하여 ) protected로 선언한다.
    *
    * */

    protected void iamProtected() {
        System.out.println("oneday I'll have more value and functions..");
    }

    /*
    * 4. default : 자손 + 같은 패키지에서만 쓸 수 잇다.
    * */
    /* 생략 */


    /*
    * 단순 메서드 뿐만 아니라, 변수에도 이렇듯 접근을 제한시킬 수 있다.
    * */




}
