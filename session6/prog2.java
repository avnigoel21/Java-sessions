package session6;

//base class , parent class, super class
// child class , derived class

// grandParent class -> parent class -> child class
public class prog2 {
    static class Base{
        int x;

        public void printMe(){
            System.out.println("I am a coder");
        }

        public void setX(int x){
            this.x = x;
        }

        public int getX(){
            return x;
        }

    }

    static class Derived extends Base{
        int y;

         public void setY(int y){
            this.y = y;
        }

        public int getY(){
            return y;
        }
    }

    public static void main(String[] args) {
        
        Derived d1 = new Derived();
        d1.setX(5);
        d1.setY(6);

        d1.printMe();
        System.out.println(d1.getX());
        System.out.println(d1.getY());

    }
}

