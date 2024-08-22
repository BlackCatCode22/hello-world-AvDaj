import java.util.Scanner;

public class newPayRoll {

    static void theHelloMethod(){
        System.out.println(" \n Hello from theHelloMethod() ! ");
    }

    // Create a method that gets input.
    // This is the method's definition.
    static void aPersonalGreeting(String someName){
        System.out.println(" \n Hello " + someName + "! How are you today?");
    }

    // Create a method that gets two integers and returns their sum
    // Create two int parameters
    static int sumTwoInts(int num1, int num2) {
        int mySum = 0;
        mySum = num1 + num2;

        // Because it is not "void" we will use "return" for int
        return mySum;
    }

    public static void main(String[] args) {
        System.out.println("\n>> Hello and Welcome to Methods! << \n");

        // Variables (members)
        String theUserName = "";

        // Create a Scanner object
        Scanner myScannerObject = new Scanner(System.in);

        // Get the user's name
        System.out.println("\n Please enter your name: ");
        theUserName = myScannerObject.nextLine();

        // Call (invoke) our greeting method.
        aPersonalGreeting(theUserName);

        theHelloMethod();

        // variable.
        int aSum = 0;

        // Call our new sum method.
        aSum = sumTwoInts(3, 4);

        System.out.println(" \n aSum is: " + aSum);

        System.out.println("\n This is the end of my program");


        /*
        String userName = "";
        int hoursWorked = 0;
        int overTimeWorked = 0;

        double hrlyPayRate = 0.0;
        double overTimePay = 0.0;
        double regularPaid = 0.0;

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

        //Calculating overtime worked/pay
        if (hoursWorked > 40) {
            overTimeWorked = hoursWorked - 40;
            overTimePay = overTimeWorked + 40 * hrlyPayRate * 1.5;
            System.out.println("\nWOW! You've worked " + overTimeWorked + " hours overtime this week!\n" +
                    "You will receive: $" + overTimePay + " on your next paycheck.");
        }
        //Calculating regular time worked/pay
        else {
            regularPaid = hoursWorked * hrlyPayRate;
            System.out.println("\nLooks like you didn't work any over time this week " + userName + ". \nYou will" +
                    " receive $" + regularPaid + " this week.");
        }

         */

    }
}