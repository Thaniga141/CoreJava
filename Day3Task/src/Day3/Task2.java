package Day3;

//inheritance
//Base class
class Vehicle {
 String brand;

 public void display() {
     System.out.println("This is a vehicle.");
 }
}

//Derived class Car
class Car extends Vehicle {
 int doors;

 public void display() {
     System.out.println("This is a car with " + doors + " doors.");
 }
}

//Derived class Bike
class Bike extends Vehicle {
 boolean hasGear;

 public void display() {
     System.out.println("This is a bike. Has gear: " + hasGear);
 }
}

public class Task2 {
 public static void main(String[] args) {
     Car car = new Car();
     car.brand = "Toyota";
     car.doors = 4;
     car.display();

     Bike bike = new Bike();
     bike.brand = "Yamaha";
     bike.hasGear = true;
     bike.display();
 }
}

