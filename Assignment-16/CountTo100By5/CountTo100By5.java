
/**
 * Write a description of CountTo100By5 here.
 * 
 * Learning Goals 
 * Understand how to apply while loops to a wider variety of patterns.  
 * 
 * Business Goal 
 * Print the numbers from 0 to 100 but only those divisible by 5 (0, 5, 10, 15, 20, ...) 
 * by using a while loop, and as few lines of code as possible.  
 * This is a quickie practice problem leading into upcoming concepts.  
 * 
 * Planning Your Code
 * 1. Create one variable to hold the number that is counting up. 
 * 2. Write the code. 
 * 3. Run the code and work out the bugs. 
 * 4. See if you can find anywhere to shorten the code.  
 * 
 * @author Bernice
 * @version 20160112
 */
public class CountTo100By5 {

    public static void main(String[] args){
        // do stuff before  
        int number = 0;
        
        while (number < 101)  {       
            // do stuff in loop 
            System.out.println(number);
            number += 5;
            
        } 

    }

}
