//practice using the values in an array

public class arrayPrac2
{
   public static void main (String [] args)
   {
      //declare an array of 5 random numbers between 60 and 100
      int [] grades = new int [5];
      
      //populate the array
      for (int i = 0; i<grades.length; i++)
      {
         grades[i]=(int)(60+Math.random()*40);
      }
      
      //display the array
      display(grades);
      
      //determine average
      int total=0;
      double average;
      
      //accumulat values of the array in total
      int i;
      for ( i=0; i<grades.length; i++)
      {
         total= total+grades[i]; //or total+=grades[i];
      }
      average=total/(i*1.0);  //or average=total/(grades.length*1.0)
      
      //display average
      System.out.println("average:  " + average);
      }//close main
      
      public static void display (int [] n)
      {
          for (int i = 0; i < n.length; i++)
         {
            System.out.println (i+"\t" + n[i] );
            
         }
         System.out.println();
       }//close display method
       
 }//close class
