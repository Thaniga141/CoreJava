package Day5;

//student class
public class Task2 {

    class Student {  // Keep Student class as non-static
        String name;
        int age;
        double marks;

        // Constructor
        public Student(String name, int age, double marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        // Method to display student info
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age + ", Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Task2 task = new Task2();  // Create an instance of Task2
        Student s1 = task.new Student("John", 20, 85.5);  // Create an instance of Student
        Student s2 = task.new Student("Alice", 22, 92.3);  
        s1.displayInfo();
        s2.displayInfo();
    }
}
