// Fig. 7.2 InitArray.java
// Initializing the elements of an array to default values of zero

public class InitArray
{
    public static void main ( String[] args )
    {
        // initializer list specifies the value for each element
        // int[] array = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37};
        
        int[] array; // declare array named array
        
        array = new int[ 10 ]; // create the array object
        
        System.out.printf( "%s%8s\n", "Index", "Value" ); // column headings
        
        // output each array element's value
        for ( int counter = 0; counter < array.length; counter++ )
            System.out.printf ( "%5d%8d\n", counter, array[ counter ] );
    } // end main
}