package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder;

public class NutritionFactsUseBuilderPattern {

    private final int servingSize; // (제공량)
    private final int servings; // (1회 제공랑)
    private final int calories; // (칼로리)
    private final int fat; // (지방)
    private final int sodium; // (나트를 리스트에 추가하는 메서드
    private final int carbohydrate; // (탄수화물)

    public static class Builder {

        private final int servingSize; // (제공량)
        private final int servings; // (1회 제공랑)
        private final int calories; // (칼로리)
        private final int fat; // (지방)
        private final int sodium; // (나트를 리스트에 추가하는 메서드
        private final int carbohydrate; // (탄수화물)

        public Builder(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
            this.servingSize = servingSize;
            this.servings = servings;
            this.calories = calories;
            this.fat = fat;
            this.sodium = sodium;
            this.carbohydrate = carbohydrate;
        }

        public Builder calories(int calories) {
            calories = calories;
            return this;
        }
        public Builder fat(int fat) {
            fat = fat;
            return this;
        }
        public Builder sodium(int sodium) {
            sodium = sodium;
            return this;
        }
        public Builder carbohydrate(int carbohydrate) {
            carbohydrate = carbohydrate;
            return this;
        }
        public NutritionFactsUseBuilderPattern build() {
            return new NutritionFactsUseBuilderPattern(this);
        }

    }

    private NutritionFactsUseBuilderPattern(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohydrate = builder.carbohydrate;
    }
}
