// This is a comment
/*
 * Adam Vang
 * 8/15/24
 */

import java.util.Scanner;  // Import the Scanner class


public class LargestOfThree {
    public static void main(String[] args) {
        System.out.println("\n\n Welcome to the Largest of Three Program!\n\n");

        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int largestOfThree = 0;

        System.out.println("\n The value of largestOfThree is " + largestOfThree);

        // Create a Scanner object
        Scanner myScannerObject = new Scanner(System.in);

        // Ask user for the first int
        System.out.println("\n Please enter a whole number: ");
        firstNum = myScannerObject.nextInt();

        // Unit test for out first user input
        System.out.println("\n The value of firstNum is: " + firstNum);

        // Ask user for the second int
        System.out.println("\n Please enter a second whole number: ");
        secondNum = myScannerObject.nextInt();

        // Unit test for out second user input
        System.out.println("\n The value of secondNum is: " + secondNum);

        // Ask user for the third int
        System.out.println("\n Please enter a third whole number: ");
        thirdNum = myScannerObject.nextInt();

        // Unit test for out third user input
        System.out.println("\n The value of thirdNum is: " + thirdNum);

        // Processing
        // Compare the inputs with nested if statement

        if (firstNum > secondNum) {
            if (firstNum > thirdNum) {
                largestOfThree = firstNum;
            }
            else {
                largestOfThree = thirdNum;
            }
        }
        else {
            if (secondNum > thirdNum) {
                largestOfThree = secondNum;
            }
            else {
                largestOfThree = thirdNum;
            }
        }

        // Output largest of three
        System.out.println("\n The largest of three is: " + largestOfThree);

    }
}