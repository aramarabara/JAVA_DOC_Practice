package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder;

public class main {

    public static void main(String[] args) {

        // Nutrition fact를 이렇게 호출하려면 필요없는 값은 0을 넣어주어야 한다.
        // 만일 매개변수가 10~20개를 넘는다면 엄청나게 많은 값들을 일일히 넣고, 가독성도 엄청나게 떨어진다.
        A_ExampleCode.NutritionFacts nutritionFacts = new A_ExampleCode.NutritionFacts(100, 0, 0, 0, 10, 10);




    }

}
