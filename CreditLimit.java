public class CreditLimit
{
    public static void main ( String[] args )
    {
        // declare variables
        String accountNumber = "A507";
        double balance = 150.00;
        double credits = 450.00;
        double charges = 2000.00;
        double creditLimit = 500.00;
        
        balance = balance + charges - credits;
        System.out.println( "Account Number: " + accountNumber );
        System.out.println( "Current Balance: " + balance );
        if (balance > creditLimit)
            System.out.println( "Credit limit is exceeded." );
    }
}