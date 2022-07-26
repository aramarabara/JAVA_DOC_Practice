package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.A_ExampleCode;

public class NutritionFacts_Freezing {

    private int servingSize;
    private int servings;
    private int calories;
    private int fat;

    public NutritionFacts_Freezing() {
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


    public synchronized NutritionFacts_Freezing freeze(int servingSize, int servings, int calories, int fat) {
        NutritionFacts_Freezing frozen = new NutritionFacts_Freezing();
        frozen.servingSize = servingSize;
        frozen.servings = servings;
        frozen.calories = calories;
        frozen.fat = fat;
        return frozen;
    }

    public synchronized boolean isFrozen(NutritionFacts_Freezing frozen) {
        if(frozen.servingSize == this.servingSize &&
                frozen.servings == this.servings &&
                frozen.calories == this.calories &&
                frozen.fat == this.fat) {
            return true;
        }
        return false;
    }


}
