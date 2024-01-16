public class prog1 {
   
    static class Base{
       Base(){
        System.out.println("I am a constructor");
       }
       Base(int x){
        System.out.println("I am a overloaded constructor with value of x as:" + x);
       }
    }

    static class Derived extends Base{
        Derived(){
            //super(5);
            System.out.println("I am a derived class constructor");
        }
        Derived(int x, int y){
            super(x);
            System.out.println("I am a overloaded derived class constructor with value of y as:" + y);
        }
    }

    static class DerivedChild extends Derived{
        DerivedChild(){
            System.out.println("I am a derivedChild class constructor");
        }
        DerivedChild(int x, int y){
            super(x, y);
            System.out.println("I am a overloaded derivedChild class constructor with value of y as:" + y);
        }
    }

    public static void main(String[] args) {
        
        // Base b1 = new Base(5);
        // Derived d1 = new Derived(6, 4);
        DerivedChild dc1 = new DerivedChild(3 ,5);
    }
}


// grandchild -> child -> parent

// super -> a reference variable used to refer immediate parent object.
// it can be used to invoke parent class methods and constructors

// this -> this is a way for us to reference an object of the class which is being created/ referenced
