package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.A_ExampleCode;

public class NutritionFacts_Telescoping {

    private int servingSize;
    private int servings;
    private int calories;
    private int fat;

    public NutritionFacts_Telescoping(int servingSize, int servings, int calories, int fat) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
    }

    public NutritionFacts_Telescoping(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts_Telescoping(int servingSize, int servings) {
        this(servingSize, servings, 0, 0);
    }

    public NutritionFacts_Telescoping(int servingSize) {
        this(servingSize, 0, 0, 0);
    }

    // Getter for use field
    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }
}
