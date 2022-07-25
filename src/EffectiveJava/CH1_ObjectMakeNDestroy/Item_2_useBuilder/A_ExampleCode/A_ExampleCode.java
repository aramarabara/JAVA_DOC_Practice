package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.A_ExampleCode;

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

    public static class NutritionFactsJavaBean {
        private int servingSize = 0; // (제공량)
        private int servings = 0; // (1회 제공랑)
        private int calories = 0; // (칼로리)
        private int fat = 0; // (지방)
        private int sodium = 0; // (나트륨)
        private int carbohydrate = 0; // (탄수화물)

        public int getServingSize() {return servingSize;}
        public int getServings() {return servings;}
        public int getCalories() {return calories;}
        public int getFat() {return fat;}
        public int getSodium() {return sodium;}
        public int getCarbohydrate() {return carbohydrate;}
        public void setServingSize(int servingSize) {this.servingSize = servingSize;}
        public void setServings(int servings) {this.servings = servings;}
        public void setCalories(int calories) {this.calories = calories;}
        public void setFat(int fat) {this.fat = fat;}
        public void setSodium(int sodium) {this.sodium = sodium;}
        public void setCarbohydrate(int carbohydrate) {this.carbohydrate = carbohydrate;}

    }


    public static class NutritionFactsJavaBeanUseFreezing {

        private int servingSize = 0; // (제공량)
        private int servings = 0; // (1회 제공랑)
        private int calories = 0; // (칼로리)
        private int fat = 0; // (지방)
        private int sodium = 0; // (나트를 리스트에 추가하는 메서드
        private int carbohydrate = 0; // (탄수화물)

        public int getServingSize() {return servingSize;}
        public int getServings() {return servings;}
        public int getCalories() {return calories;}
        public int getFat() {return fat;}
        public int getSodium() {return sodium;}
        public int getCarbohydrate() {return carbohydrate;}
        public void setServingSize(int servingSize) {this.servingSize = servingSize;}
        public void setServings(int servings) {this.servings = servings;}
        public void setCalories(int calories) {this.calories = calories;}
        public void setFat(int fat) {this.fat = fat;}
        public void setSodium(int sodium) {this.sodium = sodium;}
        public void setCarbohydrate(int carbohydrate) {this.carbohydrate = carbohydrate;}

        public synchronized NutritionFactsJavaBeanUseFreezing  freeze() {
            NutritionFactsJavaBeanUseFreezing frozen = new NutritionFactsJavaBeanUseFreezing();
            frozen.servingSize = this.servingSize;
            frozen.servings = this.servings;
            frozen.calories = this.calories;
            frozen.fat = this.fat;
            frozen.sodium = this.sodium;
            frozen.carbohydrate = this.carbohydrate;
            return frozen;
        }

        public synchronized boolean isFrozen() {
            NutritionFactsJavaBeanUseFreezing frozen = new NutritionFactsJavaBeanUseFreezing();
            if(frozen == null) {
                return false;
            }
            return true;
        }

    }

    public class NutritionFactsUseBuilderPattern {

        private final int servingSize; // (제공량)
        private final int servings; // (1회 제공랑)
        private final int calories; // (칼로리)
        private final int fat; // (지방)
        private final int sodium; // (나트를 리스트에 추가하는 메서드
        private final int carbohydrate; // (탄수화물)

        public      class Builder {
            //static, java 8 에서는 내부클래스에 Static 선언 불가.

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


}