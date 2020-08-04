/* Kathryn Greer
* Assignment 4
* January 16, 2018
*
* Resources used: Textbook, Chapter 4
*
* Exercise 4.17, pg. 146
* Gathers miles driven and gallons used for a series of trips, then calculates
* and displays the miles per gallon per trip and combined of all trips.
* Uses class scanner to obtain data from user and sentinel-controlled 
* repetition.
*/
import java.util.Scanner; // uses class Scanner to gather user input

public class GasMileage
{
    public static void main( String[] args )
    {
        // create class Scanner
        Scanner input = new Scanner ( System.in );
       
        // declare and initalize variables
        int miles;
        int gallons;
        int tripCounter = 0;
        double mpg;
        int milesTotal = 0;
        int gallonsTotal = 0;
        double mpgTotal;

        // prompt user for miles driven
        // provides dummy value to exit
        System.out.print( "Enter miles driven (or -1 to exit): " );
        miles = input.nextInt();
        
        // loop executes while miles value is NOT equal to dummy value
        while ( miles != -1 )
        {
            // increment trip count
            tripCounter += 1;
            
            // prompt user for gallons used
            System.out.print( "Enter gallons used: " );
            gallons = input.nextInt();
            
            // calculate trip mpg
            // produces a double result
            mpg = (double) miles / gallons;
            
            // output trip information and caculated mpg
            System.out.printf( "Trip %d MPG: %.3f\n" , tripCounter, mpg );
            
            // add miles and gallons values to running total
            milesTotal = milesTotal + miles;
            gallonsTotal = gallonsTotal + gallons;
            
            // calculate combined mpg
            // produces a double result
            mpgTotal = (double) milesTotal / gallonsTotal; 
            
            // output combined mpg so far
            System.out.printf( "Combined MPG: %.3f\n" , mpgTotal );
            System.out.println();
            
            // reset the loop or exit
            System.out.print( "Enter miles driven (or -1 to exit): " );
            miles = input.nextInt();
        } // end while
        
        System.out.println( "Have a good day." );
        
    } // end method main
} // end class GasMileage