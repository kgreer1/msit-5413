/*  Write a program that will allow the user to enter
*   numbers until a -1 is input.  Total and count the numbers
*   Determine the number of even and odd numbers.
*/

//numbers adjusted for counter controlled while loop
import java.util.Scanner;
public class numbersCounter 
{
   public static void main (String [] args)
   {
      //declare variables
      //initialize variable for accumulating and counting
      int num;
      int total = 0;
      int counter = 0; 
      int even = 0, odd =0;
      Scanner input = new Scanner (System.in);
      //loop - condition to end loop
      //       loop control variable
      //       loop control variable must change values
      
      //loop will iterate 4 times     
      while(counter<4)
      {
         //prompt user for another number or -1   
         System.out.println("Please enter 4 numbers");
         num=input.nextInt();
         
         //accumulating total
         total+=num; //or total=total+num;
         //counter increasing by 1
         counter++;
         
         //determine if number is even or odd
         if(num%2==0)
            even++;
            else
               odd++;
      
               
         }//ends while loop
         
         //display results
         System.out.println("number of values entered: " + counter);
         System.out.println("total of all numbers entered:  " + total);
         System.out.println("total even numbers: " + even);
         System.out.println("total odd numbers:  " + odd);       
             
        }//close main
 }//close class