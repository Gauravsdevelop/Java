// // Reverse a 3 digit number
// Take in a three digit number as an integer input and reverse its digits. And then print the final reversed number as an integer output.

// Input Format

// The first line of input will contain an integer T — the number of test cases. The description of T test cases follows.

// For each test case,

// A three digit number will be given as an input.

// Constraints

// 100 <= 3 digit number <= 999
// Output Format

// Print the final reverse 3 digit number as an integer output.

// Sample Input 0

// 3
// 234
// 123
// 456
// Sample Output 0

// 432
// 321
// 654
// Sample Input 1

// 2
// 345
// 111
// Sample Output 1

// 543
// 111

import java.util.*;

public class Q3 {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

        // Reading the number of test cases
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after T

        // Iterating over each test case
        for (int i = 0; i < T; i++) {
            // Reading the three-digit number
            int number = scanner.nextInt();
            
            // Calculating the reversed number
            int reversedNumber = reverseNumber(number);
            
            // Printing the reversed number
            System.out.println(reversedNumber);
        }

        scanner.close();
    }

    // Function to reverse the digits of a three-digit number
    public static int reverseNumber(int number) {
        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        // Reversing the number
        int reversedNumber = ones * 100 + tens * 10 + hundreds;
        return reversedNumber;
    }
}