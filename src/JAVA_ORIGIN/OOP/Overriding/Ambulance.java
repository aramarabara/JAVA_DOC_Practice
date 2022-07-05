package JAVA_ORIGIN.OOP.Overriding;

import JAVA_ORIGIN.OOP.inheritance.Car;

public class Ambulance extends Car {

    /* 이제 MyCar은 "차" 라는 사물이자 기계입니다.
    * 사물과 기계의 속성을 모두 가져와서 사용할 수 있으며,
    * 그 기능도 모두 가져와서 사용할 수 있습니다.
    *
    *   */

    /*
    * "차" 의 기능인 drive를 빌려와서 사용할 수 있습니다.
    *
    * 이때, Override라는 기능을 사용하여 기능을 빌려오되, 세부사항을 수정할 수 있습니다.
    * (** 접근제한자, 반환타입, 메서드명 즉 선언부는 수정할 수 없습니다. )
    * 전체적인 구조는 같지만 기능을 시연하는 방법은 다양할 수 있습니다.
    *
    * */
    @Override
    public void drive(String owner) {
        /* 구급차는 응급 구조사와 함께합니다. drive라는 기능은 변하지 않으나 세부적인 사항이 추가되었습니다. */
        System.out.println("ambulance drive with  paramedics");
        super.drive(owner);
    }


    /*@Override
    public void drive(String owner) throws RuntimeException{
        *//* 구급차는 응급 구조사와 함께합니다. drive라는 기능은 변하지 않으나 세부적인 사항이 추가되었습니다. *//*
        System.out.println("ambulance drive with  paramedics");
        super.drive(owner);
    }*/

}
