import java.util.Scanner;
/**
 * Write a description of ForLoops2 here.
 * 
 * Learning Goals 
 * 1. Practice using for loops. 
 * 2. Combine loops with methods.  
 * 
 * Business Goal 
 * Version 1:
 * The user will type in a number.  
 * You will produce a bar graph that many characters wide.
 * 
 *  Version 2: 
 *  Yay iterative design!  
 *  In the second version, you will move the logic you wrote above into a function/method.  
 *  It should take an input parameter of how wide to make the bar.  
 *  Then in your main(), you should set up a loop to take multiple numbers from the user. 
 *  When they enter a number, call the method to produce a bar that wide. 
 *  If the user enters zero for the number, the program exits. 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForLoops2 {
    public static void drawBar(int number){
        for(int i = 0; i < number; i++){
            System.out.print("#");
        }
    }

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Bar Chart Version 1"); 
        System.out.print("\nnumber? ");

        int number = keyboard.nextInt();
        for(int i = 0; i < number; i++){
            System.out.print("#");
        }

        System.out.println("\n\nHave a good day!");

        System.out.println("\n\nWelcome to Bar Chart Version 2"); 

        int number2;
        do{
            System.out.print("\nnumber? ");

            number2 = keyboard.nextInt();

            if(number2 != 0)
                drawBar(number2);
        }while(number2 != 0);
        System.out.println("\nHave a good day!");  
    }
}
