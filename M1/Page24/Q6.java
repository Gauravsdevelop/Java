// // HW_Find Me 6

import java.util.*;

public class Q6 {

    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt(); //5
        int A[]=new int[n];
        for(int i =0; i<n; i++){  
            A[i]= scn.nextInt();  // 1 2 -2 4 -1
        }
        int m = scn.nextInt();   //5
        int B[]= new int[m];
        for(int i =0; i<m; i++){
            B[i]= scn.nextInt();   // 1 2 3 -2 5
        }
        for(int idx=0;idx<n;idx++){   // 1 2 -2 4 -1
            for(int i=0; i<m; i++){   // 1 2 3 -2 5
                if(Math.abs(A[idx])==B[i]) {
                    System.out.print(A[idx]+" ");  //1, 2, -2 ,-1
                break;
                }
            }
        }
    }
}

// Time Complexity: O(n * m): The code uses a nested loop where the outer loop runs n times (length of A) and the inner loop runs m times (length of B). Thus, the time complexity is O(n * m).

// Space Complexity: O(1): The space complexity is constant beyond the input arrays since it does not use any additional data structures that grow with the input size.


//question
// Given an array of size n with unique integer elements. And then take m as an integer input. Declare the second array of size m that stores values of int data-type. Then take m integer inputs and store them in the array one by one.

// Then print all the elements of the first array whose absolute values are present in the second array. You shouldn’t use any extra space.

// Input Format

// First line contains integer number n representing size of first array.
// Second line contains n integer inputs representing elements of first array.
// Third line contains integer number m representing size of second array.
// Fourth line contains m integer inputs representing elements of second array.

// Constraints

// 1 <= n,m <= 100000

// 0 <= arr1[i],arr2[i] <= 100000
// Output Format

// An series on integer element in single line.

// Sample Input 0

// 5
// 1 2 -2 4 -1
// 5
// 1 2 3 -2 5
// Sample Output 0

// 1 2 -2 -1 
// Explanation 0

// Second array contains only absolute value of 1 , 2 ,-2 and -1.


// import java.util.*;

// public class Q6 {
//    public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input size of first array
//         int n = scanner.nextInt();
//         int[] arr1 = new int[n];

//         // Input elements of first array
//         for (int i = 0; i < n; i++) {
//             arr1[i] = scanner.nextInt();
//         }

//         // Input size of second array
//         int m = scanner.nextInt();
//         int[] arr2 = new int[m];

//         // Input elements of second array
//         for (int i = 0; i < m; i++) {
//             arr2[i] = scanner.nextInt();
//         }

//         // Iterate through arr1 and check if absolute value exists in arr2
//         for (int i = 0; i < n; i++) {
//             int absValue = Math.abs(arr1[i]);
//             for (int j = 0; j < m; j++) {
//                 if (absValue == arr2[j]) {
//                     System.out.print(arr1[i] + " ");
//                     break;
//                 }
//             }
//         }
//     }
// }