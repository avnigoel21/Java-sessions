public class oops {

    public static class Employee {
        private int id;
        private String name;
        int salary;

        // public void printDetails(){
        //     System.out.println("My id is " + id);
        //     System.out.println(("and name is" + name));
        // }

        // public int getSalary(){
        //     return salary;
        // }
    }


    public static void main(String[] args) {
        System.out.println("this is our custom class");


        Employee harry = new Employee();
        harry.id = 12;
        harry.name = "HarryGarg";
        System.out.println(harry.id);
        System.out.println(harry.name);
        // harry.printDetails();
        // harry.salary = 3400;
        // System.out.println(harry.getSalary());

        // Employee Aditi = new Employee();
        // Aditi.id = 50;
        // Aditi.name = "AditiGarg";
        // Aditi.salary = 3400;
        // System.out.println(Aditi.getSalary());
        // // System.out.println(Aditi.id);
        // // System.out.println(Aditi.name);
        // Aditi.printDetails();
    }
}



// // exam application -> filled by the student -> application of that student
// // class            -> object Instantiation  -> Object 

// // class -> Employee
// // attributes -> name, age, salary
// // methods -> getSalary() , increment()


// Public , Private, Default, Protected