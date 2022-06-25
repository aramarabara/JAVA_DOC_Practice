package OOP.Interface.Abstract;

public abstract class Machine {

    public String owner;

    public abstract void use();

    public void drive(String owner) {
        System.out.println("Machine drives with " + owner);
    }

    public void turn(String direction, String angle) {
        System.out.println("Machine turns to " + direction + " and " + angle + "slightly");
    }

    public void turnOverride(String direction, String angle) {
        System.out.println("Machine turns to " + direction + " and " + angle + "slightly");
    }

}
