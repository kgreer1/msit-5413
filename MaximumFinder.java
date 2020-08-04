// Fig 6.4 Maximum Finder
import java.util.Scanner;

public class MaximumFinder
{
    // obtain three floating-point values and locate the max
    public void determineMaximum()
    {
        // create Scanner for input from command window
        Scanner input = new Scanner ( System.in );
        
        // obtain user input
        System.out.print( "Enter three floating-point values seperated by spaces: ");
            double number1 = input.nextDouble(); 
            double number2 = input.nextDouble();
            double number3 = input.nextDouble();
            
            // determine max value
            double result = maximum( number1, number2, number3 );
            
            // display max value
            System.out.println( "Maximum is " + result );
    } // end method determineMaximum
            
        //returns max of its three double parameters
        public double maximum ( double x, double y, double z )
        {
            double maxValue = x; // assume x is largest to start
            
            // determine if y is greater than maxValue
            if ( y > maxValue )
                maxValue = y;
            
            // determine if z is greater than maxValue
            if ( z> maxValue )
                maxValue = z;
            
            return maxValue;
        } // end method maximum
} // end class MaximumFinder