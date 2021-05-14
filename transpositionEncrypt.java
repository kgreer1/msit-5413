/*
** IT6823
** Homework/Assignment 2
** Transposition Cipher: Encryption
** Kat Greer
** February 17, 2019
** 
** Resources Used:
** TechnicalWorldOfMe. (2014, June 28). Double transposition in Java.
** Retrieved from http://technicalworldofme.blogspot.com/2014/06/double-transposition-in-java.html
**
*/
import java.io.*;
import java.util.*;

public class transpositionEncrypt
{
    public static void main( String args[] )
    {
        
       System.out.println("TRANSPOSITION ENCRYPTION PROGRAM");
               
        //plain text
        char[] plainText = {'T','E','S','T','M','E','S','S','A','G','E',' '};
        int textLen = plainText.length, i, j;
        System.out.println("Plain text: " + String.valueOf(plainText));
        
        //build plain text matrix
        int r = 4;
        int c = 3;
        char[][] matrix1 = new char[r][c];
        System.out.println("Matrix row size: " + r);
        System.out.println("Matrix column size: " + c);
        
        int k = 0;
        for ( i = 0 ; i < r ; i++ )
        {
            for( j = 0 ; j < c ; j++ )
            {
                matrix1[i][j] = plainText[k];
                k++;     
            }
        }
        
        //permutation order
        int[] row = {3, 2, 1, 4};
        int[] col = {2, 3, 1};
        System.out.println("Row permutation order: " + Arrays.toString(row));
        System.out.println("Column permutation order: " + Arrays.toString(col));

        //build encrypted matrix
        int m, n;
        char[][] matrix2 = new char[r][c];
        
        System.out.print("Encrypted text: ");
        for( i = 0 ; i < r ; i++ )
        {
            m = row[i] - 1;
            for( j = 0 ; j < c ; j++ )
            {
                n = col[j] - 1;
                matrix2[i][j] = matrix1[m][n];
                System.out.print(Character.toUpperCase(matrix2[i][j]));
            }
        }
        System.out.println();
    }  
}