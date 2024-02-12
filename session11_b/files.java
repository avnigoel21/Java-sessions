package session11_b;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class files {
    public static void main(String[] args) {
        // code to create a file 
        // File myFile = new File("sample.txt");

        // try{
        //     myFile.createNewFile();
        // }
        // catch (Exception e){
        //     System.out.println(e);
        // }
        
        // code to write in a file
        // try{
        //     FileWriter fileWriter = new FileWriter("sample.txt");
        //     fileWriter.write("This is the first file from java code");
        //     fileWriter.write("\nbye");
        //     fileWriter.close();

        // }
        // catch (Exception e){
        //     System.out.println(e);
        // }

        
        // code to read a file

        // File myFile = new File("sample.txt");
        // try{
        //     Scanner scn = new Scanner(myFile);
        //     while(scn.hasNextLine()){
        //         String line = scn.nextLine();
        //         System.out.println(line);
        //     }
        //     scn.close();
        // }
        // catch (Exception e){
        //     System.out.println(e);
        // }

        // code to delete a file

        File myFile = new File("sample.txt");
        try{
            if(myFile.delete()){
                
                System.out.println("file deleted" + myFile.getName());
            }
            else{
                System.out.println("some problem occured");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }




        

        
    }
    
}
