package Day3;

//Encapsulation
public class Task5 {
    private String name;
    private int id;
    private double salary;

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    public static void main(String[] args) {
        Task5 emp = new Task5();
        emp.setName("John");
        emp.setId(101);
        emp.setSalary(5000);

        System.out.println("Name: " + emp.getName());
        System.out.println("ID: " + emp.getId());
        System.out.println("Salary: $" + emp.getSalary());
    }
}

