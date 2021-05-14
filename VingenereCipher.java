/* 
** IT6823
** Homework/Assignment 2
** Vingenere Cipher
** Kat Greer
** February 17, 2019
**
** Resources Used:
** The Java Progammer. (2017, June 22). Java vigenere cipher program 
** (encyption and decryption). Retrieved from 
** https://www.thejavaprogrammer.com/java-vigenere-cipher
**
*/
import java.util.Scanner;
import java.util.*;

public class VingenereCipher 
{
    public static void main( String[] args ){
        
        //create scanner object to obtain user input
        Scanner input = new Scanner( System.in );
        
        char[] key = {'T','R','S','B','T'};
        
        //ciphering mode
        System.out.println("CIPHERING MODE");
        System.out.print("Enter plain text to be encoded: ");
        char[] plainText = input.next().toCharArray();
        System.out.println("Pass phrase: " + String.valueOf(key));
        
        //encryption
        int textLen = plainText.length, i;
        char[] encryptedText = new char[textLen];
        for( i = 0; i < textLen; ++i )
            encryptedText[i] = (char)(((plainText[i] + key[i]) % 26) + 'A');
        
        System.out.print("Encoded text: " + String.valueOf(encryptedText));
        System.out.println();
                

        //deciphering mode
        System.out.println("DECIPHERING MODE");
        System.out.print("Enter encoded text to be decoded: ");
        char[] encodedText = input.next().toCharArray();
        System.out.println("Pass phrase: " + String.valueOf(key));
        
        //decryption
        int encodedTextLen = encodedText.length, j;
        char decodedText[] = new char[encodedTextLen];
        for( j = 0; j < encodedTextLen; ++j )
            decodedText[j] = (char)((((encodedText[j] - key[j]) + 26) % 26) + 'A');
 
        System.out.print("Decoded text: " + String.valueOf(decodedText));
        System.out.println();
    }
}