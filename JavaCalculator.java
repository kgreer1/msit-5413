// Assignment 2 Java Calculator
// Kathryn Greer
// MSIT 5413
// January 17, 2018
import java.util.Scanner; // uses class Scanner to gather user input

public class JavaCalculator {
    
    // main method
    public static void main( String[] args)
    {
        // create Scanner to obtain input from user
        Scanner input = new Scanner ( System.in );
        
        // declare variables, user will provide values
        int number1;
        int number2;
        
        System.out.println( "Welcome to the Java Calculator." );
        
        System.out.print( "Please provide an integer: "); // prompt
        number1 = input.nextInt(); // user input
        
        System.out.print( "Please provide another integer: " ); // prompt
        number2 = input.nextInt(); // user input
        
        // calculated values
        System.out.printf( "Sum is %d\n" , number1 + number2 );
        
        System.out.printf( "Product is %d\n" , number1 * number2 );
        
        System.out.printf( "Difference is %d\n" , number1 - number2 );
        
        System.out.printf( "Quotient is %d\n" , number1 / number2 );
        
        System.out.println( "Thank you for using Java Calculator" );
    } // end method main
} // end class JavaCalculator