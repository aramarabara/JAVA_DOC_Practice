package OOP;
public class DriveCarInSeoul {

    //main이라고 하는 메서드를 통해서 상황을 실행시켜 볼 수 있습니다.
    public static void main(String[] args) {

        // 자동차의 속성(특징) 묘사하는 변수를 만듭니다.
        // 이름, 브랜드, 주인, 색깔.. 원하는 속성(특징)은 몇 개든 묘사할 수 있습니다!
        String name = "부릉이";
        String brand = "현대자동차";
        String owner = "고길동";
        String color = "빨간색";

        // 자동차의 기능을 묘사하는 메서드를 만듭니다.
        // 달린다, 자동주행, 멈춰선다, 주차한다, 원하는 기능은 몇 개든 묘사할 수 있습니다!!

        // 앞서 만든 특징들을 활용하여 달리는 상황을 묘사할 수 있습니다.
        // 어떤 주인이 무슨 브랜드의 차를 모는지를 묘사합니다.
        System.out.println(owner + "drives" + brand);

        // 이 기능은 오토파일럿 기능이 실행됨을 묘사합니다.
        System.out.println(name + " autopilot activated");

        // 이 기능은 차의 색깔과 차가 멈추었다는 것을 묘사합니다.
        System.out.println(color + " car stopped");


        // 이 기능은 차가 주차되었음을 묘사합니다.
        System.out.println(name + " car parked");
    }

}
