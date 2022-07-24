package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder;

import EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.BuilderExample.NutritionFactsUseBuilderPattern_Example;

import javax.swing.*;

public class main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        // 1. 생성자로 호출하는 방법

        // Nutrition fact를 이렇게 호출하려면 필요없는 값은 0을 넣어주어야 한다.
        // 만일 매개변수가 10~20개를 넘는다면 엄청나게 많은 값들을 일일히 넣고, 가독성도 엄청나게 떨어진다.
        A_ExampleCode.NutritionFacts nutritionFacts = new A_ExampleCode.NutritionFacts(100, 0, 0, 0, 10, 10);


        // 2. JavaBeans Pattern으로 호출하는 방법

        // 가독성이 더 좋아지고 모든 매개변수의 경우의 수에 관한 값을 넣어주지 않아도 되어 더 유연해졌다.
        // 그러나, 객체가 생성된 이후 값이 들어가므로, 멀티쓰레드 환경에서는 객체의 불변성 (Conssistancy)을 보장하지 못한다.
        A_ExampleCode.NutritionFactsJavaBean nutritionFactsJavaBean = new A_ExampleCode.NutritionFactsJavaBean();
        nutritionFactsJavaBean.setServingSize(100);
        nutritionFactsJavaBean.setServings(0);
        nutritionFactsJavaBean.setCalories(0);
        nutritionFactsJavaBean.setFat(0);
        nutritionFactsJavaBean.setSodium(10);
        nutritionFactsJavaBean.setCarbohydrate(10);


        // 3. JavaBeans Pattern에 Freeze 기능을 추가하는 방법
        A_ExampleCode.NutritionFactsJavaBeanUseFreezing freezedObject = new A_ExampleCode.NutritionFactsJavaBeanUseFreezing();
        freezedObject.setCalories(100);
        freezedObject.setServingSize(10);
        freezedObject.setServings(10);
        freezedObject.setFat(10);
        freezedObject.setSodium(10);
        freezedObject.setCarbohydrate(10);
        freezedObject.freeze();

        // .....


        // 사용할 때 isFrozen을 호출해서 완전한 객체인지를 점검
        // 만약 isFrozen 호출 시 null이라면, ( 완성되지 않았다면 ) 완성되지 않은 객체라는 Exception을 던진다.
        if(!freezedObject.isFrozen()){
            throw new UnsupportedLookAndFeelException("완성되지 않은 객체입니다.");
        }

        // 3. BuilderPattern
        // 멀티쓰레드 환경에서 객체 불변성을 보장한다. 필수 값들이 모두 Setting된 후 객체를 Build 하므로 값이 뒤바뀔 염려가 없다.
        // fluent API, 혹은 메서드 연쇄 (method Chaining) 이라고 부른다.
        NutritionFactsUseBuilderPattern_Example useBuilderObject = new NutritionFactsUseBuilderPattern_Example
                .Builder(100, 10, 10, 10, 10, 10).calories(100).build();

        //Build 가 완성된 다음 객체를 활용할 수 있게 되기 때문에, Thread Safe 하다.

        // ** 그러나 의문, 원래도 보통 JavaBeans Pattern은 new 예약어를 통해서 새 객체를 만들기 때문에, 값 뒤바뀜 현상이 일어나기 힘든데
        // 어떤 경우에 Thread-safe가 풀리는가? 왜 JavaBeans Pattern은 thread-safe하지 않은가?




    }

}
