import java.util.Scanner;
/**
 * Write a description of ValidatingInput here.
 * 
 * Learning Goals 
 * 1. Practice using do-while loops. 
 * 2. Practice using more than one loop in a program. 
 * 3. Put loops in context with methods and larger behaviors.  
 * 
 * Business Goal 
 * Take a set of inputs from the user, and make sure they fit within prescribed rules.  
 * Keep asking until the user gets it right.  
 * This provides reliable input to later steps.   
 * 
 * In the future, we will validating fields like email address, phone number, and zip code.  
 * But some of those are more challenging than necessary right now, so we're sticking to simple numbers.  
 * (We'll come back to the others later!) 
 * There is starter code provided on the next page, that you must use.  
 * (It was the easiest way to ensure you're solving the problem in the way that most helps your learning.)  
 * 
 * Planning Your Code 
 * 1. Examine the provided sample code.  Determine where you need to add code. 
 * 2. Examine the input parameters and return values.  How do the methods fit in? 
 * 3. Determine what responsibilities each method has. 
 * 4. Plan your variables and loops.
 * 5. Write out pseudocode of your variables, loops, error messages, and conditions. 
 * 6. Write the code. 
 * 7. Test and debug.   
 * 
 * @author Bernice 
 * @version 20160112
 */
public class ValidatingInput {

    // Provided Sample Code  

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

    public static int getTensInteger(int lower, int upper){         
        // TO-DO   
        Scanner keyboard = new Scanner(System.in);
        int number;

        do{
            number = keyboard.nextInt();

            if((number < lower || number > upper)&& (( number % 10) != 0))
                System.out.println("Error, invalid number. Try again.");

        }while(number < lower || number > upper);
        return number;

    }  

    public static void main(String[] args){         
        System.out.println("Please enter a number from 1-10.");         
        int firstNumber = getIntegerBetween(1, 10);  

        System.out.println("Please enter a number between 200 and 3000 that is a multiple of ten.");         
        int secondNumber = getTensInteger(200, 3000); 

        System.out.println("You entered " + firstNumber + " and " + secondNumber);     
    } 
} 

