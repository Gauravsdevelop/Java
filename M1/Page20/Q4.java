// // hw_Print last index of x in array


// You have given an array of integers of length n and a key. you need to find the last index of the key in the given array . If not present, then return -1.

// Input Format

// First line consists of an integer n.

// Second line consists of an array of integers of size n.

// Third line consists an integer key.

// Constraints

// 1 < n <= 10^8
// Output Format

// Returns an integer as index.

// Sample Input 0

// 5
// 1 2 3 4 4
// 4
// Sample Output 0

// 4
// Explanation 0

//  the last index of the key is 4

import java.util.*;

public class Q4 {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Initialize array of size n
        int[] arr = new int[n];

        // Read elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Read the key to search for
        int key = scanner.nextInt();

        // Find the last index of the key in the array
        int index = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        // Output the result
        System.out.println(index);

        scanner.close();
    }
}