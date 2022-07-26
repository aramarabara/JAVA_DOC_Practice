package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder;

import EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.A_ExampleCode.*;

import javax.swing.*;

public class main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        // 1. 생성자로 인스턴스화 하는 방법
        // 장점 : 생성자는 멀티쓰레드 환경에서 일관성(Consistancy)를 보장한다. ( 완전히 인스턴스화 되기 이전 접근불가능 )
        // 단점 : 필요한 매개변수 값 외의 다른 값들을 초기화 해 주어야 한다.
        NutritionFacts facts = new NutritionFacts(240, 0, 0, 0);
        System.out.println("\n1. 생성자 패턴 결과" + facts.toString() + "\n");

        //----------------------------------------------------------------------------------------------------------------------

        // 2. 점층적 생성자 패턴 (Telescoping Constructor Pattern)으로 인스턴스화 하는 방법
        // 장점 : 미리 값을 초기화함으로써 사용자가 원하는 매개변수 값만을 넘겨주도록 한다.
        // ** 밑의 예시에서 다른 값들은 0으로 초기화 되어있다.
        NutritionFacts_Telescoping facts_Telescoping = new NutritionFacts_Telescoping(240);
        System.out.println("2. 점층적 생성자 패턴 결과 : " + facts_Telescoping.toString() + "\n");
        // 단점 : 같은 타입이 연속될 경우, 값이 뒤바뀌어도 구분하기 매우 어렵다.
        // ** ServingSize 뜻 : 제공량
        // ** Servings 뜻 : 1회 제공랑, 제공량을 넘을 수 없지만 실수로 바꿔 넣을경우 엉뚱한 코드가 된다. ( 개념적으로 맞지 않는 코드. 에러가능성이 매우 높다 )
        NutritionFacts_Telescoping facts_Telescoping2 = new NutritionFacts_Telescoping(10, 100);
        System.out.println("** 값이 뒤바뀔 경우");
        System.out.println("-총량은" + facts_Telescoping2.getServingSize() + "g" + "입니다.");
        System.out.println("-1회 제공량은" + facts_Telescoping2.getServings() + "g" + "입니다.");

        // ----------------------------------------------------------------------------------------------------------------------

        // 3. JavaBeans Pattern으로 인스턴스화 하는 방법

        // 장점 : 가독성이 더 좋아지고 모든 매개변수의 경우의 수에 관한 값을 넣어주지 않아도 되어 더 유연해졌다.
        NutritionFacts_JavaBeans facts_JavaBeans = new NutritionFacts_JavaBeans();
        //facts_JavaBeans.setFat(0), set하지 않아도 0으로 초기화되도록 코드가 구현되어 있다.
        facts_JavaBeans.setServingSize(240);
        facts_JavaBeans.setServings(8);
        facts_JavaBeans.setCalories(100);

        // 단점 : 객체가 생성된 이후 값이 들어가므로, 멀티쓰레드 환경에서는 객체의 일관성(Consistancy)을 보장하지 못한다.
        // ** 멀티쓰레드 환경 테스트 필요 



        // 4. JavaBeans Pattern에 Freeze로 인스턴스화 하는 방법
        // 객체가 완성되기 전에는 얼리는 방법으로(freezing) 멀티쓰레드 환경에서의 일관성(Consistancy)을 보장할 수 있다.

        NutritionFacts_Freezing freezed = new NutritionFacts_Freezing().freeze(100, 8, 240, 100);
        freezed.setServingSize(100);
        freezed.setServings(8);
        freezed.setCalories(240);
        freezed.setFat(100);

        // 먼저 객체를 Constructor를 통해 생성하고, freezed Method를 통하여 반환한다.
        // 이후 반환된 Constructor와 setter를 통해 만들어진 객체가 같은 상황에만 초기화 성공시켜 객체를 통과시킨다.
        // 장점 : Javabeans Pattern의 단점을 극복할 수 있고, 가독성과 멀티쓰레드 안정성을 동시에 확보할 수 있다.
        if(freezed.isFrozen(freezed)) {
            System.out.println("초기화 실패");
        } else {
            System.out.println("초기화 성공");
        }

        // 단점 : 복잡하며, 주석이 없다면 freeze Method가 있다는 것을 이해할 수 없고 freeze method 없이 setter만으로 객체를 초기화하는 것을 막지못한다.


        // 4. Builder Pattern으로 인스턴스화 하는 방법
        // 장점 : 멀티쓰레드 환경에서 객체 불변성을 보장한다. 필수 값들이 모두 Setting된 후 객체를 Build 하므로 값이 뒤바뀔 염려가 없다.
        // ** fluent API, 혹은 메서드 연쇄 (method Chaining) 이라고 부른다.
        NutritionFacts_Builder useBuilderObject = new NutritionFacts_Builder.Builder(100, 100, 199, 100).build();
        //Build 가 완성된 다음 객체를 활용할 수 있게 되기 때문에, Thread Safe 하다.

        // ** 그러나 의문, 원래도 보통 JavaBeans Pattern은 new 예약어를 통해서 새 객체를 만들기 때문에, 값 뒤바뀜 현상이 일어나기 힘든데
        // 어떤 경우에 Thread-safe가 풀리는가? 왜 JavaBeans Pattern은 thread-safe하지 않은가?




    }



}
