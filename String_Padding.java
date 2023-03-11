/*
 This Program concatenates 0s infront of a value that has not yet reached the maximum value legnth.
 for example if the value is 1 and the maximum value length is 4  then the system will output 0001
 */
package string_padding;

/**
 *
 * @author STEPHEN
 */
import java.util.Scanner;
public class String_Padding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating an object for the scanner class.
        Scanner input = new Scanner(System.in);
        //Prompts the user to enter a number.
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        //initialize the maximum legnth.
        int maximum_legnth = 4;
        //Converts the Entered number to a string.
        String converted_number = Integer.toString(number);
        
        //while the length of the converted number is less than the maximum Legnth add 0s before the number.
        while(converted_number.length()<maximum_legnth){
            // Concatenete 
            converted_number = "0" + converted_number;
        }
        System.out.println(converted_number);
    }
    
}
