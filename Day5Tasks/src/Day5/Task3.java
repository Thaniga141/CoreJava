package Day5;

//employee class
public class Task3 {

    class Employee {  // Keep Employee class as non-static
        private int id;
        private String name;
        private double salary;

        // Getters and Setters
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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
    }

    public static void main(String[] args) {
        Task3 task = new Task3();  // Create an instance of Task3
        Employee emp = task.new Employee();  // Create an instance of Employee
        emp.setId(101);
        emp.setName("Mark");
        emp.setSalary(55000.0);
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
