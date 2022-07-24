package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.PizzaExample;

public class NewYorkPizza extends Pizza{

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder>{
        private final boolean sauceInside;

        public Builder(boolean sauceInside) {
            this.sauceInside = sauceInside;
        }

        @Override
        Pizza build() {
            return new NewYorkPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private NewYorkPizza(Builder builder) {
        super(builder);
        sauceInside = builder.sauceInside;
    }

}
