package Day3;

//class and object
public class Task1 {
    // Attributes
    String title;
    String author;
    double price;

    // Constructor
    public Task1(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Creating objects of the Book class
        Task1 book1 = new Task1("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Task1 book2 = new Task1("1984", "George Orwell", 8.99);

        // Displaying details
        book1.displayDetails();
        book2.displayDetails();
    }
}
