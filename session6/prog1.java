package session6;

public class prog1 {

    static class Employee {
        private int salary;
        private int id;

        // Getter for id
         public int getId() {
            return id;
        }

        public void setId(int id){
            this.id = id;
        }

        // Setter for salary
        public void setSalary(int salary) {
            this.salary = salary;
        }

        // Getter for salary
        public int getSalary() {
            return salary;
        }

        public Employee(){
          id = 45;
          salary = 34000;  
        }
        // constructor overloading
        public Employee(int myId){
          id = myId;
          salary = 34000;  
        }
        public Employee(int myId , int mySalary){
          id = myId;
          salary = mySalary;  
        }



    }

    public static void main(String[] args) {
        Employee harry = new Employee();
        // harry.setId(12);
        // harry.setSalary(9000);

        System.out.println(harry.getId());
        System.out.println(harry.getSalary());


        Employee Aditi = new Employee(67 , 5000);

        System.out.println(Aditi.getId());
        System.out.println(Aditi.getSalary());

// constructor is automatically called while creating the object of a class

// creating a class Cylinder and use getters and setters to set its radius and height.
// use this to calculate surface area and volume of the cylinder
// use a constructor
// overload a constructor used to initilize a rectangle of length 4 and braedth 5 
// for using custom parameters

    }


}
