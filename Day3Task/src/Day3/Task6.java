package Day3;

//interface
interface Animal {
    void sound();
    void eat();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog says: Woof!");
    }

    public void eat() {
        System.out.println("Dog eats bones.");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat says: Meow!");
    }

    public void eat() {
        System.out.println("Cat eats fish.");
    }
}

public class Task6 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();

        Cat cat = new Cat();
        cat.sound();
        cat.eat();
    }
}
