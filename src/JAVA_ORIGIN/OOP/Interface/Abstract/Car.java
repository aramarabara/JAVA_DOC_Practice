package JAVA_ORIGIN.OOP.Interface.Abstract;

// 상속관계가 항상 완벽하게 준비되어있지는 않다.
public class Car {

    public String owner;
    public String angle;
    public String direction;

    public void drive(String owner) {
        System.out.println("Car drives with " + owner);
    }

    public void turn(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle + "slightly");
    }

    public void turnOverride(String direction, String angle) {
        System.out.println("Car turns to " + direction + " and " + angle + "slightly");
    }

    public void use(){
        System.out.println("Car uses");
    }

}
