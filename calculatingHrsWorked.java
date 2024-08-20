// This is a comment
/*
 * Adam Vang
 * 8/20/24
 *
 * PayrollProgram.java
 *
 * Input: User's name, weekly hours worked (no hour fraction), user's hourly payrate
 *
 * Processing: total weekly pay including overtime if more than 40
 * hours were worked that week
 *
 * Output: Polite greeting yo the user and regular pay and overtime pay
 *
 *
 *
*/

import java.util.Scanner;  // Import the Scanner class


public class calculatingHrsWorked {
    public static void main(String[] args) {
        System.out.println("\n>> Hello and Welcome to the Payroll Program << \n");

        String userName = "";
        int hoursWorked = 0;
        int payRate = 0;
        double hrlyPayRate = 0.0;
        double overTimePay = 0.0;
        double amountPaid = 0.0;

        // Create a Scanner object
        Scanner myScannerObject = new Scanner(System.in);

        //Asking for the user's name
        System.out.println("\nPlease enter your name: ");
        userName = myScannerObject.nextLine();

        //Asking for the user's hours worked
        System.out.println("\nGood Morning " + userName + "! Please enter the amount of hours you've worked (only whole numbers): \n");
        hoursWorked = myScannerObject.nextInt();

        //Asking for the user's hourly pay rate
        System.out.println("\nThank you. Please enter your hourly pay rate: \n");
        hrlyPayRate = myScannerObject.nextDouble();

        //Calculating overtime pay
        if (hoursWorked > 40) {
            overTimePay = hoursWorked - 40 * 1.5;
            amountPaid = overTimePay + hoursWorked * hrlyPayRate;
        }
        else {
            amountPaid = hoursWorked * hrlyPayRate;
        }

        //Calculate weekly regular pay


        System.out.println("\nOn your next paycheck you will receive: $" + amountPaid);
    }
}