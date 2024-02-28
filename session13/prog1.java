package session13;

import java.util.Scanner;

// throw & throws
public class prog1 {

    static class MyException extends Exception{
        @Override
        public String toString(){
            return "i am toString()";
        }

        @Override
        public String getMessage(){
            return "i am getMessage()";
        }
    }
// developer
    public static int divide(int a, int b) throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {
        // int a;
        // Scanner sc = new Scanner(System.in);
        // a = sc.nextInt();
        // if(a < 9){
        //     try{
        //         throw new MyException();

        //     }
        //     catch(Exception e){
        //         System.out.println(e.toString());
        //         System.out.println(e.getMessage());
        //         System.out.println("Finished");
                
        //     }
            
        // }
// user
        try{
            int c = divide(6, 0);
            System.out.println(c);
            throw new ArithmeticException("Exception occured");
            try{

            }
            catch(ArrayIndexOutOfBoundsException){

            }
            
        }
        catch(Exception e){

              System.out.println("Exception");      
        }

            
        
    }
    
}
