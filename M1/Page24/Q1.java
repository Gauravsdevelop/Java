// // Max Count 3
//two pointer apporch

import java.util.*;
public class Q1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        int n = scanner.nextInt();    //8
        int[] arr = new int[n];                //

        // Input elements of the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();   //  1,1,2,2,2,3,3,2
        }
        // Step 1: Sort the array
        Arrays.sort(arr);     // 1/1/2/2/2/2,3,3

        // Initialize variables to track the element with the maximum occurrences
        int maxCount = 1;  //4
        int maxElement = arr[0]; //6
        int currentCount = 1;

        // Step 2: Use two pointers to find the most frequent element
        for (int i = 1; i < n; i++) {       // 1,1,2,2,2,2,3,3
            if (arr[i] == arr[i - 1]) {      
                currentCount++;                //2   // 4  //2
            } else {
                if (currentCount > maxCount) { //2>1  //4>2   //2>4
                    maxCount = currentCount;    //2 //4 
                    maxElement = arr[i - 1];  // 2-1 // 1 //7-1 = 6
                }
                currentCount = 1; // Reset count for new element
            }
        }
        // Final check for the last element in the array
        if (currentCount > maxCount) {    //1>4
            maxCount = currentCount;  
            maxElement = arr[n - 1];  
        }

        // Step 3: Print the element with the maximum occurrences
        System.out.println(maxElement);

        scanner.close();
    }
}


// Time complexity: O(N log N) due to sorting the array. Traversing the array with two pointers is O(N), but sorting dominates, so overall it's O(N log N).
// Space complexity: O(1) since we only use a few extra variables (not counting the input array).








//question

// Take an array of size n with integer elements. And Print an element in the array which occurs for the maximum number of times.

// Input Format
// First line contains an Integer number n representing size of array.
// Second line contains n integer inputs representing elements of array.

// Constraints
// 1 <= n <= 10000
// -100000 <= arr[i] <= 100000

// Output Format
// Returns an Integer number

// Sample Input 0
// 7
// 1 1 1 2 2 3 3
// Sample Output 0
// 1
// Explanation 0
// 1 has occured maximum times i.e 3.


// using hashmap

// import java.util.*;

// public class Q1 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input size of the array
//         int n = scanner.nextInt();
//         int[] arr = new int[n];

//         // Input elements of the array
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         // Use a HashMap to count occurrences of each element
//         Map<Integer, Integer> countMap = new HashMap<>();
//         for (int value : arr) {
//             countMap.put(value, countMap.getOrDefault(value, 0) + 1);
//         }

//         // Find the element with the maximum occurrences
//         int maxCount = 0;
//         int maxElement = arr[0];
//         for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//             if (entry.getValue() > maxCount) {
//                 maxCount = entry.getValue();
//                 maxElement = entry.getKey();
//             }
//         }

//         // Print the element with the maximum occurrences
//         System.out.println(maxElement);
//     }
// }

