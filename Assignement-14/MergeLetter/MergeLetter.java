import static java.lang.System.out;
import java.util.Scanner;

/**
 * Write a description of MergeLetter here.
 * 
 * Learning Goals 
 * 1. Practice using a while loop 
 * 2. Create software for a realistically useful scenario  
 * 
Business Goal 
Your favorite charity has contacted you for help. 
They recently ran a successful fundraiser and they want to send a personalized thank you note to every donor.   
They will provide you with the text of the letter. 
They will use the software (after you build it) to type in the donor names and amounts.  
For each donor, your software will print a thank you letter personalized for that donor.  
When the charity is done entering donor names, they will type the word quit instead of the next name. 

Just to make sure you're clear, here's how the software should work: 
1. The charity runs the software. 
2. The software prints its title "--- Thank You Letters ---" just once at the start. 
3. The software asks for a person's name. 
4. The charity types in the firstname lastname (together) and presses Enter. 
5. The software asks for a person's donation amount. 
6. The charity types in the donation amount without the dollar sign. 
7. The software prints the thank you letter with that name and amount. 
8. The software asks for the next person's name.  
If the charity types in the word quit instead of a name, the software ends.  
Otherwise it continues on asking for donation amount and printing the next thank you letter.  

Planning Your Code 
1. Figure out what goes before the while loop, inside the while loop, and after the while loop. 
2. Figure out the condition for the while loop - when should keepGoing become false? 
3. Figure out what variables you need for data entry, and their data types. 
4. Figure out how to ask for data and then print thank you letters.  
5. Verify that you know how to compare Strings.  
(Hint, it's not == and you did have an example in an earlier assignment.
 * 
 * @author (Bernice Templeman) 
 * @version (20160111)
 */

public class MergeLetter
{
    public static void printLetter(String personname, String donation){
        System.out.println("Dear " + personname +",");  
        System.out.println("Thank you for your donation!  We rely on donors like you to keep our"); 
        System.out.println("organization effective, and you came through for us.  Your donation of $" + donation); 
        System.out.println("will help our efforts to make a difference in the world.");  

        System.out.println("\nAs you may know, we are a registered non-profit organization, so your ");
        System.out.println("donation is tax deductible.  You may use this letter as a receipt for tax"); 
        System.out.println("purposes.  ");

        System.out.println("\nThank you again for your support!  ");

        System.out.println("\nSincerely, ");
        System.out.println("Paula Jones ");
        System.out.println("YourCharity.org");

    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        boolean keepGoing = true; 
        String name;
        String donation;

        System.out.println("--- Thank You Letters ---");
        while (keepGoing)  
        {     
            // do some stuff 

            System.out.print("\nEnter name or quit to end: ");
            name = keyboard.nextLine();

            if (name.equals("quit")){
                keepGoing = false;
            }
            else{

                System.out.print("Enter donation: ");
                donation = keyboard.nextLine();

                printLetter(name, donation);
            }
        }

    }

}
