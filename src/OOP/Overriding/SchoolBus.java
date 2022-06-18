package OOP.Overriding;

import OOP.inheritance.Car;

public class SchoolBus extends Car {

    @Override
    public void drive(String owner) {
        /* 스쿨버스는 학생들과 함께합니다. */
        System.out.println("SchoolBus drives with students");
        super.drive(owner);
    }

    /*@Override
    public void drive(String owner) throws RuntimeExcetption{
        *//* 스쿨버스는 학생들과 함께합니다. *//*
        System.out.println("SchoolBus drives with students");
        super.drive(owner);
    }*/
}
