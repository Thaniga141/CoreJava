package Day5;

//polymorphism
public class Task7 {

    class Shape {
        public double area() {
            return 0;
        }
    }

    class Circle extends Shape {
        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
    }

    class Rectangle extends Shape {
        double length, width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        public double area() {
            return length * width;
        }

        public static void main(String[] args) {
            Task7 task = new Task7();  // Create an instance of Task7

            Shape c = task.new Circle(5);  // Create a Circle object
            Shape r = task.new Rectangle(4, 5);  // Create a Rectangle object

            System.out.println("Area of Circle: " + c.area());  // Calculate and print area of Circle
            System.out.println("Area of Rectangle: " + r.area());  // Calculate and print area of Rectangle
        }
    }
}

