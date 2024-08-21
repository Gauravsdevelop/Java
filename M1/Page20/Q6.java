// // HW_Print First Vowel occurrence

// Take n as an integer input. Declare the first array of size n that stores values of char data-type. Then take n character inputs and store them in the array one by one. Print the index at which the vowel occurs for the first time.

// Input Format

// First line consists of an integer value N.

// Second line consits of an array with N characters.

// Constraints

// NA

// Output Format

// Returns index of first vowel in array

// Sample Input 0

// 5
// b
// c
// d
// e
// p
// Sample Output 0

// 3
// Explanation 0

// First Vowel in the Array is 'e' The Idx of e is 3


import java.util.*;

public class Q6 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int n = scanner.nextInt();

        
        char[] arr = new char[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.next().charAt(0);
        }

      
        String vowels = "aeiouAEIOU";

       
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (vowels.indexOf(arr[i]) != -1) {
                index = i;
                break;
            }
        }

        System.out.println(index);

        scanner.close();
    }
}