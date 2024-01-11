package session6;

import java.util.Random;
import java.util.Scanner;

public class task {
    



    static class RandomGame {
        public int number;
        public int guesses = 0;
        public int inputNumber;
        
        public RandomGame() {
                Random random = new Random();
                this.number = random.nextInt(100);
            }
        
        public void getUserInput() {
            Scanner scanner = new Scanner (System.in);
            
            System.out.println("enter a number: ");
            inputNumber = scanner.nextInt();
            System.out.println();
        }
        public void setGuesses(int guesses) {
            this.guesses = guesses;
        }
        
        public int getGuesses() {
            return guesses;
        }
        
        public boolean isCorrectNumber() {
            guesses++;
            if(inputNumber == number) {
                System.out.println("correct guess" + number + guesses);
                return true;
            }
            else if(inputNumber > number){
                System.out.println("too high of a guess");
            }
            else if(inputNumber < number) {
                System.out.println("too low of a guess");
            }
            return false;
        }
        
    } 
       
        public static void main(String[] args) {
             RandomGame guess1 = new RandomGame();
            boolean b = false;
            while(!b) {
                guess1.getUserInput();
                b = guess1.isCorrectNumber();
                System.out.println(b);
            }
        }
    

}

// 46 
//-> 67 -> 34 -> 46
// create a class Game, which allows a user to play "Guess the number"
// 1) Constructor to generate the random number
// 2) takeUserInput() to take a user input of number
// 3) isCorrectNumber() to detect whether the number entered by the user is true
// 4) getter and setter for noOfGuesses
// Use propertes such as noOfGuesses(int) , etc to get the task done.