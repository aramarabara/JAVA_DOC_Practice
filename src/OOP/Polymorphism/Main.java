package OOP.Polymorphism;

import org.graalvm.compiler.serviceprovider.IsolateUtil;
import sun.util.resources.ext.CalendarData_sr_Latn_RS;

import java.util.HashMap;

public class Main {
    // 다형성 (Polymorphism) 실험
    public static void main(String[] args) {
        Car car = new Car();

        Object object = car;
        Machine machine = car;
        Car newCar = car;

        Machine newMachine = new Machine();
        /*형변환 오류 발생*//*
        Car polyCar = newMachine;
        */
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
