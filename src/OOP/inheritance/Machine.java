package OOP.inheritance;

/*
* 기계를 묘사하는 "객체"입니다.
* */
public class Machine extends Thing{

    //기계는 "동력원" 을 속성으로 가집니다.
    String energySource;
    // 기계는 "부품"을 속성으로 가집니다.
    String part;

    public void activate() {
        // 기계는 "작동할 수 있는" 기능이 있습니다.
        System.out.println("activated");
    }
    public void shutDown() {
        // 기계는 "멈출 수 있는" 기능이 있습니다.
        System.out.println("SHUTDOWN");
    }

}
