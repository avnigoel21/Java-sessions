package session12;

public class prog1 {
    public static void main(String[] args) {
        //syntax errors
        //logical errors - incorrect redirects, message delivered wrongly
        //Runtime errors - handled by exceptions

        //int a = 9

        int a = 6000;
        int b = 0;
        try{
            int c = a / b;
            System.out.println("The result is" + c);
        }
        catch(Exception e){
            System.out.println("we failed to divide, Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
       


        // Write a program that allows you to keep accessing an array until a valid index is given
        // if max retrives exceeds 5 print "error"

        boolean flag = true;
        int index;
        int i = 0;
        while(flag && i < 5){
            try{
                index = scn.nextInt();
                i++;
                System.out.println(a[index]);
                break;
            }
            catch(){
                System.out.println("invalid index");
                i++;
            }
            
        }

        // WRAP THE PROGRAM INSIDE A METHOD WHICH THROWS YOUR EXCEPTION


        




    }
}


// Null pointer Exception
// Airthmetic Exception
// ArrayIndexOutOfBound Exception
// NumberFormat Exception
// Illegal Argument Exception
