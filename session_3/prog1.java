package session_3;

//functions/methods
// DRY - DONT REPEAT YOURSELF
public class prog1 {

    // method overloading
    static void sayHi(){
        System.out.println("Hello Everyone");
    }

    static void sayHi(int a){
        System.out.println("Hello " + a);
    }
    static void sayHi(int a, int b){
        System.out.println("Hello " + a);
        System.out.println("Hello " + b);
    }


    //creation of function
    static int logic(int x, int y){
        int c;
        c = x+y;
        x = 4;
        return c;
    } 
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        // prog1 obj = new prog1();
        //int z = obj.logic(a, b);

        //calling a function
        int z = logic(a, b);
        System.out.println(z);
        
        // int a1 = 3;
        // int b1 = 5;

        // int z1 = logic(a1, b1);
        // System.out.println(z1);

        // sayHi();
        // sayHi(3);
        // sayHi(4 , 5);

    }
}
