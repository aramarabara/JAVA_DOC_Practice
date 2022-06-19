package EffectiveJava;

public class NewBuilder {


    /*
    * BuilderPattern, 불변이며 모든 매개변수는 한곳에 모아진다.
    * 연쇄 호출 방식으로,
    * fluent API, 혹은 method chaining 이라 부른다.
    *
    * */
    private final String name;
    private final String color;
    private final String shape;


    /* 내부클래스 생성 */
    public static class Builder {
        private final String name;
        private final String color;
        private String shape = "rectangle";

        public Builder(String name, String color){
            this.name = name;
            this.color = color;
        }

        public Builder shape(String val) {
            shape = val;
            return this;
        }

        public NewBuilder build() {
            return new NewBuilder(this);
        }
    }

    private NewBuilder(Builder builder) {
        name = builder.name;
        color = builder.color;
        shape = builder.shape;
    }
}
