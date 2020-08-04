// Fig. 7.14 GradeBook.java
// GradeBook class using an array to store variables

public class GradeBook
{
    // declare instance variables
    private String courseName; // name of course this GradeBook represents
    private int[] grades; // array of student grades
    
    // two argument constructor initalizes courseName and grade array
    public GradeBook( String name, int[] gradesArray )
    {
        // assign argument name to instance string variable courseName
        courseName = name;
        // assign argument gradesArray to instance array variable grades
        grades = gradesArray;
    } // end GradeBook constructor
    
    // method to set the course name
    public void setCourseName ( String name )
    {
        // assign argument name to instance varibale courseName
        courseName = name;
    } // end method setCourseName
    
    // method to retrieve the course name
    public String getCourseName()
    {
        return courseName;
    } // end method getCourseName
    
    // display a welcome message to the GradeBook user
    public void displayMessage()
    {
        // getCourseName gets the name of the course
        System.out.printf( "Welcome to the gradebook for %s!\n\n", 
                getCourseName() );
    } // end method displayMessage
    
    // perform various operations on data
    public void processGrades()
    {
        // output grades array
        outputGrades();
        
        // call method getAverage to calculate the average grade
        System.out.printf( "\nClass average is %.2f\n", getAverage() );
        
        // call method getMinimum and get Maximum
        System.out.printf( "Lowest grade is %d\nHighest grade is %d\n\n",
                getMinimum(), getMaximum() );
        
        // call outputBarChart to print grade distribution chart
        outputBarChart();
    } // end method processGrades
    
    // method to find minimum grade
    public int getMinimum()
    {
        int lowGrade = grades[0]; // assume grades[0] is the smallest
        
        // loop through grades array
        for ( int grade : grades )
        {
            // if grade is lower than lowGrade, assign it to lowGrade
            if ( grade < lowGrade )
                lowGrade = grade; // new lowest grade
        } // end for
        
        return lowGrade; // return lowest grade
    } // end method getMiniumum
    
    // method to find maximum grade
    public int getMaximum()
    {
        // assign first element in grades array to variable highGrade
        // assume grades[0] is the highest to begin
        int highGrade = grades[0]; 
        
        // loop through the array
        for ( int grade : grades )
        {
            // if grade is higher than highGrade, assign it to highGrade
            if ( grade > highGrade )
                highGrade = grade; // new highest grade
        } // end for
        
        return highGrade; // return higest grade
    } // end method getMaximum
    
    // method to determine average grade
    public double getAverage()
    {
        int total = 0; // initalize total
        
        // sum grades for one student
        for ( int grade: grades )
            total+= grade;
        
        // return average of grades
        return (double) total / grades.length;
    } // end method getAverage
    
    // output bar chart displaying grade distribution
    public void outputBarChart()
    {
        System.out.println( "Grade distribution: ");
        
        // array stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];
        
        // for each grade, increment the appropriate frequency
        for ( int grade : grades )
            ++frequency[ grade / 10 ];
        
        // for each grade frequency, print bar in chart
        for ( int count = 0; count < frequency.length; count++ )
        {
            // outpur bar label
            if ( count == 10 )
                System.out.printf( "%5d: ", 100 );
            else
                System.out.printf( "%02d-%02d: ", 
                        count * 10, count* 10 + 9 );
            
            // print bar of asterisks
            for ( int stars = 0; stars < frequency[ count ]; stars++ )
            {
                System.out.print( "*" );
            }
                
            System.out.println(); // startt a new line of output
        } // end outer for
    } // end method outputBarChart
    
    // output the contents of the grades array
    public void outputGrades()
    {
        System.out.println( "The grades are:\n" );
        
        // output each student's grade
        for ( int student = 0; student < grades.length; student++ )
        {
            System.out.printf( "Student %2d: %3d\n", 
                    student + 1, grades[ student ] );
        } // end for
    } // end method outputGrades
} // end class Gradebook