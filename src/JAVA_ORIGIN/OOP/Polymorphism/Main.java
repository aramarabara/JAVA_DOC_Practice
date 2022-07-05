package JAVA_ORIGIN.OOP.Polymorphism;

import java.util.Map;

public class Main {
    // 다형성 (Polymorphism) 실험
    public static void main(String[] args) {

        Car car = new Car(); // 차량을 생성합니다.

        //Map car2 = new Car(); 이렇게 하면 컴파일 오류가 발생합니다.
        Map car2 = (Map) new Car(); // 이렇게 하면 오류가 발생하지 않습니다.

        Machine car3 = new Car(); // 이렇게 하면 오류가 발생하지 않습니다.


        Object object = car; // Object 타입으로 차량을 변환합니다.
        Machine machine = car; // Machine 타입으로 차량을 변환합니다.
        Car newCar = car; // Car 타입으로 차량을 변환합니다.

        Machine newMachine = new Machine();

        //Car polyCar = newMachine; // 오류가 발생합니다.
        // 강제 형변환 시에는 runtime 오류가 발생하기 때문에 더 심각합니다.

        Car polyCar = (Car)newMachine;

        //미리 형변환을 알아보기 위해서 InstanceOf()를 사용한다.
        // InstanceOf는 연산자이므로, 타입과 같이 연산하여
        // 접근가능한 인스턴스라면 true, 아니면 False 처리한다.

        boolean instanceTf = object instanceof Car;
        System.out.println(instanceTf);

        /*컴파일 오류*/
        /*instanceTf = machine instanceof HashMap;*/
        /*System.out.println(instanceTf);*/

        // 모든 매개변수의 타입이 가능
        polyCar.polymorphismInMethod(object);

        // 선언된 Machine 매개변수는 가능
        polyCar.polymorphismInMethod2(newMachine);
        // 자식클래스인 Car 역시 가능
        polyCar.polymorphismInMethod2(car);

        // 반대는 불가능, 범위가 더 넓기 때문에 강제 형변환 ()을 통해 보내야 한다.
        polyCar.polymorphismInMethod3((Car)machine);


    }






}
