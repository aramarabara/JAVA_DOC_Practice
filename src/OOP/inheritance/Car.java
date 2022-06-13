package OOP.inheritance;

public class Car {

    // 차는 "엔진 회전수"를 속성으로 가집니다.
    String bpm;
    // 차는 "자동차 바퀴 갯수"를 속성으로 가집니다.
    int numberOfTire;
    // 차는 "주행거리"를 속성으로 가집니다.
    long distanceDriven;

    public void drive(String owner) {
        //차는 "운전할 수 있는" 기능이 있습니다.
        System.out.println(owner + "drives the car");
    }
    public void useAirConditioner(String bpm) {
        //차는 "에어컨을 돌릴 수 있는" 기능이 있습니다.
        System.out.println("car use AirConditioner with his " + bpm + "bpm Engine");
    }

}
