
/**
 * Write a description of LeapYear here.
 * 
 * Learning Goals 1. Practice creating and using your own methods. 
 * 2. Practice creating test cases for your method. 
 * 3. Experience test-first development. 
 * 4. What makes this a challenge? 
 * You must design both the method and the test cases that validate it.  
 * 
 * Business Goal 
 * A leap year is a calendar year where February 29 is added to keep the calendar aligned 
 * with the movement of the Earth around the Sun.  
 * You will write a method isLeapYear() that determines whether a given year is a leap year.  
 * You only need to consider years greater than 500 and less than 5000.  
 * You don't need to worry about historical anomolies or calendar changes. 
 * Your method should check using the following logic. 
 * 1. A year is a leap year if its number is evenly divisible by 4. 
 * 2. But it's not a leap year if its number is also evenly divisible by 100. 
 * 3. But it is a leap year if its number is also evenly divisible by 400. 
 * Your isLeapYear method should return true if the year is a leap year; false otherwise. 
 * But first!!! You must write a main() that calls your method to test all of the following years. 
 * Leap Years  1600 2000  2400  1988  1996  2004  4000  
 * Non-Leap Years  1800 1900 2200 1987 1999 2006
 * Like in the practice you just completed, 
 * the test cases should show an error if the method gives the wrong results.  
 * You should keep track of how many test cases failed.  
 * If every test case passed, it should print "Success" but if any test case failed, 
 * it should print which one(s), and the count of how many failed. 
 * 
 * @author (Bernice Templeman) 
 * @version (20160110)
 */
public class LeapYear {
    public static boolean isLeapYear(int year){
        if((year % 4) != 0){
            return false;
        }
        if (((year % 100) == 0)&&((year % 400) != 0))
            return false;
        return true;
    }

    public static void main(String[] args){
        int testFailures = 0;
        if(!isLeapYear(1600)){
            System.out.println("Error 1: isLeapYear failed test. Expected true, got " + isLeapYear(1600));
            testFailures++;
        }

        if(!isLeapYear(2000)){
            System.out.println("Error 2: isLeapYear failed test. Expected true, got " + isLeapYear(2000));
            testFailures++;

        }

        if(!isLeapYear(2400)){
            System.out.println("Error 3: isLeapYear failed test. Expected true, got " + isLeapYear(2400));
            testFailures++;
        }

        if(!isLeapYear(1988)){
            System.out.println("Error 4: isLeapYear failed test. Expected true, got " + isLeapYear(1988));
            testFailures++;

        }

        if(!isLeapYear(1996)){
            System.out.println("Error 5: isLeapYear failed test. Expected true, got " + isLeapYear(1996));
            testFailures++;

        }

        if(!isLeapYear(2004)){
            System.out.println("Error 6: isLeapYear failed test. Expected true, got " + isLeapYear(2004));
            testFailures++;

        }

        if(!isLeapYear(4000)){
            System.out.println("Error 7: isLeapYear failed test. Expected true, got " + isLeapYear(4000));
            testFailures++;

        }

        if(isLeapYear(1800)){
            System.out.println("Error 8: isLeapYear failed test. Expected false, got " + isLeapYear(1800));
            testFailures++;

        }

        if(isLeapYear(1900)){
            System.out.println("Error 9: isLeapYear failed test. Expected false, got " + isLeapYear(1900));
            testFailures++;

        }

        if(isLeapYear(2200)){
            System.out.println("Error 10: isLeapYear failed test. Expected false, got " + isLeapYear(2200));
            testFailures++;

        }

        if(isLeapYear(1987)){
            System.out.println("Error 11: isLeapYear failed test. Expected false, got " + isLeapYear(1987));
            testFailures++;

        }

        if(isLeapYear(1999)){
            System.out.println("Error 12: isLeapYear failed test. Expected false, got " + isLeapYear(1999));
            testFailures++;

        }

        if(isLeapYear(2006)){
            System.out.println("Error 13: isLeapYear failed test. Expected false, got " + isLeapYear(2006));
            testFailures++;

        }

        if (testFailures == 0) {
            System.out.println("Success!  All test cases passed.");
        } else {
            System.out.println(testFailures + " tests failed.  Keep trying!");
        }

    }

}
