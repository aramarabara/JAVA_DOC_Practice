package JAVA_ORIGIN.OOP.Overriding;

import JAVA_ORIGIN.OOP.inheritance.CarComponent.CarSheet;
import JAVA_ORIGIN.OOP.inheritance.CarComponent.Engine;
import JAVA_ORIGIN.OOP.inheritance.CarComponent.Wheel;

public class ThrowableCar {

    // 차는 "엔진 회전수"를 속성으로 가집니다.
    String bpm;
    // 차는 "자동차 바퀴 갯수"를 속성으로 가집니다.
    int numberOfTire;
    // 차는 "주행거리"를 속성으로 가집니다.
    long distanceDriven;

    // 변수가 아닌 Class를 통해서 차와 - 부품들의 Has-a 관계를 묘사합니다.
    // 클래스는 다른 클래스를 "속성"으로 가질 수 (HAS-A) 있습니다.
    CarSheet carSheet = new CarSheet();
    Engine engine = new Engine();
    Wheel wheel = new Wheel();


    public void drive(String owner) throws Exception{
        //차는 "운전할 수 있는" 기능이 있습니다.
        System.out.println(owner + "drives the car");
    }
    public void useAirConditioner(String bpm) {
        //차는 "에어컨을 돌릴 수 있는" 기능이 있습니다.
        System.out.println("car use AirConditioner with his " + bpm + "bpm Engine");
    }


}
