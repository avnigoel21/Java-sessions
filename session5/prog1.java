package session5;

public class prog1 {

    static class Employee {
        private int salary;
        private int id;

        // Getter for id
        public int getId() {
            return id;
        }

        // Setter for salary
        public void setSalary(int salary) {
            this.salary = salary;
        }

        // Getter for salary
        public int getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {
        Employee harry = new Employee();

        // Attempting to access the private id field directly (will cause a compilation error)
        harry.id = 12;  // This line will result in a compilation error
        System.out.println(harry.id);

        // Using the setter to set the salary (no error)
        harry.setSalary(5000);

        // Using the getter to retrieve the salary (no error)
        System.out.println("Salary: " + harry.getSalary());
    }
}
