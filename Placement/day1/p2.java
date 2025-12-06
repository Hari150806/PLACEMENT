package Placement.Day1;
import java.util.*; 

public class p2 {
    
    public static void main(String[] args) {
        int originalNumber = 12345;
        int newFirstDigit = 7;

        
        int tempNum = originalNumber;
        int numDigits = 0;
        if (tempNum == 0) {
            numDigits = 1;
        } else {
            while (tempNum > 0) {
                tempNum /= 10;
                numDigits++;
            }
        }

      
        int firstDigitPlaceValue = (int) Math.pow(10, numDigits - 1);

        int numberWithoutFirstDigit = originalNumber % firstDigitPlaceValue;

       
        int newNumber = (newFirstDigit * firstDigitPlaceValue) + numberWithoutFirstDigit;

        System.out.println("Original Number: " + originalNumber);
        System.out.println("New Number with first digit changed to " + newFirstDigit + ": " + newNumber);
    }
}
