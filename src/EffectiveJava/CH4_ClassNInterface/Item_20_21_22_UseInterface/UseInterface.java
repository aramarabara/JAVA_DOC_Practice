package EffectiveJava.CH4_ClassNInterface.Item_20_21_22_UseInterface;

public interface UseInterface {

    // 20, 추상클래스는 단일상속만 되므로 확장성이 떨어진다.
    // 인터페이스를 사용하여 다중상속의 이점을 누리자.

    // 21. Default. 메서드는 유용하지만 불변식을 헤친다
    // 기존 Interface가 새로 삽입된 Default의 존재를 모르기 때문에, 어떤 오류가 발생할지 모른다.
    // 항상 신중하게 구현해야 한다
    // ** Collection의 removeIf > SynchronizedCollection 클래스는 이 메서드의 존재를 모른다 .
    // 동기화 불가능

    // 22, 인터페이스는 공개되므로 상수 인터페이스 등을 사용하지 말라

    // 아보가드로 수 (1/몰 )
    public static final double AVOGADROS_NUMBER = 6.022_140_857e23;
    // 볼츠만 상수 (JfK)
    public static final double BOLTZMST = 1.380_648_52e-23;
    // 전자 질량 (kg)
    public static final double ELECTRI_MASS = 9.109_383_56e-31;
}
