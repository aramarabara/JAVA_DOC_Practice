package OOP;

// 이름을 DriveCarInBusan으로 짓는다면 부산에서 차를 모는 과정을
// 시뮬레이션 할 수 있습니다.

public class DriveCarInBusan {

    //main이라고 하는 메서드를 통해서 상황을 실행시켜 볼 수 있습니다.
    public static void main(String[] args) {

        // 자동차의 속성을 먼저 묘사합니다.
        String name = "부릉이";
        String brand = "현대자동차";
        String owner = "고길동";
        String color = "빨간색";

        // 이후 자동차가 달리고, 자동주행하고, 멈추고, 주차하는 과정을 묘사합니다.
        System.out.println(owner + "drives" + brand);
        System.out.println(name + " autopilot activated");
        System.out.println(color + " car stopped");
        System.out.println(name + " car parked");
    }

}