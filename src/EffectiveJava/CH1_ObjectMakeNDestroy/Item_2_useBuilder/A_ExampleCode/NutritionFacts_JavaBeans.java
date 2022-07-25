package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.A_ExampleCode;

public class NutritionFacts_JavaBeans {

    private int servingSize = 0; // (제공량)
    private int servings = 0;// (1회 제공랑)
    private int calories = 0; // (칼로리)
    private int fat = 0; // (지방)

    // Setter
    public int getServingSize() {return servingSize;}
    public int getServings() {return servings;}
    public int getCalories() {return calories;}
    public int getFat() {return fat;}

    // Getter
    public int setServingSize(int servingSize) {return this.servingSize = servingSize;}
    public int setServings(int servings) {return this.servings = servings;}
    public int setCalories(int calories) {return this.calories = calories;}
    public int setFat(int fat) {return this.fat = fat;}

}
