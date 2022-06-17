package OOP.Overriding;

import OOP.inheritance.Car;

public class PoliceCar extends Car {

    @Override
    public void drive(String owner) {
        /* 경찰차는 경찰과 함께합니다.  */
        System.out.println("policeCar drives with policeman");
        super.drive(owner);
    }
}
