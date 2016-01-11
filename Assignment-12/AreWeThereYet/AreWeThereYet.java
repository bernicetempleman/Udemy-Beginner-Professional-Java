import java.util.Scanner;
/**
 * Write a description of AreWeThereYet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AreWeThereYet {
    
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true; 
        String answer;
        while (keepGoing)  
        {     
            // do some stuff 
            System.out.print("Are we there yet? ");
            answer = keyboard.nextLine();
            if(answer.equals("yes"))
                keepGoing = false;
            else if (!answer.equals("no"))
                System.out.println("Huh? I didn't understand that.");
            
        } 
        System.out.println("Yay! ");
    }

}
