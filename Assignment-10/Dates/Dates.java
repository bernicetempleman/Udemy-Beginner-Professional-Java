
/**
 * Write a description of Dates here.
 * 
 * @author Bernice 
 * @version 20160113
 */
public class Dates  {  
    // --- add methods here to make the program work ---  
    // nameFormat  
    public static String nameFormat(int year, int month, int day){
        String date ="";
        if (month == 1)
            date = "January "+ day + ", " + year;
        if (month == 2)
            date = "February "+ day + ", " + year;
        if (month == 3)
            date ="March "+ day + ", " + year;
        if (month == 4) 
            date =  "April "+ day + ", " + year;
        if (month == 5)
            date =  "May "+ day + ", " + year;
        if (month == 6)
            date =  "June " + day + ", " + year;
        if (month == 7) 
            date =  "July "+ day + ", " + year;
        if (month == 8) 
            date =  "August "+ day + ", " + year;
        if (month == 9) 
            date =  "September "+ day + ", " + year;
        if (month == 10) 
            date =  "October "+ day + ", " + year;
        if (month == 11) 
            date = "November "+ day + ", " + year;
        if (month == 12) 
            date= "December "+ day + ", " + year;
        return date;
    }

    // slashFormat  
    public static String slashFormat(int year, int month, int day){
        String date = String.format("%02d/%02d/%d",month,day, year);
        return  date;
    }
    // dashFormat   
    public static String dashFormat(int year, int month, int day){
        return String.format("%d-%02d-%02d",year,month,day);
    }

    // ---- end of your work area -----

    // don't change this code.     

    public static void printDate(int year, int month, int day){
        System.out.println(nameFormat(year, month, day));         
        System.out.println(slashFormat(year, month, day));         
        System.out.println(dashFormat(year, month, day));         
        System.out.println();
    }          
    // don't change this code.     
    public static void main(String[] args){
        printDate(2014, 10, 4);
        printDate(2015, 1, 1);
        printDate(2013, 12, 31);
    }
} 