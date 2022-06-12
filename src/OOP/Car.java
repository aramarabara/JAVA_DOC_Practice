package OOP;


/**
 * JAVA의 객채지향
 * 출처 : https://objeto.tistory.com/10
 */
public class Car {
    // 자동차의 속성을 묘사합니다.
    String name = "부릉이";
    String brand = "현대자동차";
    String owner = "고길동";
    String color = "빨간색";

    // 이후 자동차가 달리고, 자동주행하고, 멈추고, 주차하는 과정을 묘사합니다.
    public void driveTheCar() {
        System.out.println(owner + "drives" + brand);
        System.out.println(name + " autopilot activated");
        System.out.println(color + " car stopped");
        System.out.println(name + " car parked");
    }

}
