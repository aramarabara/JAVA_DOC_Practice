package OOP.Overriding.SoManyMethod;

public class Car {

    public String owner;
    public String direction;
    public String angle;

    public void drive(String owner) {
        System.out.println("Car drives with owner: " + owner);
    }

    public void stop() {
        System.out.println("Car stops");
    }

    public void turn(String direction) {
        System.out.println("Car turns to " + direction);
    }

    public void turn2(String angle) {
        System.out.println("Car turns to " + angle);
    }

    public void turn3(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle);
    }

    public void turn4(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle);
    }

    public void turn5(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle);
    }

    /*
    * .. 이런 식으로 메서드가 한 100개 있다고 가정
    *
    * */

    public void turn100(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle);
    }

    public void turn101(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle + "perfectly");
    }

    /*
    * 이때는, 같은 기능을 하지만, 살짝 바꿔줄 수 잇는 Override라는 기능을 활용하여 100개가 있다면 1개의 예외를 만들면 된다.
    * *
     */
    public void turnOverride(String direction, String angle){

    };
}
