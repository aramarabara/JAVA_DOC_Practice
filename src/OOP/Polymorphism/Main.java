package OOP.Polymorphism;

public class Main {

    // 다형성 (Polymorphism) 실험

    Car car = new Car();

    Object object = car;
    Machine machine = car;
    Car newCar = car;

    Machine newMachine = new Machine();
    /*형변환 오류 발생*//*
    Car polyCar = newMachine;
    */
    Car polyCar = (Car)newMachine;






}
