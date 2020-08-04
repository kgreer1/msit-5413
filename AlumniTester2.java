import java.util.Scanner;
import java.util.ArrayList;
public class AlumniTester2
{
   public static void main (String [] args)
   {
      //create a scanner object
      Scanner in = new Scanner (System.in);
      
      //declare variable
      String aName;
      //declare arraylist alumList
      ArrayList <Alumni> alumList = new ArrayList <Alumni>();
      
      //create an object of the alumni class named a1
      Alumni a1 = new Alumni("Brown", 1000, 2017, "IT");
      
      //add a1 to alumList
      alumList.add(a1);
      //test for a1 values
      //System.out.println(a1.display());
      
      //display 1st element in arraylist
      System.out.println(alumList.get(0).display());
      
      Alumni a2; 
       
      //user input 2 additional objects to the arraylist
      for (int i=0; i<2; i++){
            
            a2=new Alumni();
            System.out.println("Please enter name");
            aName = in.nextLine();
            a2.setName(aName);
            
            System.out.println("Please enter a major");
            a2.setMajor(in.nextLine());
            
            System.out.println("Please enter amount");
            a2.setContriAmt(in.nextDouble());
            
            in.nextLine();
            
            alumList.add(a2);
        }//close for loop
      //System.out.println(a2.display());
      //display items in the arrayList
      for (int i=0; i<alumList.size(); i++)
         System.out.println(alumList.get(i).display());
      
      double totalContributions=0;
      for(int i=0; i<alumList.size();i++)
      {
         totalContributions=totalContributions+alumList.get(i).getContriAmt();
      }
      /*same as above but using for each loop
      for (Alumni a: alumList)
      {
            totalContributions += a.getContriAmt();
      }
      */
      System.out.println("Total Contributions " + totalContributions);
      }
 }