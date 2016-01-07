import static java.lang.System.out;
import java.util.Scanner;

/**
 * Description of Interview:
 * Class: Udemy.com "Beginner PRO Java"
 * Assignment 1: Creating and Running Programs
 * Pragram 3: Input & Output
 * 
 * @author Bernice Templeman 
 * @version 20160107
 */
public class Interview 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String name;
        int favoriteNumber;
        out.println("Hi. I'm going to ask you a few questions.");
        out.print("What's your name? ");
        name = keyboard.next();

        out.println("Hi, " + name.toLowerCase() + " it's good to meet you.");
        out.println("Oops, did I forget to capitalize your name?\n");
        out.println("Hi, " + name.toUpperCase() + " it's good to meet you.");
        out.println("Wait, that's not right either. \n");
        out.println("Hi, " + name + " it's good to meet you. \n");
        out.println("Your name has " + name.length() + " letters in it.");

        out.print("What's your favorite number?");
        favoriteNumber = keyboard.nextInt();
        if (favoriteNumber > 100)
        {
            out.println(favoriteNumber + " is a really big number!");
        }
        else
        {
            out.println("Here is a bar " + favoriteNumber + " x's long.");
            for (int counter = 0; counter < favoriteNumber; counter++)
            {
                out.print("x");
            }
            out.println("");
            out.println("I hope it made you smile!");
        }

    }
}
