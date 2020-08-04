/* Kathryn Greer
*  Assignment 3
*  January 4, 2018
*
*  Tester for Employee.java. Creates two objects of class Employee and displays
*  employee name, monthly salary, YTD salary, and their new salary with a 2.5% 
*  raise included.
*/
public class EmployeeTester
{
	public static void main (String [] args)
	{
		final double increase = 0.025;
                int mo = 9;
                
		// Create two instances of the Employee class
		Employee jas = new Employee();
		Employee cab = new Employee( "Alice" , "Cason" , 4000.00 );
		
		// set first name, last name and salary for employee jas
		jas.setFirstName( "James" );
                jas.setLastName( "King" );
                jas.setSalary( 3000.00 );
		
		// display the name and salary of both Employee objects
		System.out.println( "Employee A name: " 
                        + jas.getFirstName() + " " + jas.getLastName() );
                System.out.println( "Employee A salary: " + jas.getSalary() );
                System.out.println( "Employee B name: "
                        +cab.getFirstName() + " " + cab.getLastName() );
                System.out.println( "Employee B salary: "
                        +cab.getSalary() );
		
		// determine the year to date salary for both employees
                
                // employee jas
                System.out.println();
		System.out.println( jas.getFirstName() + "'s salary");
		System.out.println( "Monthly: " + jas.getSalary() );
		System.out.println( "YTD: " + jas.ytdSalary(mo) );
                
                // set and display salary with increase
		jas.setSalary( jas.getSalary() + jas.getSalary() * increase);
		System.out.println( "Monthly with 2.5 percent raise: " 
                        + jas.getSalary() );
                
                // employee cab
                System.out.println();
		System.out.println( cab.getFirstName() + "'s salary");
		System.out.println( "Monthly: " + cab.getSalary() );
		System.out.println( "YTD: " + cab.ytdSalary(mo) );
                
                // set and display salary with increase
		cab.setSalary( cab.getSalary() + cab.getSalary() * increase);
		System.out.println( "Monthly with 2.5 percent raise: " 
                        + cab.getSalary() );
				
	} // end method main
} // end class EmployeeTester