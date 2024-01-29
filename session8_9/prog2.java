// Interface is a point where two systems meet or interact
// in java, is a group of related methods with empty bodies



//child -> parent -> grand parent

// in java, we do not have multiple inheritance i.e child can not inherit properties from multiple parents
// to fulfill this functionality, we use interfaces



// default methods - it enables us to add new functionality to existing interfaces


package session8;


public class prog2 {

    interface Bicycle{
        int a = 89;
        public void applyBreaks(int decrement);

        public void speedUp(int increment);

        default public void blowSound(){
            System.out.println("blow horn sound");
        }
    }

    interface Bicycle1{
        int a1 = 89;
        public void applyBreaks1(int decrement);

        public void speedUp1(int increment);
    }

    static class AvonCycle implements Bicycle , Bicycle1 {
        void blowHorn (){
            System.out.println("sound of blowHorn");
        }

        public void applyBreaks(int decrement){
            System.out.println("applying brakes");
            
        }

        public void speedUp(int increment){
            System.out.println("Speeding up");
        }

        public void applyBreaks1(int decrement){
            System.out.println("applying brakes");
            
        }

        public void speedUp1(int increment){
            System.out.println("Speeding up");
        }
    }

    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBreaks(1);
        System.out.println(cycle.a);


        cycle.blowSound();


    }
    
}


// Create a class Monkey with jump() and bite() methods.
// Create a class Human which inherits this monkey class and implements BasicAnimal interface with 
// eat() , sleep() methods

