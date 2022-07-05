package JAVA_ORIGIN.OOP.Overriding.SoManyMethod;

public class Toyota extends Car {

    /*
    * 같은 기능을 하면서도 살짝 다른 메서드를 만들 수 있다.
    *
    * 이러면 다른 메서드에 영향도 없고, 코드 재사용성이 떨어지지 않는다.
    *
    * 갑작스런 기능변경이 있을 시에 이런식으로 변경해주고, 나중에 기능을 정리하거나 리팩토링 할 시에
    * 지워주면 아무런 손상이 발생하지 않고, 부모클래스에 영향을 주지   않는다.
    *
    * 너무 남발한다면 결국 설계만 남아있는 코드로, 개별 개발자들이 일일히 코드를 다 짜야하는 문제가 생긴다.
    * Overriding 시에도 꼭 중복 제거, 재사용성, 신뢰성 있는 코드를 만들어야 함을 알아야 한다.
    * */
    @Override
    public void turnOverride(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle + "slightly");
    }



}

