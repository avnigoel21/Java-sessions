package session8;


// abstract method is declared without an implementation 
// abstract class includes abstract methods
public class prog1 {


    abstract static class Base{
        Base(){
            System.out.println("I am a constructor of class base");
        }


        public void sayHello(){
            System.out.println("hello");
        }

        abstract public void greet();

        abstract public void greet2();
        
    }

    static class Child extends Base{
        @Override
        public void greet(){
            System.out.println("Good Morning child");
        }

        @Override
        public void greet2(){
            System.out.println("Good Afternoon child");
        }
    }
    

    public static void main(String[] args) {
        //Base b = new Base(); -> because its an abstract class, we cannot create an object of that class
        Child c = new Child();
        c.greet();
    }
}

