// // Solve Array

import java.util.*;

public class Q2 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read size of array
        int n = scanner.nextInt();  //5
        // Initialize arrays
        int[] numbers = new int[n];  // 12 13 14 15 16
        int[] indexes = new int[n];  // 0  1  2  3  4
        // Read numbers array
        for (int i = 0; i < n; i++) {          
            numbers[i] = scanner.nextInt();       // 12 13 14 15 16 
        }
        // Read indexes array
        for (int i = 0; i < n; i++) {
            indexes[i] = scanner.nextInt();       // 0  1  2  3  4
        }
        // Create target array
        int[] target = new int[n];       //5
        
        // Populate target array based on numbers and indexes
        for (int i = 0; i < n; i++) {       // 0  1  2  3  4  ==>   // 12 13 14 15 16 
            target[indexes[i]] = numbers[i];    
        }
        
        // Print target array
        for (int i = 0; i < n; i++) {
            System.out.print(target[i] + " ");     // 12 13 14 15 16 
        }
        
        // Close scanner
        scanner.close();
    }
}

// Time Complexity: O(n) because each of the n elements is processed once for reading, populating, and printing the arrays.

// Space Complexity: O(n) due to the storage of the numbers, indexes, and target arrays.



//QUESTION
// Take n as an integer input representing size of both array.
// Take n integer inputs for numbers array and Then take n integer inputs for array indexes where each integer input can be from 0 till numbers.length.
// Then create an array of size n and name it target array. From left to right read numbers[i] and index[i], and in the target array at the index index[i], insert the value numbers[i].

// Input Format
// First line contains a number n representing size of array numbers and indexes
// Second line contains n number representing element of numbers.
// Third line contains a number representing element of indexes.

// Constraints
// 1 <= n <= 100000
//  0 <= numbers[index] <= 100000
//  0 <= indexes[index] < n

// Output Format
// Print n numbers representing element of target array.
// Sample Input 0
// 5
// 12 13 14 15 16
// 0 1 2 3 4
// Sample Output 0
// 12 13 14 15 16

// Explanation 0

// for target array we are storing numbers[index] at every target[indexes[i]].
// therfore target[index[0]] = numbers[0], i.e target[0]= 12.
