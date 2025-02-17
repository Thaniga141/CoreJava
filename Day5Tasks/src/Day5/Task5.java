package Day5;

//inheritance
public class Task5 {

    class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog says: Bark");
        }

        public static void main(String[] args) {
            Task5 task = new Task5();  // Create an instance of Task5
            Dog dog = task.new Dog();  // Create an instance of Dog
            dog.sound();
        }
    }
}

