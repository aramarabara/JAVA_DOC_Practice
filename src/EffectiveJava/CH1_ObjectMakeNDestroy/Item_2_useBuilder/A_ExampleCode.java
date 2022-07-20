package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder;

public class A_ExampleCode {

    /**
     * 영양소 정보를 받는 클래스
     */
    public static class NutritionFacts {
        private final int servingSize; // (제공량)
        private final int servings; // (1회 제공랑)
        private final int calories; // (칼로리)
        private final int fat; // (지방)
        private final int sodium; // (나트륨)
        private final int carbohydrate; // (탄수화물)

        public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
            this.servingSize = servingSize;
            this.servings = servings;
            this.calories = calories;
            this.fat = fat;
            this.sodium = sodium;
            this.carbohydrate = carbohydrate;
        }

        public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
            this(servingSize, servings, calories, fat, sodium, 0);
        }

        public NutritionFacts(int servingSize, int servings, int calories, int fat) {
            this(servingSize, servings, calories, fat, 0, 0);
        }

        public NutritionFacts(int servingSize, int servings, int calories) {
            this(servingSize, servings, calories, 0, 0, 0);
        }

        public NutritionFacts(int servingSize, int servings) {
            this(servingSize, servings, 0, 0, 0, 0);
        }

        public NutritionFacts(int servingSize) {
            this(servingSize, 0, 0, 0, 0, 0);
        }

    }

}