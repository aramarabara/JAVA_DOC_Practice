package EffectiveJava.CH1_ObjectMakeNDestroy.Item_3_usePrivateConstructor;

public class JavaBean {

    private String name;
    private String color;
    private String shape;

    public void JavaBean() {
        // 일반 생성자
    }

    /* SETTER를 이용한 생성자  */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }
}
