/* Kathryn Greer
* January 8, 2018
* Assignment 3-1
*
* Resources used: Textbook Chapter 3
*
* Exercise 3.13 pg. 100-101
* Creates an invoice class for a hardware store, including information such as
* part number, part description, quantity ordered, and item price. Also 
* includes a method to calculate the invoice total based on item price and 
* quantity of items ordered.
*/
public class Invoice 
{
    // instance variables
    private String partNumber;
    private String partDescrip;
    private int orderQuantity;
    private double itemPrice;
    
    // empty contructor
    public Invoice()
            {
                partNumber = "";
                partDescrip = "";
                orderQuantity = 0;
                itemPrice = 0.0;
            }
    
    // constructor
    public Invoice( String n , String d , int q , double p )
            {
                // initialize instance variables with arguments
                partNumber = n;
                partDescrip = d;
                orderQuantity = q;
                if ( q < 0 )
                    orderQuantity = 0;
                itemPrice = p;
                if ( p < 0 )
                    itemPrice = 0;
            }
    
    // methods to set variables
    public void setPartNumber( String n )
            {
                partNumber = n;
            }
    
    public void setPartDescrip( String d )
            { 
                partDescrip = d;
            }
    
    public void setOrderQuantity( int q )
            {
                orderQuantity = q;
                if ( q < 0 )
                    orderQuantity = 0;
            }
    
    public void setItemPrice( double p )
            {
                itemPrice = p;
                if ( p < 0 )
                    itemPrice = 0;
            }
    
    // methods to get variables 
    public String getPartNumber()
            {
                return partNumber;
            }
    
    public String getPartDescrip()
            {
                return partDescrip;
            }
    
    public int getOrderQuantity()
            {
                return orderQuantity;
            }
    
    public double getItemPrice()
            {
                return itemPrice;
            }
    
    // method to calculate the total invoice amount
    public double getInvoiceAmount()
            {
                double invoiceAmount;
                invoiceAmount = itemPrice * orderQuantity;                 
                return invoiceAmount;
            }
} // end class Invoice