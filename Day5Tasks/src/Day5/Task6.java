package Day5;

//constructor overloading
public class Task6 {

    class Book {
        String title;
        String author;
        double price;

        // Constructor 1
        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        // Constructor 2
        public Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        public void displayDetails() {
            System.out.println("Title: " + title + ", Author: " + author + (price != 0 ? ", Price: " + price : ""));
        }

        public static void main(String[] args) {
            Task6 task = new Task6();  // Create an instance of Task6
            Book b1 = task.new Book("Java Basics", "John Doe");
            Book b2 = task.new Book("Advanced Java", "Alice Smith", 29.99);
            b1.displayDetails();
            b2.displayDetails();
        }
    }
}
