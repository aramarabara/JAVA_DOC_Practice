package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.A_ExampleCode;

public class NutritionFacts_Freezing {

    private int servingSize;
    private int servings;
    private int calories;
    private int fat;

    public NutritionFacts_Freezing(int servingSize, int servings, int calories, int fat) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public int getServings() {
        return servings;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void freeze() {

    }

    public boolean isFreezed(NutritionFacts_Freezing nutritionFacts) {
        if(nutritionFacts.getServingSize() == null || nutritionFacts.getServings() == null || nutritionFacts.getCalories() == null || nutritionFacts.getFat() == null) {
            return true;
        }
    }


}
