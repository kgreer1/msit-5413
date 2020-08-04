public class arrayPrac3
{
   public static void main (String[]args)
   {
      //declare and populate a3 - an array of 5 integers
      int [] a3 = new int [5];
      for (int i=0; i<a3.length; i++)
      {
         a3[i]=i+3;
      }
      
      //display each element of the a3 array
      for (int element: a3)
         System.out.println(element);
      
      System.out.println();     
      //method call with the array a3 being
      //passed as an argument   
      aMethod(a3);
      
      //display the modified array
      for (int element: a3)
         System.out.println(element);
    }//close main
    
   //method to receive an integer array
   //reassign the values by adding 3 to existing element values
   public static void aMethod(int [] a3)
   {
      for (int i=0; i<a3.length; i++)
         a3[i]+=3;
   }//close method
}//close class