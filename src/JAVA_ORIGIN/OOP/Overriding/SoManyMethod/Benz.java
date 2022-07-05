package JAVA_ORIGIN.OOP.Overriding.SoManyMethod;

public class Benz extends Car {

    public void turn100(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle);
    }

    /*
    * 그런데, 여기서 한 글자만 바꾸고 싶다.
    * 그러면 두 가지 방법이 있다.
    * */


    /*
     * 1. 자식에게 메서드를 만든다.
     *
     * 코드 재사용성이 떨어지고, 여기서만 사용하게 된다.
     * 같은 기능에 perfectly 만 바뀌었으나, 메서드를 새로 만들어주는 수밖에 없다.
     *
     */
    public void turn101InChild(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle + "perfectly");
    }


    /*
    * 2. 부모에게 메서드를 만든다.
    *
    * 부모에게 Turn101 메서드를 만드는데,
    * 같은 기능에 perfectly 만 바뀌었으나, 역시 메서드를 새로 만들어주는 수밖에 없다.
    *
    * */

    /*
    * 아주 작은 수정에도 메서드갯수가 계속 늘어나는 문제가 있다.
    * */

    /*
    * 이때는, 같은 기능을 하지만, 살짝 바꿔줄 수 잇는 Override라는 기능을 활용하여 100개가 있다면 1개의 예외를 만들면 된다.
    * *
     */
    @Override
    public void turnOverride(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle);
    }


}
