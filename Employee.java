/* Kathryn Greer
*  Assignment 3
*  January 4, 2018
* 
* Create a class called Employee that includes three 
* instance variables - first name (type String), last name
* (type String), and monthly salary. Create a constructor
* that initializes the three instance variables.  Write set 
* and get methods for each of the instance variables.  If the
* salary is not positive, do not set a value.  In addition, write
* a method named ytdSalary which will accept the month (as an 
* integer and returns the year to date salary.  Give each employee
* a 2.5% increase and display their new monthly salary
*
* Create a tester class to demonstrate the capabilities of the Employee Class
* Create two instances of the employee class.
*/
public class Employee
{
	// instance variables
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	// empty constructor
	public Employee()
	{
		//fill in the code to set default values to the instance variables
		firstName = "";
                lastName = "";
                monthlySalary = 0;
	}
	
	// constructor initializing instance variables with arguments
	public Employee( String f , String l , double sal )
	{
                //complete
                firstName = f;
                lastName = l;
                monthlySalary = sal;		
	}
	
	public void setFirstName (String f)
	{
		firstName = f;
	}
	
	public void setLastName (String l)
	{
		//complete the code to set the lastname
                lastName = l;
	}
	
	public void setSalary (double sal)
	{
		//complete the code to set the salary
                monthlySalary = sal;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
		
	//add the two additional methods getLast() and getSalary 
        public String getLastName()
        {
                return lastName;
        }
        
        public double getSalary()
        {
                return monthlySalary;
        }
	
	public double ytdSalary(int months)
	{
		double yearToDateSal;
		yearToDateSal = monthlySalary * months;
		return yearToDateSal;
	}

} // end class Employee
	
	