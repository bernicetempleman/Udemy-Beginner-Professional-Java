import static java.lang.System.out;
import java.util.Scanner;
/**
 * Write a description of Entertainment here.
 * 
 * Learning Goals
 * 1. Plan code from provided software requirements.
 * 2. Practice getting keyboard input.
 * 3. Practice using if statements and String comparisons.
 * 4. Practice testing code against known test cases.
 * 
 * Business Goal
 * This program will be a bit of a question-and-answer routine. 
 * Your program should ask the user at the keyboard 2 questions: 
 * the weather and their mood. 
 * Then, depending on what they typed in, 
 * it should make a suggestion on how to spend a few hours having fun.
 * 
 * If the user typed in something else, 
 * they would get a different suggestion. 
 * If they type in something that isn't in the list of valid choices, 
 * they should see an error message.
 * 
 * Business Rules
 * Here are all the combinations they might type in, 
 * and the suggestion your program should offer when they do.
 * Weather Mood Result
 * sunny exercise For exercise on a sunny day, try a brisk walk in a nature preserve.
 * sunny party For a fun party on a sunny day, look for a street festival.
 * sunny quiet A sunny day is a beautiful time to sit under a tree and read a book.
 * cloudy exercise For exercise on a cloudy day, the botanical gardens are a lovely walk.
 * cloudy party For a fun party on a cloudy day, ride the paddle boats at the park.
 * cloudy quiet On a cloudy day, take a camera or paints to sketch the flowers at the lakeside.
 * rainy exercise Giant indoor trampolines are a fun place to exercise on a rainy day.
 * rainy party See if your friends are playing board games to pass a rainy day.
 * rainy quiet A rainy day is a peaceful time to journal and daydream.
 * ? Error: Your weather answer wasn't one of the valid options.
 * ? Error: Your mood answer wasn't one of the valid options.
 * 
 * Planning Your Code
 * 1. Create a class named Entertainment.
 * 2. Type in the starter code above.
 * 3. Make sure the starter code compiles.
 * 4. Examine the business rules and think about what code you need for each step. 
 *  You might want to note your ideas on paper.
 * 5. Name and declare any variables you might need.
 * 6. Write the code.
 * 7. Make sure your program is complete and compiles.
 * 8. Run your program. Try typing in various answers to see that every message works
 * 
 * Test Cases
 * When you're finished, you should be able to compile your code one final time, and then run it
 * several times without changing the code, typing in different words to test each case. 
 * When you find a bug, fix it, and then retest ALL of the test cases.
 * 
 * Test these scenarios to prove that they all work right:
 * 1. Try every valid combination listed in the table above. This should cover 9 scenarios
 * 2. Try answering something weird for weather, that isn't in the approved answers list. 
 * You should see the error message "Error: Your weather answer wasn't one of the choices."
 * 3. Try answering something weird for mood, that isn't in the approved answers list. 
 * You should see the error message "Error: Your mood answer wasn't one of the choices."
 * Your program does not have to produce an activity suggestion if the person typed in an invalid
 * choice. Just showing the error message(s) is enough.
 * 
 * 
 * @author Bernice Templeman 
 * @version 20160109
 */
public class Entertainment 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        String weather;
        String mood;
        boolean validWeather = false;
        boolean validMood = true;

        out.print("What is the weather like today? Answer: sunny cloudy or rainy > ");
        weather = keyboard.nextLine();

        if (weather.equals("sunny")||weather.equals("cloudy")||weather.equals("rainy"))
            validWeather = true;
        else
            out.println("\nError: Your weather answer wasn't one of the valid options.");

        if (validWeather)
        {
            out.print("\nWhat kind of mood are you in for activities? Answer: exercise party or quiet > ");
            mood = keyboard.nextLine();

            if (weather.equals("sunny"))
            {
                if (mood.equals("exercise"))
                    out.println("\nFor exercise on a sunny day, try a brisk walk in a nature preserve.");
                else if(mood.equals("party"))
                    out.println("\nFor a fun party on a sunny day, look for a street festival.");
                else if(mood.equals("quiet"))
                    out.println("\nA sunny day is a beautiful time to sit under a tree and read a book.");
                else 
                {
                    validMood = false;
                    out.println("\nError: Your mood answer wasn't one of the valid options");

                }
            }

            else if(validMood && weather.equals("cloudy"))
            {
                if (mood.equals("exercise"))
                    out.println("\nFor exercise on a cloudy day, the botanical gardens are a lovely walk.");
                else if(mood.equals("party"))
                    out.println("\nFor a fun party on a cloudy day, ride the paddle boats at the park.");
                else if (mood.equals("quiet"))
                    out.println("\nOn a cloudy day, take a camera or paints to sketch the flowers at the lakeside.");
                else
                {
                    validMood = false;
                    out.println("\nError: Your mood answer wasn't one of the valid options");
                }

            }

            else if (validMood && weather.equals("rainy"))
            {

                if (mood.equals("exercise"))
                    out.println("\nGiant indoor trampolines are a fun place to exercise on a rainy day.");
                else if (mood.equals("party"))
                    out.println("\nSee if your friends are playing board games to pass a rainy day.");
                else if (mood.equals("quiet"))
                    out.println("\nA rainy day is a peaceful time to journal and daydream.");
                else
                {
                    validMood = false;
                    out.println("\nError: your mood answer wasn't one of the valid options");
                }

            }
        
        }
    }

}
