import static java.lang.System.out;
import static java.lang.System.out;
/**
 * Write a description of Quiz1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quiz1 {

    public static void main(String[] args)
    {

        // incompatible type compile error
        //int apples = 4.5;
        //out.println("I have " + apples + " apples.");

        //
        //int = 5;
        //out.println("I have " + int + " numbers.");

        //bluej says: incompatible type compile error: possible lossy conversion from float to double
        // quiz says correct
        // float meters = 3.2;
        //change it to double & it works
        double meters = 3.2;
        out.println("The building is " + meters + " meters away.");

        out.println("I have " + 3 + 5 + " oranges.");

        out.println("I have " + 3.2 + 5 + " oranges.");

        //compile error: cannot find symbol - variable boats
        //boats = 3;
        //float rowboats = boats;
        //out.println("I have " + rowboats + " rowboats.");

        //variable hotels might not have been initialized
        //int hotels;
        //out.println("This city has " + hotels + " hotels.");

        //illegal character \
        // int hotels = 5;
        // out.print("This city has ");
        // out.print(hotels);
        // out.print(" hotels."\n);

        //error ; expected
        //int buildings - 28;
        //int averageWindowsPerBuilding = 100;
        //int totalWindows = averageWindowsPerBuilding * buildings;
        //out.println("Estimating " + totalWindows + " total windows.");

        //error <identifier> expected
        //float speed = 25.2;
        //float minutes = 3,5;
        //float distance = speed * minutes;
        //out.println("We traveled " + distance + " today.");

        //error:  ) expected
        int apples = 5;
        int bananas = 8;
        int oranges = 7;
        int pineapples = 3;
        int strawberries = 15;
        out.println("I have " + (bananas + oranges) + " bananas and oranges.");
        out.println("I have " + strawberries " + strawberries.");
        int starfruit = int bananas / 2;
        out.println("I have half as many starfruit as bananas. That's " + starfruit + " starfruit);

    }
}
