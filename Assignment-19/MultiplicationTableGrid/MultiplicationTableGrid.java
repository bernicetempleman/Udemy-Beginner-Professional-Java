import java.util.Scanner;
/**
 * Write a description of MultiplicationTableGrid here.
 * 
 * Learning Goals 1. Practice using loops. 2. Practice computational thinking.  
Challenge Goal Why is this a challenge?  You'll need to think strategically about how to make the column alignment work, and how to put column headers and row headers on each. 
Business Goal This program will print the multiplication tables.  Start by asking the user what size to print to.  They should enter a number no bigger than 20  (call it size).  Then the computer should print out a grid format with the multiplication tables in it, from 0 * 0 up through size * size.  Make sure your grid aligns nicely. 
Remember that you can create methods to reuse if it makes certain parts easier. 
 * 
 * @author Bernice  
 * @version 20160113
 */
public class MultiplicationTableGrid {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Multiplication Tables");  
        System.out.print("\nHow large would you like to see them? ");

        int size = keyboard.nextInt();
        System.out.println();
        
        //print header
        System.out.print("    ");
        for(int i = 0; i <= size; i++)
            System.out.printf(" %3d",i);
        System.out.println();
        
        //print grid
        for(int i = 0; i <= size; i++){
            
            System.out.printf(" %3d",i);

            for (int j = 0; j <= size; j++){
                System.out.printf(" %3d",i * j);
            }
            System.out.println();
        }

    }
}
