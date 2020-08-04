// Assignment 2-3 Measurement Calculator
// Kathryn Greer
// MSIT 5413
// January 18, 2018
import java.util.Scanner; // uses class Scanner to gather user input

public class MeasurementCalculator // main class declaration
{
    // main method declaration
    public static void main( String[] args )
    {
        // create Scanner to obtain input from user
        Scanner input = new Scanner ( System.in );
        
        // variable declaration, user will provide values
        double length;
        double width;
        
        // prompt user for values
        System.out.println( "MEASUREMENT CALCULATOR" );
        System.out.println( "Instructions: Provide a length and width for a "
                + "rectangle, and this tool will calculate the area and perimeter "
                + "up to three decimal places." );
                
        System.out.print( "What is the length of the rectangle? " ); // prompt
        length = input.nextDouble(); // user input
        
        System.out.print( "What is the width of the rectangle? " ); // prompt
        width = input.nextDouble(); // user input
        
        // calculations
        double area = length * width; // calculates area of rectangle
        double perimeter = 2 * length + 2 * width; // calculates perimter of rectangle
               
        // outputs
        System.out.printf( "AREA: %.3f\n" , area );
        System.out.printf( "PERIMETER: %.3f\n", perimeter );
        
    } // end method main
} // end class MeasurementCalculator 