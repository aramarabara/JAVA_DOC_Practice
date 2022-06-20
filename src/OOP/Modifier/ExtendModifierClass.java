package OOP.Modifier;

public class ExtendModifierClass extends ModifierTest {

    // 파이널 메서드라는 경고와 함께 Override가 불가하다.
    /*public final void immutableMethod() {
        // 오버라이드가 불가하다.
    }*/

    // 만약 내부에서 사용한다면 super 예약어를 통해 상위 클래스의 메서드를 직접 호출해야한다.
    public void callImmutableMethod() {
        super.immutableMethod();
    }


}
