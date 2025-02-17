package Day3;

//abstraction
abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Rectangle extends Shape {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        System.out.println("Area of Rectangle: " + (length * width));
    }
}

public class Task4 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.calculateArea();

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.calculateArea();
    }
}

