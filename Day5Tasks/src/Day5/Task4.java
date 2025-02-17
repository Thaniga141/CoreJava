package Day5;

//bank account
public class Task4 {

    class BankAccount {
        String accountNumber;
         double balance;

        // Constructor
        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance: " + balance);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        public void checkBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        Task4 task = new Task4();  // Create an instance of Task4
        BankAccount account = task.new BankAccount("123456", 1000.0);  // Create an instance of BankAccount
        account.deposit(500);
        account.withdraw(200);
        account.checkBalance();
    }
}
