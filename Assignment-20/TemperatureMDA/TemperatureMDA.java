
/**
 * Write a description of TemperatureMDA here.
 * 
 * Learning Goals
 * 1. Practice using multi-dimensional arrays
 * 2. See data in a realistic context
 * 
 * Business Goal
 * Your neighborhood gardener has made a chart of daily temperatures for the past week. 
 * She's going to provide more data later,
 * but first she wants a proof of concept program that calculates average temperatures 
 * at a given time of day.
 * Here's the data chart. In the below sample run, you'll see 99's used as examples. 
 * In your real program, you should use the data in THIS CHART instead. 
 *             Sun Mon Tue Wed Thu Fri Sat
 *              0   1   2   3   4   5   6 
 *   7:00 AM 0 68  70  76  70  68  71  75 
 *   3:00 PM 1 76  76  87  84  82  75  83 
 *   7:00 PM 2 73  72  81  78  76  73  77 
 *   3:00 AM 3 64  65  69  68  70  74  72
 *   
 *   Put this data into a multi-dimensional array (7 by 4) inside your code.
 *   
 *   Then, calculate averages in both directions over the data:
 *   1. What is the average temperature for each day? (Your code should produce 7 results.)
 *   2. What is the average temperature for each time? (Your code should produce 4 results.)
 *   3. What is the final average temperature overall? (Your code should produce 1 result.)
 *   You will probably want to use nested for loops to navigate the array. 
 *   The outer for-loop identifies the row (time of day), while the inner for-loop identifies the column (day of week).
 * 
 * @author Bernice 
 * @version 1016-01-16
 */
public class TemperatureMDA 
{

    public static void main(String[] args)
    {
        //one way
        int[][] temps = new int[4][7];
        temps[0][0] = 68;
        temps[3][6] = 72;

        //another way
        int[][] tempArray = {
                {68, 70, 76, 70, 68, 71, 75 },
                {76, 76, 87, 84, 82, 75, 83 },
                {73, 72, 81, 78, 76, 73, 77 },
                {64, 65, 69, 68, 70, 74, 72 }
            };

        //and another way
        int [][] A;
        A  =  new int[][] {  
            { 68, 70, 76, 70, 68, 71, 75 },
            { 76, 76, 87, 84, 82, 75, 83 },
            { 73, 72, 81, 78, 76, 73, 77 },
            { 64, 65, 69, 68, 70, 74, 72 }
        };

        /*
        //print with nested for loop
        for(int row = 0 ; row < tempArray.length; row++)
        {
        for (int col = 0; col < tempArray[row].length; col++)
        {
        System.out.printf("%d ",tempArray[row][col]);
        }
        System.out.println();
        }

        // print with for-each loop:
        for (int[] row : tempArray){
        for (int col : row)
        System.out.printf("%d ",col);
        System.out.println();
        }
         */

        System.out.println("Temperature Calculator\n");

        int sunTotal = 0;
        int monTotal = 0;
        int tueTotal = 0;
        int wedTotal = 0;
        int thuTotal = 0;
        int friTotal = 0;
        int satTotal = 0;
        int amTotal7 = 0;
        int amTotal3 = 0;
        int pmTotal7 = 0;
        int pmTotal3 = 0;

        System.out.print("The data provided are:\n");
        for(int row = 0 ; row < tempArray.length; row++)
        {
            if (row == 0)
                System.out.print("7 AM:  ");
            else if (row == 1)
                System.out.print("3 PM:  ");
            else if (row == 2)
                System.out.print("7 PM:  ");
            else if (row == 3)
                System.out.print("3 AM:  ");

            for (int col = 0; col < tempArray[row].length; col++)
            {
                System.out.printf("%d ",tempArray[row][col]);
                if (row == 0)
                    amTotal7+=tempArray[row][col];
                else if (row == 1)
                    pmTotal3+=tempArray[row][col];
                else if (row == 2)
                    pmTotal7+=tempArray[row][col];
                else if (row == 3)
                    amTotal3+=tempArray[row][col];
                if(col == 0)
                    sunTotal +=tempArray[row][col];
                else if( col == 1)
                    monTotal +=tempArray[row][col];
                else if( col == 2)
                    tueTotal +=tempArray[row][col];
                else if( col == 3)
                    wedTotal +=tempArray[row][col];
                else if( col == 4)
                    thuTotal +=tempArray[row][col];
                else if( col == 5)
                    friTotal +=tempArray[row][col];
                else if( col == 6)
                    satTotal +=tempArray[row][col];

            }
            System.out.println();
        }
        System.out.println("\nBased on that data, the following are the average temperatures for the week.\n");

        System.out.println("Sun: " + sunTotal/4);
        System.out.println("Mon: " + monTotal/4);
        System.out.println("Tue: " + tueTotal/4);
        System.out.println("Wed: " + wedTotal/4);
        System.out.println("Thu: " + thuTotal/4);
        System.out.println("Fri: " + friTotal/4);
        System.out.println("Sat: " + satTotal/4);
        System.out.println("\n7 AM: " + amTotal7/7);
        System.out.println("3 PM: " + pmTotal3/7);
        System.out.println("7 PM: " + pmTotal7/7);
        System.out.println("3 AM: " + amTotal3/7);
        System.out.println("\nThe final average temperature for the week was:");
        int weekTotal = amTotal7 + pmTotal3 + pmTotal7 + amTotal3;
        System.out.println("\nOverall: " + weekTotal/28 );
    }

}