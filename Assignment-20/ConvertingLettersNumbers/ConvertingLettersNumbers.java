
/**
 * Write a description of ConvertingLettersNumbers here.
 * 
 * Learning Goals 
 * 1. Practice with ascii 
 * 2. Practice with logic  
 * 
 * Business Goal 
 * 1. Convert this hidden message from a numbers array to a character array based on ASCII values.  
 * Then print the message. { 89, 111, 117, 39, 114, 101, 32, 97, 32, 115, 116, 97, 114, 33 }  
 * 2. Convert this message from a character array to a number array based on their ASCII values.  
 * Then print the numbers. Message:   Crow flies at dawn.  
 * The numbers should print with commas between them, all in one line.  
 * Don't worry if you end up with an extra comma at the end.  
 * 
 * Testing 
 *  Ensure you have the right number of letters / numbers for each of the two puzzles. 
 *  Ensure that the message you get for the first one makes sense. 
 *  Ensure that the numbers for the second one match with the letters, spaces, and period at the end of the sentence. 
 * 
 * @author Bernice 
 * @version 2016-01-13
 */
public class ConvertingLettersNumbers {
    public static void main(String[] args){

        int[] message = { 89, 111, 117, 39, 114, 101, 32, 97, 32, 115, 116, 97, 114, 33 };
        char[] charMessage = new char[message.length];

        for (int i = 0; i < message.length; i++){
            char letter = (char) message[i];
            System.out.print(letter);
            charMessage[i] = letter;
        }
        System.out.println();
        for (int i = 0; i < charMessage.length; i ++){
            System.out.print(charMessage[i]);
        }

        String charMessage2 =  new String ("Crow flies at dawn.");
        int[] message2 = new int[charMessage2.length()];
        System.out.println();
        for (int i = 0; i < charMessage2.length(); i ++){
            System.out.print(charMessage2.charAt(i));
            message2[i] = (int)charMessage2.charAt(i);
        }
        System.out.println();
        for (int i = 0; i < message2.length; i ++){
            System.out.print(message2[i]+ " ");
        }
        System.out.println();
        char[] charMessage3= new char[message2.length];
        for (int i = 0; i < message2.length; i++){
            char letter = (char) message2[i];
            System.out.print(letter);
            charMessage3[i] = letter;
        }
        System.out.println();
        for (int i = 0; i < charMessage3.length; i ++){
            System.out.print(charMessage3[i]);
        }
    }

}
