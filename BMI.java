// Exercise 2.33 p.69 BMI Calculator
// Kathryn Greer
// MSIT 5413
// January 16, 2018
import java.util.Scanner; // uses class Scanner

public class BMI
{
    // main method
    public static void main( String[] args)
    {
        // create Scanner to obtain input from cmd line
        Scanner input = new Scanner ( System.in );
        
        int weight;
        int height;
        int calcBMI;
        
        System.out.println( "Calculate your BMI" );
        
        System.out.print( "Enter your weight in pounds: "); // prompt
        weight = input.nextInt(); // user input
        
        System.out.print( "Enter your height in inches: " ); // prompt
        height = input.nextInt(); // user input
        
        calcBMI = (weight * 703) / (height * height); // calculates BMI
        
        System.out.printf( "Your BMI is %d. ", calcBMI);
        
        if ( calcBMI < 18.5 )
            System.out.println( "You may be underweight." );
        
        if ( calcBMI <= 24.9 )
            System.out.println( "You have a normal BMI." );
        
        if ( calcBMI <= 29.9 )
            System.out.println( "You may be overweight." );
        
        if ( calcBMI > 30 )
            System.out.println( "You may be obese." );
        
        System.out.println( "Thank you for using this BMI calculator.");
    } // end method main
} // end class BMI
