
/**
 * Write a description of Uppercase here.
 * Learning Goals 
 * 1. Practice with ascii
 * 2. Practice with logic  
 * 
 * Business Goal 
 * Write code that will convert some text from mixed-case to all uppercase. 
 * 
 * Here's the message text:  Why is Easter in the Spring?  
 * 
 * You should write a method that takes a character array, converts the lowercase letters to uppercase,
 * and returns a character array with all uppercase.  
 * Remember that you won't change spaces or punctuation marks.  
 * 
 * Testing Look at your results.  It should be fairly obvious whether it's right. 
 * 
 * @author Bernice
 * @version 2016-01-13
 */
public class Uppercase {

    public static char[] toUpper(char[] oldString){
        char[] newString = new char[oldString.length];

        for(int i = 0; i < oldString.length; i++){
            if((oldString[i] >= 'a')&&(oldString[i] <= 'z'))
            {
                newString[i] = (char) (((int)oldString[i])-32 );
            }
            else 
                newString[i]= oldString[i];
        }
        return newString;
    }

    public static void main(String[] args){

        String messageString = "Why is Easter in the Spring?";
        char[] messageArray = messageString.toCharArray();
        char[] newMessage = toUpper(messageArray);

        System.out.println("Printing String\n"+messageString + "\n");

        System.out.println("Printing character array");
        for (int i = 0; i < messageArray.length; i ++){
            System.out.print(messageArray[i]);
        }
        System.out.println("\n\nPrinting Uppercase");
        for (int i = 0; i < newMessage.length; i ++){
            System.out.print(newMessage[i]);
        }

    }

}

