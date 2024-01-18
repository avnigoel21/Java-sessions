// Interface is a point where two systems meet or interact
// in java, is a group of related methods with empty bodies


package session8;


public class prog2 {

    interface Bicycle{
        int a = 89;
        public void applyBreaks(int decrement);

        public void speedUp(int increment);
    }

    class AyonCycle implements Bicycle{
        void blowHorn (){
            System.out.println("sound of blowHorn");
        }

        public void applyBreaks(int decrement){
            System.out.println("applying brakes");
            
        }

        public void speedUp(int increment){
            System.out.println("Speeding up");
        }
    }

    public static void main(String[] args) {
        // AyonCycle cycle = new AyonCycle();
        // cycle.applyBreaks(1);
        // System.out.println(cycle.a);

    }
    
}

