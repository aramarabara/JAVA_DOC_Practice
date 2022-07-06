package EffectiveJava.MakeNDestroy;

public class Car {

    private String name;
    private String ownerName;
    private String builderName;

    private int wheels;

    //Constructor with Parameter
    // 나는 이름이 없는 자동차를 만들지 못하게 하고 싶다.
    // 기본 생성자는 만들어지지 않는다.
    public Car(String name) {
        this.name = name;
    }

    // 이름과 주인이름을 넣게 하고 싶다.
    public Car(String name, String ownerName) {
        this.name = name;
        this.ownerName = ownerName;
    }

    // 이름과 주인이름을, 만든이의 이름을 넣게 하고 싶다.
    public Car(String name, String ownerName, String builderName) {
        this.name = name;
        this.ownerName = ownerName;
        this.builderName = builderName;
    }

    public Car(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }


    //Static Factory Method
    public static Car CarNOwnerNBuilder(String name, String ownerName, String builderName) {
        return new Car(name, ownerName, builderName);
    }

    public static Car carWithNameNWheel(String name, int wheels) {
        return new Car(name, wheels);
    }


}
