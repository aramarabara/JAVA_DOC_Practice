package EffectiveJava.CH4_ClassNInterface.Item_23_24_25_innerClass;

class Figure {
    enum Shape {RECTANGLE, CIRCLE};
    final Shape shape;

    // 다음 필드는 모양이 사각형일때만 쓰인다.
    double length;
    double width;

    // 다음 필드는 모양이 원일때만 쓰인다.
    double radius;


    //
    // 원용 생성자
    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    // 사격형용 생성자
    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}