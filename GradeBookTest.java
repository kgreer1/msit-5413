// Fig 7.15: GradeBookTest.java
// Creates a GradeBook object using an array of grades,
// then invokes method processGrades to analyze them.

public class GradeBookTest
{
    // main method
    public static void main( String[] args )
    {
        // array of student grades
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        
       // create object
       GradeBook myGradeBook = new GradeBook( "CS101", gradesArray );
       
       // call public methods from class GradeBook
       myGradeBook.displayMessage();
       myGradeBook.processGrades();
    } // end main
} // end class GradeBookTest