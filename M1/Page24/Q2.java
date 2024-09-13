// // Find Duplicate 3

import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int n = scanner.nextInt();        //5
        int[] arr = new int[n];             

        // Input elements of the array
        for (int i = 0; i < n; i++) {      
            arr[i] = scanner.nextInt();     //2,7,4,3,4
        }

        // Sort the array
        Arrays.sort(arr);    //2,3,4,4,7
        // Use two pointers to check for duplicates
        boolean hasDuplicate = false;
        
        for (int i = 0; i < n - 1; i++) {   //2,3,4,4,7
            if (arr[i] == arr[i + 1]) {
                hasDuplicate = true;
                break;
            }
        }

        // Print the result
        System.out.println(hasDuplicate);
    }
}

// Time complexity: O(N log N) because sorting the array takes O(N log N) time, where N is the size of the array.

// Space complexity: O(1) for the in-place two-pointer check. If the sorting algorithm requires additional space (like Merge Sort), the space complexity would be O(N). However, if an in-place sort like QuickSort is used, the space complexity remains O(1) for the comparison portion.







//Question
// Take an array of size n with integer input. And Print “true” if the array contains a duplicate element and print “false”. if the array doesn’t contain a duplicate element.

// Input Format
// First line contains an integer number n representing size of array.
// Second line contains n integer inputs representing elements of array.

// Constraints
// 1 <= n <= 10000
// -100000 <= arr[i] <= 100000

// Output Format
// Returns a boolean value.

// Sample Input 0

// 5
// 1
// 2
// 3
// 4
// 1
// Sample Output 0
// true

// Explanation 0
// since 1 has occured more than one time therefore 1 is duplicate.


// import java.io.*;
// import java.util.*;

// public class Q2 {

//    public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input size of the array
//         int n = scanner.nextInt();
//         int[] arr = new int[n];

//         // Input elements of the array
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Use a HashSet to check for duplicates
//         Set<Integer> set = new HashSet<>();
//         boolean hasDuplicate = false;

//         for (int value : arr) {
//             if (set.contains(value)) {
//                 hasDuplicate = true;
//                 break;
//             }
//             set.add(value);
//         }

//         // Print the result
//         System.out.println(hasDuplicate);
//     }
// }
// // Time complexity: O(N), where N is the number of elements in the array. We are iterating through the array once to check for duplicates.
// // Space complexity: O(N), because we are using a HashSet to store elements from the array, which can grow up to the size of the input array.