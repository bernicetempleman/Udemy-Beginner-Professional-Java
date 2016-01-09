import static java.lang.System.out;
import java.util.Scanner;
/**
 * Write a description of SandwichShop here.
 * Learning Goals
 * 1. Plan code from provided software requirements.
 * 2. Practice getting keyboard input.
 * 3. Practice using if statements and booleans.

 * Business Goal
 * In this practice, you'll help a sandwich shop manager see if they met their sales goals for the
 * day. You'll ask them how many of various items they sold, and compare the number they sold
 * to the daily goal. If they met the goal, you'll print "Made goal" and if they fell short, you'll print
 * "Fell short".
 * 
 * Business Rules
 * There are four types of items you will ask about:
 * 1. veggie sandwiches
 * 2. burgers
 * 3. subs
 * 4. soup
 * For each type of item, first print what the sales goal is.
 * Then ask the user how many of that item they sold. They should type it in.
 * Then, print a message indicating whether they made goal or fell short.
 * At the end of the program, if they made goal for all four items, print a message that says,
 * "Made goal for everything!"
 * 
 * Planning Your Code
 * 1. Create a class named SandwichShop.
 * 2. Type in the starter code given in these requirements.
 * 3. Make sure your program compiles.
 * 4. Examine the business rules and think about what code you need for each step.
 * 5. Name and declare any new variables you might need.
 * 6. Write the code.
 * 7. Make sure your program is complete and compiles.
 * 8. Run your program. Try typing in various numbers to see if every piece works.
 * 
 * Test Cases
 * When you're finished, you should be able to compile your code one final time, and then run it
 * several times without changing the code, typing in different numbers to test each case. When
 * you find a bug, fix it, and then retest ALL of the test cases.
 * Test these scenarios to prove that they all work right:
 * 1. When number veggies sold falls short, message says "Fell short"
 * 2. When number of veggies exactly meets goal, message says "Meets goal"
 * 3. When number of veggies is over the goal, message says "Meets goal"
 * 4. When number of burgers sold falls short, message says "Fell short"
 * 5. When number of burgers sold exactly meets goal, message says "Meets goal"
 * 6. When number of burgers sold is over the goal, message says "Meets goal"
 * 7. When number of subs sold falls short, message says "Fell short"
 * 8. When number of subs sold exactly meets goal, message says "Meets goal"
 * 9. When number of subs sold is over goal, message says "Meets goal"
 * 10.When number of soups sold falls short, message says "Fell short"
 * 11.When number of soups sold exactly meets goal, message says "Meets goal"
 * 12.When number of soups sold is over goal, message says "Meets goal"
 * 13.When all items met goal or better, final message says "Made goal for everything!"
 * 14.When one item falls short of goal, final message does not show up.
 * 15.When more than one item falls short of goal, final message does not show up.
 * 
 * 
 * @author Bernice Templeman 
 * @version 20160109
 */
public class SandwichShop 
{
    public static void main(String[] args)
    {
        // Don't change these lines.
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;

        // Your code goes below here.
        int soldVeggies;
        int soldBurgers;
        int soldSubs;
        int soldSoup;
        
        boolean madeEverythingGoal = true;

        out.println("Checking sales goals.");
        out.println("The sales goal for veggie sandwiches is " + goalForVeggies );
        out.println("How many veggie sandwiches were sold today?");
        soldVeggies = keyboard.nextInt();

        if(soldVeggies < goalForVeggies)
        {
            madeEverythingGoal = false;
            out.println("\nFell Short");

        }
        else
        {
            out.println("\nMade goal for veggies.");
        }
        
        out.println("The sales goal for burgers is " + goalForBurgers);
        out.println("How many burgers were sold today?");
        soldBurgers = keyboard.nextInt();
        
        if (soldBurgers < goalForBurgers)
        {
            madeEverythingGoal = false;
            out.println("\nFell Short");
        }
        else
        {
            out.println("\nMade goal for burgers.");
        }
        
        out.println("The sales goal for subs is " + goalForSubs);
        out.println("How many subs were sold today?");
        soldSubs = keyboard.nextInt();
        
        if (soldSubs < goalForSubs)
        {
            madeEverythingGoal = false;
            out.println("\nFell Short");
        }
        else
        {
            out.println("\nMade goal for subs.");
        }
        
        out.println("The sales goal for soup is " + goalForSoup);
        out.println("How many soups were sold today?");
        soldSoup = keyboard.nextInt();
        
        if (soldSoup < goalForSoup)
        {
            madeEverythingGoal = false;
            out.println("\nFell short");
        }
        else
        {
            out.println("\nMade goal for soup.");
        }
        
        if(madeEverythingGoal)
            out.println("\nMade goal for everything!");


    }
}
