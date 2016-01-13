import java.util.Scanner;
/**
 * Write a description of ForLoop1 here.
 * 
 * Learning Goals 1. Practice using for loops. 
 * 2. Practice planning ahead.  
 * 
 * Business Goal 
 * This one is a simple practice.  
 * Ask the user for a number.  
 * Count up to it, 
 * and then count down again.  
 * Print the numbers along the way.  
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForLoop1 {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How big of a number should I count to?");
        int number = keyboard.nextInt();
        
        for (int i = 1; i <= number; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = number; i >0; i--){
            System.out.print(i + " ");
        }
        
        
    }

}
