/* Kathryn Greer
* Assignment 4-1
* January 23, 2018
*
* Resources used: Textbook, Chapter 4, Section 4.6
*
* Calculates the interest rate for a loan based on a user submitted credit 
* score.
*/
import java.util.Scanner; // uses class Scanner to gather user input

public class LoanInterestRate
{
    public static void main( String[] args )
    {
        // create class Scanner
        Scanner input = new Scanner ( System.in );
        
        // declare variables
        int creditScore;
        double interestRate;
        
        // prompt user for credit score
        System.out.print( "What is your credit score? " );
        creditScore = input.nextInt();
        
        // assign interest rate based on value of creditScore
        if ( creditScore > 850 )
            interestRate = -1.0;
        else if ( creditScore >= 720 )
            interestRate = 5.56;
        else if ( creditScore >= 690 )
            interestRate = 6.38;
        else if ( creditScore >= 660 )
            interestRate = 7.12;
        else if ( creditScore >= 625 )
            interestRate = 9.34;
        else if ( creditScore >= 590 )
            interestRate = 12.45;
        else
            interestRate = 0;
        
        // display credit score and interest rate
        if ( interestRate > 0 )        
        System.out.printf( "Your credit score of %d qualifies you for a loan"
                + " with an interest rate of %.2f percent.\n" , 
                creditScore, interestRate );
        else if ( interestRate == 0 )
        System.out.printf( "Your credit score of %d does not qualify you for"
                + " a loan.\n" , creditScore );
        else
        System.out.printf( "Your credit score of %d is invalid.\n" , creditScore);
        
    } // end method main
} // end class LoanInterestRate