import java.lang.Math;
import java.util.Scanner;
/**
 * Write a description of SecretMessage here.
 * 
 * Decode the Message 
 * 1110010 1101000 1101000 1111011 10000100 1100100 1111011 10000100
 * 1111011 1101011 1101000 10000100 1111011 1101011 1101000 1100100
 * 1111011 1101000 1111001 10000100 1100100 1111011 10000100 1110011
 * 1101110 1110011 1101000 10000100 1110101 1110010 10000101
 * 
 * Convert each number from binary to decimal
 * then convert the decimal to a letter using special decoder
 * 
 * @author Bernice 
 * @version 20160117
 */
public class SecretMessage {

    public static char convertNumToLetter(int number)
    {
        char letter = '+';

        if(number == 100)
            return 'A';
        if(number == 101)
            return 'B';
        if(number == 102)
            return 'C';
        if(number == 103)
            return 'D';
        if(number == 104)
            return 'E';
        if(number == 105)
            return 'F';
        if(number == 106)
            return 'G';
        if(number == 107)
            return 'H';
        if(number == 110)
            return 'I';
        if(number == 111)
            return 'J';
        if(number == 112)
            return 'K';
        if(number == 113)
            return 'L';
        if(number == 114)
            return 'M';
        if(number == 115)
            return 'N';
        if(number == 116)
            return 'O';
        if(number == 117)
            return 'P';
        if(number == 120)
            return 'Q';
        if(number == 121)
            return 'R';
        if(number == 122)
            return 'S';
        if(number == 123)
            return 'T';
        if(number == 124)
            return 'U';
        if(number == 125)
            return 'V';
        if(number == 126)
            return 'W';
        if(number == 127)
            return 'X';
        if(number == 130)
            return 'Y';
        if(number == 131)
            return 'Z';
        if(number == 132)
            return ' ';
        if(number == 133)
            return '.';
        if(number == 134)
            return '?';    
        return letter;

    }

    public static int convertBinaryToDecimal(String binNumber)
    {
        //convert binary number

        int decimalNumber = 0;

        for(int i = 0; i < binNumber.length(); i++)
        {        
            if(binNumber.charAt(i)== '1')
            {
                decimalNumber =  decimalNumber + (int)Math.pow(2, (binNumber.length()-1-i));
            }
        }

        return decimalNumber;
    }

    public static void main(String[] args)
    {
        //convert binary number
        String binNumber = "";
        int decimalNumber = 0;
        Scanner keyboard = new Scanner(System.in);
        String nextNumber = "y";
        String longString = "";

        do{

            System.out.println("Enter a binary number: ");
            binNumber = keyboard.nextLine();

            if(binNumber.length()< 32)
            {
                decimalNumber = convertBinaryToDecimal(binNumber);
                System.out.println("The number: " + decimalNumber + "=" + convertNumToLetter(decimalNumber));
            }
            System.out.println("Another Number? Enter y or n: ");
            nextNumber = keyboard.nextLine();
            longString += convertNumToLetter(decimalNumber);

        }while (nextNumber.equals("y"));
        System.out.println(longString);

    }

}
