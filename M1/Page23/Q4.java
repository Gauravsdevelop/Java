// // maximum difference between the two elements

import java.util.*;

public class Q4 {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();     //7
        int a[]=new int [n];      //7
        
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();         // 2 3 10 6 4 8 1
        }
        int d=Integer.MIN_VALUE;
        //logic
        for(int i=0;i<n;i++){            // 2 3 10 6 4 8 1
            for(int j=i+1;j<n;j++){      // 2 3 10 6 4 8 1

                d=Math.max(d,a[j]-a[i]);

            }
            
        } System.out.print(d);    //8
        
    }
}


// Time complexity: O(n^2), because the two nested loops iterate over the array, resulting in n * (n - 1) comparisons.

// Space complexity: O(n), due to the space used to store the array of size n.




//QUESTIONS
// Given an array arr[] of integers, find out the maximum difference between any two elements such that larger element appears after the smaller number.

// Input Format
// First line contains an integer N represent the size of array.
// Second line contains N number of integers represent the elements of array.

// Constraints
// 0 <= N <= 10000
// 0 <= arr[i] <= 10000

// Output Format
// print the required output.

// Sample Input 0
// 7
// 2 3 10 6 4 8 1

// Sample Output 0
// 8










// import java.util.*;

// public class Q4 {

//    public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         // Read the size of the array
//         int N = sc.nextInt();         // 7
        
//         if (N == 0) {
//             // If there are no elements, the maximum difference is 0
//             System.out.println(0);
//             return;
//         }
        
//         // Read the array elements
//         int[] arr = new int[N];             
//         for (int i = 0; i < N; i++) { 
//             arr[i] = sc.nextInt();         //2 3 10 6 4 8 1
//         }
        
//         // Initialize variables
//         int minElement = arr[0];
//         int maxDifference = 0;
        
//         // Traverse the array to find the maximum difference
//         for (int i = 1; i < N; i++) {          //2 3 10 6 4 8 1
//             if (arr[i] < minElement) {
//                 minElement = arr[i];          // 1
//             }
//             int difference = arr[i] - minElement;
//             if (difference > maxDifference) {
//                 maxDifference = difference;
//             }
//         }
        
//         // Output the result
//         System.out.println(maxDifference);
//     }
// }

// // Time Complexity: O(N) because the array is traversed once to find the maximum difference.

// // Space Complexity: O(1) due to a constant amount of extra space used for variables, regardless of the input size.

