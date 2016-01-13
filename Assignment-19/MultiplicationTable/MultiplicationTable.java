import java.util.Scanner;
/**
 * Write a description of MultiplicationTable here.
 * 
 * Learning Goals 
 * 1. Practice using loops. 
 * 2. Practice keeping track of multiple variables. 
 * 
 * Business Goal 
 * This program will print the multiplication tables.  
 * Start by asking the user what size to print to. 
 * They should enter a number no bigger than 20  (call it size).   
 * Then the computer should print out, each on its own line, the multiplication facts 
 * from 0 * 0 to size * size. 
 * 
 * @author Bernice 
 * @version 20160113
 */
public class MultiplicationTable {
    
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to Multiplication Tables");  
        System.out.print("\nHow large would you like to see them? ");
        
        int size = keyboard.nextInt();
        System.out.println();
        
        for(int i = 0; i <= size; i++){
            
            for (int j = 0; j <= size; j++){
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
        
    }
}
