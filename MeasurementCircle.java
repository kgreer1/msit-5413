// Chapter 2, Exercise 2.28, p. 68
// Kathryn Greer
// MSIT 5413
// January 18, 2018
import java.util.Scanner; // class Scanner to gather user input

public class MeasurementCircle // main class
{
    public static void main( String[] args ) // main method
    {
        // create Scanner object
        Scanner input = new Scanner ( System.in );
        
        // variables
        int radius;
        
        // prompt user for value
        System.out.print( "Enter the radius of a circle: ");
        radius = input.nextInt();
        
        // outputs
        System.out.printf( "The diameter of a circle with the given radius is %d\n" ,
                2 * radius );
        
        System.out.printf( "The circumference of a circle with the given radius is %.4f\n" ,
                2 * Math.PI * radius );
        
        System.out.printf( "The area of a circle with the given radius is %.4f\n" ,
                Math.PI * ( radius * radius ) );
        
    } // end method main
} // end class MeasurementCircle
