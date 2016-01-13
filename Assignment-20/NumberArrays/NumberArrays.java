
/**
 * Write a description of NumberArrays here.
 * 
 * Learning Goals 
 * 1. Practice using arrays 
 * 2. See data in a realistic context 
 * 
 * Business Goal
 * Write a program that calculates the average temperature per week,
 * for each of the last two weeks.  
 * 
 * Use the daily "high" temperature from a weather website for your location.  
 * Don't worry about rounding.  
 * Also keep track of which day was the warmest for each week. 
 * 
 * You can write the temperature values directly into an array in your program; 
 * you don't need keyboard input for this one. 
 * You should use program logic, though,
 * to calculate the average and the warmest day by looping through the array, 
 * rather than doing it by hand. 
 * @author Bernice 
 * @version 2016-01-13
 */
public class NumberArrays {

    public static void printTemperatures(double[] temperatures){
        for (int index = 0; index < temperatures.length; index++) {
            System.out.println("Index " + index + " is " + temperatures[index]); 
        } 
    }

    public static String getDay(int index){
        if(index==0)
            return "Sunday";
        if (index==1)
            return "Monday";
        if(index==2)
            return "Tuesday";
        if (index==3)
            return "Wednesday";
        if(index==4)
            return "Thursday";
        if (index==5)
            return "Friday";
        return "Saturday";
    }

    public static void main(String[] args){
        double[] temperature1 = { 71.3, 71.2, 71.2, 71.1, 71.1, 71.1, 71}; 
        double[] temperature2 = { 71, 71, 71, 71, 71.1, 71.1, 71.1}; 

        double total1 = 0.0;
        double total2 = 0.0;
        double warmestTemp1 = 0.0;
        int warmestIndex1 = 0;
        double warmestTemp2 = 0.0;
        int warmestIndex2 = 0;

        System.out.println("Week 1 High Temperatures");
        for (int index = 0; index < temperature1.length; index++) {
            total1 += temperature1[index];
            if(warmestTemp1 < temperature1[index]){
                warmestTemp1 = temperature1[index];
                warmestIndex1 = index;
            }
            if(index == 6)
                System.out.print( temperature1[index]);
            else
                System.out.print( temperature1[index] + ", ");

        }
        System.out.println();
        System.out.println();
        System.out.println("Week 2 High Temperatures");
        for (int index = 0; index < temperature2.length; index++) {
            total2 += temperature2[index];
            if(warmestTemp2 < temperature2[index]){
                warmestTemp2 = temperature2[index];
                warmestIndex2 = index;
            }
            if(index == 6)
                System.out.print( temperature2[index]);
            else
                System.out.print( temperature2[index] + ", ");

        }
        System.out.println();
        System.out.println();
        System.out.println("The average daily-high temperature for week 1 is " + (total1/7)+"."); 
        System.out.println("The average daily-high temperature for week 2 is " + (total2/7)+".");
        System.out.println("In week 1, " + getDay(warmestIndex1) + " was warmest, at "+ warmestTemp1 + " degrees.");
        System.out.println("In week 2, " + getDay(warmestIndex2) + " was warmest, at "+ warmestTemp2 + " degrees.");
    }

}

