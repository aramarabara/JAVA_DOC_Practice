package OOP.inheritance;

/**
 * 물건을 묘사하는 "객채" 입니다.
 */
public class Thing {

    // 물건은 "모양" 속성을 가집니다.
    String shape;
    // 물건은 "색" 속성을 가집니다.
    String color;
    // 물건은 "주인" 속성을 가집니다.
    String owner;

    public void touchThing() {
        // 누군가가 "만질 수 있는" 기능이 있습니다.
        System.out.println("touch");
    }
    public void useThing() {
        // 누군가가 "사용할 수 있는" 기능이 있습니다.
        System.out.println("use");
    }

}
