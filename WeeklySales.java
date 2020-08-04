/* Kathryn Greer
* Assignment 7
* April 7, 2018
*
* Collects weekly sales data, calculates total weekly sales, day of lowest
* sales, and day of highest sales.
*
*/
import java.util.Scanner;

public class WeeklySales
{
    // main method
    public static void main( String[] args )
    {
        // declare and initalize variables
        double sundaySales;
        double mondaySales;
        double tuesdaySales;
        double wednesdaySales;
        double thursdaySales;
        double fridaySales;
        double saturdaySales;
        double totalWeeklySales = 0;
        
        // create scanner object to gather user input
        Scanner input = new Scanner( System.in );
        
        // gather sales data for each day
        System.out.print( "Enter total sales for Sunday: " );
        sundaySales = input.nextDouble();
        
        System.out.print( "Enter total sales for Monday: " );
        mondaySales = input.nextDouble();
        
        System.out.print( "Enter total sales for Tuesday: " );
        tuesdaySales = input.nextDouble();
        
        System.out.print( "Enter total sales for Wednesday: " );
        wednesdaySales = input.nextDouble();
        
        System.out.print( "Enter total sales for Thursday: " );
        thursdaySales = input.nextDouble();
        
        System.out.print( "Enter total sales for Friday: " );
        fridaySales = input.nextDouble();
        
        System.out.print( "Enter total sales for Saturday: " );
        saturdaySales = input.nextDouble();
        
        // array of week days
        String[] weekDays = { "Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday" };
        
        // array of sales data
        double[] weeklySales = { sundaySales, mondaySales, tuesdaySales,
            wednesdaySales, thursdaySales, fridaySales, saturdaySales };
        
        // calculate total sales for the week
        for ( double sales : weeklySales )
            totalWeeklySales += sales;
        System.out.printf( "Total sales for the week: $%.2f\n", 
                totalWeeklySales );
        
        // find lowest sales
       double lowSaleTotal = findLow( weeklySales );
       System.out.printf( "Lowest sales = $%.2f\n", lowSaleTotal );
        
        // find highest sales
        double highSaleTotal = findHigh( weeklySales );
        System.out.printf( "Highest sales = $%.2f\n", highSaleTotal );
        

    } // end method main
    
    public static double findLow( double[] salesArray )
    {
        double lowSale = salesArray[0];
        
        for ( double sales : salesArray )
        {
            if ( sales < lowSale )
                lowSale = sales;
        } // end for
        
        return lowSale;
    } // end method findLow
    
    public static double findHigh( double[] salesArray )
    {
        double highSale = salesArray[0];
        
        for ( double sales : salesArray )
        {
            if ( sales > highSale )
                highSale = sales;
        } //end for
        
        return highSale;
    } // end method findHigh
  
} // end class WeeklySales