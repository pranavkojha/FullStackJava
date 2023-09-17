/**
 * Author: pranavkojha@gmail.com
 */
package prework;
import java.util.Scanner;

public class Assignment1 {
    static Scanner sc = new Scanner(System.in);
    public void checkPalindrome()  {
        /** This method accepts a number and prints if it is a palindrome or not.
         *
         */
        //Accept User input
        System.out.print("Enter number to check for palindrome:");
        int num = sc.nextInt();

        //Let's convert all negative numbers to positive.
        if(num<0) {
            num *= -1;
        }

        // All 1-digit numbers are palindrome.
        if(num<10) {
            System.out.println("Number " + num + " is a palindrome.");
            return;
        }

        // Core logic to reverse the number.
        byte count = 0;
        int rev_num=0, tmp = num;
        while(tmp > 0) {
            int reminder = tmp % 10;
            rev_num = rev_num * 10 + reminder;
            tmp /= 10; count++;
        }

        // If reversed number is same as actual number, it was a palindrome.
        if (rev_num == num)
            System.out.println("Number " + num + " is a palindrome.");
        else
            System.out.println("Number " + num + " is NOT a palindrome.");
    }

    public void printPattern() {
        /**
         * This method print "*" starting with the number entered by user and then prints this
         * recursively starting with the largest number, reducing the print by 1 char each time
         * something like this:
         * *****
         * ****
         * ***
         * **
         * *
         */
        // Accept user input.
        System.out.print("Enter number to print the pattern:");
        int num = sc.nextInt();

        // Start printing * starting with largest number and reducing one count every new line.
        for (int i=num; i>0; i--) {
            for (int j=0; j < i; j++)
                System.out.print("*");
            System.out.println(" ");
        }
    }

    public void checkPrimeNumber() {
        /**
         * This method checks if a given number is prime or not.
         */

        // Accept user input.
        System.out.print("Enter number to check if it is Prime number or not:");
        int num = sc.nextInt();

        // Handle the numbers 1-3.
        if(num == 1) {
            System.out.println("1 is NOT a Prime number");
            return;
        }
        if (num % 2 == 0) {
            System.out.println(num + " is NOT a prime number");
            return;
        }
        if(num == 3) {
            System.out.println(num + " is a prime number");
            return;
        }

        // If a number N is divisble by N/2 numbers, it is NOT a prime number.
        for(int i=3; i<num/2; i+=2)
        {
            if(num%i == 0) {
                System.out.println(num + " is NOT a prime number");
                return;
            }
        }

        // If a number N is not divisble by N/2 numbers, it IS a prime number.
        System.out.println(num + " is a prime number");
    }

    public void printFibonacciSeries() {
        /**
         * This method prints the first N fibonacci numbers.
         */
        int num = -1;
        // Accept user input.
        System.out.print("Enter number to check if it is Prime number or not:");

        // Btw, the first 2 number in a fibonacci series are fixed. Let us ask for a number >=2.
        while(num < 2) {
            num = sc.nextInt();
            if(num < 2)
                System.out.println("Enter a number >= 2");
        }

        int first = 0, second = 1;
        // Start printing the fibonacci series
        System.out.print(first + ", " + second + ", ");
        for(int i=2; i<num; i++) {
            int tmp = first;
            first = second;
            second += tmp;
            System.out.print(second + ", ");
        }
    }
    public static void main(String[] args) {
        /**
         * This is the main method that runs an infinite do-while loop till the user choses to
         * exit.
         */
        Assignment1 obj = new Assignment1();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            // Accept user input.
            System.out.println("\n================\nChose from below list:\n" +
                    "1. Find palindrome of number.\n" +
                    "2. Print Pattern for a given no.\n" +
                    "3. Check whether the no is a  prime number.\n" +
                    "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
            System.out.print("Enter your choice: ");
            choice = Assignment1.sc.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Thank you!");
                    break;
                case 1: obj.checkPalindrome();
                break;
                case 2: obj.printPattern();
                break;
                case 3: obj.checkPrimeNumber();
                break;
                case 4: obj.printFibonacciSeries();
                break;
                default: System.out.println("Invalid choice. Enter a valid no.\n");
                break;
            }
        } while (choice != 0);
        System.out.println("Exited Successfully!!!");
        sc.close();
    }
}
