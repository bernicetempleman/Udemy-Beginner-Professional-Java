import static java.lang.System.out;
import java.util.Scanner;
/**
 * Write a description of GroceryList here.
 * 
 * Learning Goals
 * 1. Plan code from provided software requirements.
 * 2. Practice using variables.
 * 3. Practice using simple math formulas.
 * 4. Learn the parts of good requirements: 
 *  goal, 
 *  sampleoutput, 
 *  names and calculation rules, 
 *  and test data.
 * 
 * Business Goal
 * In this practice assignment, you'll build a short program to
 * take the names of 3 items on a grocery list, the quantity to
 * purchase, and the cost, and calculate the total grocery bill.
 * 
 * Special Circumstances
 * 
 * Rounding: Some numbers will come out to a weird number of dollars and cents, like 51.989998.
 * You don't need to worry about that for this exercise. 
 * Floating point numbers represent numbers inside the computer's memory in a way that isn't very precise. 
 * This is important to be aware of. 
 * We'll cover details of why it happens and what to do about it in a later lecture.

 * Multi-Word Names: You have two ways to get a String from the user for item names. 
 * You can use either of: keyboard.next() or keyboard.nextLine(). 
 * There's a difference between them though. 
 * Calling next() will only get a one-word item name; 
 * the following word after the space will go to the next question. 
 * Calling nextLine() will get the whole line, which lets you handle multi-word names.

 * Planning Your Code
 * 1. Identify the statements that ask questions. 
 * Choose a variable name for each, and makea note of what you chose 
 * (so you don't get confused later).
 * 2. Write the code that declares all the variables at the beginning of your program. 
 * 3. Write the code that 
 * prints questions, 
 * takes keyboard input, 
 * and assigns it to each of those variables.
 * 4. Write the code that does the math calculations.
 * 5. Write the print statements that show the results of the math calculations.
 * 6. Make sure your program is complete and compiles.
 * 7. Run your program. Try typing in various numbers to see if it works.
 * 8. Run your program several times, using the sample numbers below.
 * 
 * @author Bernice Templeman 
 * @version 20160108
 */
public class GroceryList 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String item1, item2, item3;
        int quantityItem1, quantityItem2, quantityItem3;
        double priceItem1, priceItem2, priceItem3;
        double totalCost;
        
        
        out.println("Please list three items on your grocery shopping list.");
        out.print("Item 1? ");
        item1 = keyboard.nextLine();
        out.print("\nItem 2? ");
        item2 = keyboard.nextLine();        
        out.print("\nItem 3? ");
        item3 = keyboard.nextLine();
        
        out.println("\nNow, please enter the quantity of each item.");
        out.print("How many " + item1 +"? ");
        quantityItem1 = keyboard.nextInt();
        out.print("\nHow many " + item2 + "? ");
        quantityItem2 = keyboard.nextInt();
        out.print("\nHow many " + item3 + "? ");
        quantityItem3 = keyboard.nextInt();
        
        out.println("\nNow, please enter the price of each item.");
        out.print("How much does one " + item1 + " cost? ");
        priceItem1 = keyboard.nextDouble();
        out.print("\nHow much does one " + item2 + " cost? ");
        priceItem2 = keyboard.nextDouble();
        out.print("\nHow much does one " + item3 + " cost? ");
        priceItem3 = keyboard.nextDouble();
        
        out.println("\nCalculating your grocery bill.");
        totalCost = quantityItem1 * priceItem1 + quantityItem2 * priceItem2 + quantityItem3 * priceItem3;
        out.printf("Your total cost is %.2f", totalCost );
        
        
    }
    

}
