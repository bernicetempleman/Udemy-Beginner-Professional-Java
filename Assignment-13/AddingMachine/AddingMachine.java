import java.util.Scanner;
/**
 * Write a description of AddingMachine here.
 * 
 * Learning Goals 
 * 1. Practice using while loops. 
 * 2. Be able to follow the flow of code execution before, during, and after.  
 * 
 * Business Goal 
 * Your business associate wants a program she can use like a calculator, 
 * but it only needs to add.  
 * She wants to be able to add up long lists of numbers without having to touch + each time.   
 * Your program will start at a total of zero.  
 * It will ask the user to type in a number, 
 * and then add that to the total, 
 * show the total, and then repeat.  
 * As long as the user keeps typing in numbers, 
 * it will keep adding them up and showing totals and asking for another number.  
 * When the user types in 0 for the number, the program will end. 
 * At the end, it should print the final total, 
 * and also print a count of how many numbers were entered (not counting the final zero). 
 * 
 * @author (Bernice Templeman) 
 * @version (20160110)
 */
public class AddingMachine {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        double total = 0;
        int count = 0;
        double number;

        System.out.println("Welcome to Adding Machine!");
        System.out.printf("Total: %.02f", total);

        // do stuff before  
        System.out.print("\n\nAdd: ");
        number = keyboard.nextDouble();

        while (number != 0)  {       
            // do stuff in loop 
            count++;
            total += number;
            System.out.printf("Total: %.02f", total);

            System.out.print("\n\nAdd: ");
            number = keyboard.nextDouble(); 

        }  
        // do stuff after 
        System.out.println("Total: " + total);
        System.out.println("\nYou entered " + count + " numbers, for a final total of " + total);

    }

}
