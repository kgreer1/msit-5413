public class SumInteger
{
      public static void main( String[] args )
      {
          int sum = 0;
          int x = 0;
          
          while ( sum < 11 )
          {
          sum  = sum + x;
          System.out.println( "The sum is " + sum );
          ++x;
          }
      }
}