// Assignment 2-2 Cash Register
// Kathryn Greer
// MSIT 5413
// January 17, 2018
import java.util.Scanner; // uses class Scanner to gather user input

public class CashRegister {
    
    // main method
    public static void main( String[] args )
    {
        // create Scanner to obtain input from user
        Scanner input = new Scanner( System.in );
        
        // declare variables, user will provide values
        double item1;
        double item2;
        double item3;
        
        System.out.println( "This cash register will calculate your purchase total." );
        
        System.out.print( "What is the price of your first item? "); // prompt
        item1 = input.nextDouble(); // user input
        
        System.out.print( "What is the price of your second item? " ); // prompt
        item2 = input.nextDouble(); // user input
        
        System.out.print( "What is the price of your third item? " ); // prompt
        item3 = input.nextDouble(); // user input
        
        // calculations
        double purchaseSubtotal = item1 + item2 + item3;
        double salesTax = .06;
        double purchaseTax = purchaseSubtotal * salesTax;
        double purchaseTotal = purchaseSubtotal + purchaseTax;
        
        // receipt listing
        System.out.println( "RECEIPT" );
        System.out.printf( "Item 1: $%.2f\n" , item1 );
        System.out.printf( "Item 2: $%.2f\n" , item2 );
        System.out.printf( "Item 3: $%.2f\n" , item3 );
        System.out.printf( "Subtotal: $%.2f\n" , purchaseSubtotal );
        System.out.printf( "Sales Tax: $%.2f\n" , purchaseTax );
        System.out.printf( "Total: $%.2f\n", purchaseTotal );
               
    } // end method main
} // end class CashRegister