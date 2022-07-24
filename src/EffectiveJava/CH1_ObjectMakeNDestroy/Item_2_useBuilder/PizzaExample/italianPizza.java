package EffectiveJava.CH1_ObjectMakeNDestroy.Item_2_useBuilder.PizzaExample;

import java.util.Objects;

public class italianPizza extends Pizza {

    public enum Size { SMALL, MEDIUM, LARGE }   // enum for pizza size
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;

        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        Pizza build() {
            return new italianPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
    private italianPizza(Builder builder) {
        super(builder);
        size = builder.size; // set the size of the pizza
    }
}
