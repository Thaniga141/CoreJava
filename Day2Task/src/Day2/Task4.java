package Day2;

public class Task4 {
    
	//student details
	
	// Instance Variables
    String name;
    int rollNumber;

    // Static Variable
    static String collegeName = "ABC University";

    // Constructor to initialize the instance variables
    public Task4(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("College Name: " + collegeName);
    }
    
     //object counting
    
    // Static variable to count objects
    static int objectCount = 0;

    // Constructor to increment the object count
    public Task4() {
        objectCount++;
    }

    
    //bank details
    
 // Instance Variables
    String accountHolderName;
    double balance;

    // Static Variable
    static String bankName = "XYZ Bank";

    // Constructor to initialize account details
    public Task4(String name, double initialBalance) {
        accountHolderName = name;
        balance = initialBalance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;  // Add the deposit amount to balance
        System.out.println("The amount after depositing into account: " + balance);
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;  // Subtract the withdrawal amount from balance
            System.out.println("The amount after withdrawing"+ balance);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display account details
    public void showDetails() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Bank: " + bankName);
    }

    
    public static void main(String[] args) {
        // Creating multiple Student objects
        Task4 student1 = new Task4("John", 101);
        Task4 student2 = new Task4("Alice", 102);

        // Displaying their details
        student1.displayDetails();
        student2.displayDetails();
        
        
     // Creating objects and directly incrementing the count
        new Task4();
        new Task4();
        new Task4();

        // Display the count of objects
        System.out.println();
        System.out.println("Number of objects created: " + objectCount);  // Output: Number of objects created: 3
        System.out.println();
        
        
     // Creating a BankAccount object
        Task4 account1 = new Task4("John", 5000.0);

        // Performing transactions
        account1.deposit(1500.0);  // Deposit 1500
        account1.withdraw(2000.0);  // Withdraw 2000

        // Displaying updated account details
        account1.showDetails();  // Show details

    }

}
