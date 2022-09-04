package EffectiveJava.CH4_ClassNInterface.Item_23_24_25_innerClass;

public abstract class AbstractFigure {

    abstract double area();

}

class Circle extends AbstractFigure {

    final double radius;

    Circle(double radius) {
        this.radius = radius;
    }


    @Override
    double area() {
        return Math.PI * (radius * radius);
    }
}


class Rectangle extends Figure {

    final double length;
    final double width;


    Rectangle(double length, double width, double length1, double width1) {
        super(length, width);
        this.length = length1;
        this.width = width1;
    }

    @Override
    double area() {
        return length * width;
    }
}