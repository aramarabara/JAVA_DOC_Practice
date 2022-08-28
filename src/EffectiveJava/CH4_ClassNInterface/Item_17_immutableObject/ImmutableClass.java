package EffectiveJava.CH4_ClassNInterface.Item_17_immutableObject;

import EffectiveJava.CH1_ObjectMakeNDestroy.Item_1_useStaticFactoryMethod.Car;

import java.math.BigInteger;

public class ImmutableClass {

    public static void main(String[] args) {

        // BigIntegar Class, 불변객체를 사용한다.
        BigInteger it = BigInteger.valueOf(100);

        // 불변 객체는 정적 팩터리 메서드를 사용하면 상속을 막으면서 가독성 있게 생성할 수 있다.
        // CH1에 나왔던 정적 팩터리 메서드.
        Car car6 = Car.carWithNameNWheel("Deisy", 4);

        //성능을 위해 지연초기화 방식으로, 비용이 큰 final 필드는 나중에 초기화 하여 만들 수 있다
        it.hashCode();

        // 불변 객체는 실패 원자성을 지닌다.
        // 실패 원자성 : 예외 혹은 에러가 발생해도 불완전한 객체가 만들어지지 않음

    }


}
