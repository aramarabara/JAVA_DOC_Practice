package JAVA_ORIGIN.OOP.Modifier;

public class ModifierTest {

    /*
    * Reflect를 통해서 각 Class, 변수, 메서드 등의 Modifier를 가져올 수 있다.
    *
    * Modifier의 정의 : 클래스-변수-메서드의 선언부에 함께 사용되어 부가적인 의미를 부여하는 예약어
    *
    * */

    /*
    * 1. Static : 한번 실행된 후 인스턴스를 메모리에 계속 남겨둔다.
    * 이후에는 같은 메서드를 계속 호출하게 되어 캐싱(Caching)처리를 통한 속도향상, 비용이 큰 객체를 절약할 수 있다.
    * */
    public static int staticInt = 1;

    /*
    * 2. final : 클래스-메서드-변수를 변경하지 못하게 한다.
    * 클래스는 자손 정의(extend, 즉 확장) 불가, 메서드는 오버라이딩 불가, 변수는 변경불가능한 상수가 된다.
    * */

    public final int immutableNumber = 2;

    public final void immutableMethod() {
        // 오버라이드가 불가하다.
    }






}
