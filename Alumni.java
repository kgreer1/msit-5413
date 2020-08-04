/*  Create a class to hold information
*about alumni. Include name, contribution amount,
* year,and major. Create set and get method.
* Create 3 objects of the alumni class. 
*/
public class Alumni
{
   //instance variables
   private String name;
   private double contriAmt;
   private int year;
   private String major;
   
   //default constructor
   public Alumni()
   {
      name="";
      contriAmt=0;
      year=0;
      major=null;
    }
    
    //parameterized constructor
    public Alumni(String n, double c, int y, String m)
    {
      name=n;
      contriAmt=c;
      year=y;
      major=m;
      }
      
     //create a set method for name and year
     //set method will have a parameter list
     //set methods will have a return type of void
     //mutator methods
     
     public void setName(String n)
     {
         name=n;
     }
     public void setYear(int yr)
     {
         year=yr;
      }
      
      public void setContriAmt(double c)
      {
         contriAmt=c;
      }
      
      public void setMajor(String m)
      {
         major=m;
      }
    
     
     //create a get method for name, major and contriAmt;
     //accessor methods
     //return type with the return keyword in the method
    public String getName()
    {
      return name;
    }
    
    public String getMajor()
    {
      return major;
    }
    
    public double getContriAmt()
    {
      return contriAmt;
    }
    
    //method to create a string to hold the value of the 
    //instance variables
    public String display()
    {
      String out;
      out=name + "\t" + major + "\t" + year + "\t" + contriAmt;
      return out;
     }
    
 }//closes class
   
   
   
   

