/* Kathryn Greer
* January 8, 2018
* Assignment 3-1
*
* Resources used: Textbook Chapter 3
*
* Exercise 3.13 pg. 100-101
* Tester for class Invoice. Creates three invoice objects and displays part
* number, part description, order quantity, item price, and invoice total
* for each invoice.
*/
public class InvoiceTest
{
    // main method
    public static void main( String [] args )
    {
        // create invoice objects
        Invoice inv01 = new Invoice();
        Invoice inv02 = new Invoice( "AZ445" , "Hammer" , 5 , 18.98 );
        Invoice inv03 = new Invoice( "GH567" , "Screwdriver Set" , 2 , 24.98 );
        
        // set variables for inv01
        inv01.setPartNumber( "NN765" );
        inv01.setPartDescrip( "Extension Ladder" );
        inv01.setOrderQuantity( 2 );
        inv01.setItemPrice( 236.95 );
         
        // invoice title
        System.out.println( "THE BEST HARDWARE STORE" );
        
        // print blank line
        System.out.println();
        
        // invoice 01
        System.out.println( "INVOICE 01" );
        System.out.println( "Item: " + inv01.getPartDescrip() );
        System.out.println( "Quantity: " + inv01.getOrderQuantity() + " at $" 
                + inv01.getItemPrice() );
        System.out.printf( "Total: $%.2f\n" , inv01.getInvoiceAmount() );
        
        // print blank line
        System.out.println();
                
        // invoice 02
        System.out.println( "INVOICE 02" );
        System.out.println( "Item: " + inv02.getPartDescrip() );
        System.out.println( "Quantity: " + inv02.getOrderQuantity() + " at $" 
                + inv02.getItemPrice() );
        System.out.printf( "Total: $%.2f\n" , inv02.getInvoiceAmount() );
        
        // print blank line
        System.out.println();
                
        // invoice 03
        System.out.println( "INVOICE 03" );
        System.out.println( "Item: " + inv03.getPartDescrip() );
        System.out.println( "Quantity: " + inv03.getOrderQuantity() + " at $" 
                + inv03.getItemPrice() );
        System.out.printf( "Total: $%.2f\n" , inv03.getInvoiceAmount() );
    } // end method main
} // end class InvoiceTest