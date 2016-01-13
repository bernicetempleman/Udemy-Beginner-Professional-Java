
/**
 * Write a description of ASCIIchart here.
 * 
 * Learning Goals 
 * 1. Practice with Ascii
 * 2. Practice with logic
 * 
 * Business Goal Write a program that prints the ASCII chart from 32 through 255.  
 * You don't need to worry about columns or fancy layouts. 
 * Remember to turn on "Unlimited Buffering" in BlueJ's "Options" menu 
 * after you run the program the first time.  
 * Otherwise you won't be able to scroll up all the way back.  
 * 
 * @author Bernice 
 * @version 2016-01-13
 */
public class ASCIIchart {
    
    public static void main(String[] args){
        
        for(int i = 32; i <256; i++)
        {
            char letter = (char) i;
            System.out.println(i + " "+letter + " ");

        }
    }

}
