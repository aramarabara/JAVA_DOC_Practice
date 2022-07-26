package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.A_ExampleCode;

public class NutritionFacts_Builder {

    private int servingSize; // (제공량)
    private int servings; // (1회 제공랑)
    private int calories; // (칼로리)
    private int fat; // (지방)

    public static class Builder {

        private int servingSize; // (제공량)
        private int servings; // (1회 제공랑)
        private int calories; // (칼로리)
        private int fat; // (지방)

        public Builder(int servingSize, int servings, int calories, int fat) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            calories = calories;
            return this;
        }
        public Builder fat(int fat) {
            fat = fat;
            return this;
        }
        public NutritionFacts_Builder build() {
            return new NutritionFacts_Builder(this);
        }

    }

    private NutritionFacts_Builder(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
    }
}
