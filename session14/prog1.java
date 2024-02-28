package session14;

import java.util.Scanner;

public class prog1 {
     public static void main(String[] args) {
    	Scanner scanner = new Scanner (System.in);
    	String[] fruit = {"apples", "oranges", "grapes" , "agh" , "Djhb"};

        
        
    	System.out.println("enter a string: ");
    	String user = scanner.next();

        boolean found = false;
    	for(int i = 0; i<fruit.length; i++) {
        	if(fruit[i].equals(user)) {
                found = true;
            }
        }
        if(found == true){
            System.out.println("element found");
        }
        else{
            System.out.println(-1);
        }
    }
}
    



