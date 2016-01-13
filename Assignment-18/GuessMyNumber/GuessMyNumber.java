import java.util.Random;
import java.util.Scanner;

/**
 * Write a description of GuessMyNumber here.
 * 
 * Learning Goals 
 * 1. Practice using random number seed and random number generator. 
 * 2. Practice using loops in context. 3. Have some fun!  
 * 
 * Business Goal
 * We're going to write a little game!  
 * It's called Guess My Number.  
 * The computer "thinks of" a random number, and then the person tries to guess it.  
 * The computer responds with oops, higher, lower, or you got it.   
 * After one round is over, the computer asks "Play again?" 
 * and if the user says "yes", it picks another random number and goes for another round.  
 * Otherwise it exits.  
 * 
 * @author Bernice 
 * @version 20160112
 */
public class GuessMyNumber {

    public static int getIntegerBetween(int lower, int upper){         
        // TO-DO     

        Scanner keyboard = new Scanner(System.in);
        int number;

        do{
            number = keyboard.nextInt();

            if(number < lower || number > upper)
                System.out.println("Error, invalid number. Try again.");

        }while(number < lower || number > upper);

        return number;
    }

    public static void main(String[] args){

        int firstNumber;
        String answer = "yes";
        
        Random randomNumber = new Random(5);
        int myNumber;

        Scanner keyboard = new Scanner(System.in);

        do{
            myNumber = randomNumber.nextInt(100)+1;
            
            System.out.println("I'm thinking of a number between 1-100. What is it?");    
            System.out.println("(Hint: I'm thinking of " +myNumber  +".)"); 

            do {
                firstNumber = getIntegerBetween(1, 100);  

                if (firstNumber < myNumber)
                    System.out.println("My number is higher");
                else if (firstNumber > myNumber)
                    System.out.println("My number is lower");

            }while(firstNumber != myNumber);

            System.out.println("You got it! My number was " + firstNumber + "." );     

            System.out.println("Play again? ( yes no ) ");

            do{
                answer = keyboard.nextLine();
                if (! (answer.equals("no") || answer.equals("yes")))
                    System.out.println("Invalid answer");
            }while(!(answer.equals("no") || answer.equals("yes")));

        }while(answer.equals("yes"));
    }
}
