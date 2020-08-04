/* Kathryn Greer
* Assignment 6
* March 21, 2018
*
* Textbook, Chapter 6, Exercise 6.22 Temperature Conversions
*
* Converts Celsius to Farenheit or vice versa depending on which temperature 
* scale is given by the user.
*
*/
import java.util.Scanner;

public class TempConversion
{    
    public static void main( String[] args )
    {
        // create class Scanner
        Scanner input = new Scanner ( System.in );
        
        // declare variables
        double temp;
        int scale;
        
        // print title
        System.out.println( "Temperature Conversion" );
        
        // prompt for temperature value
        System.out.print( "Enter Temperature: " );
        temp = input.nextInt();
        
        // prompt for temperature scale
        System.out.print( "Enter Scale: (1 for Farenheit or 2 for Celsius): " );
        scale = input.nextInt();
        
        // if statement determines what method to call
        if ( scale == 1 )
            {
                temp = ConvertToCelsius ( temp );
                System.out.printf( "Temperature in Celsius is %.0f\n", temp);
            }
        else if ( scale == 2 )
            {
                temp = ConvertToFahrenheit( temp );
                System.out.println( "Temperature in Fahrenheit is " + temp);
            }
        else
            System.out.println( "Invalid scale indicator." );   
    } // end method main
    
    // converts to Celsius
    public static double ConvertToCelsius ( double f )
    {
        double c = 5.0 / 9.0 * ( f - 32 );
        return c;
    } // end method ConvertToCelsius
    
    // converts to Fahrenheit
    public static double ConvertToFahrenheit ( double c )
    {
        double f = ( 9.0 / 5.0 * c ) + 32 ;
        return f;
    } // end method ConvertToFahrenheit
} // end class TempConversion