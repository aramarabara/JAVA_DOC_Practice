package JAVA_ORIGIN.OOP.Overriding;

import JAVA_ORIGIN.OOP.inheritance.Car;

public class PoliceCar extends Car {

    @Override
    public void drive(String owner) {
        /* 경찰차는 경찰과 함께합니다.  */
        System.out.println("policeCar drives with policeman");
        super.drive(owner);
    }

    /*@Override
    public void drive(String owner) throws RuntimeExcetption{
        *//* 경찰차는 경찰과 함께합니다.  *//*
        System.out.println("policeCar drives with policeman");
        super.drive(owner);
    }*/
}
