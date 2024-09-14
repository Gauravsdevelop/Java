// // HW_Find The Pair 4

import java.util.*;

public class Q5 {
    
    static void findPermutation(int n, int [] arr, int k) {  // (5,(// 1 2 3 4 5),8)
        for (int i = 0; i < n; i++) {           // 1 2 3 4 5
            for (int j = 0; j < n; j++) {       // 1 2 3 4 5
                if ((arr[i] + arr[j]) == k) {
                    System.out.println(arr[i] + " " + arr[j]); //3 5    4 4    5 3
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();                  //5
        int [] arr = new int [n];
        for (int i = 0; i < n; i++) {     
            arr [i] = scn.nextInt();           //// 1 2 3 4 5
        }
        int k = scn.nextInt();               //8
        scn.close();
        findPermutation(n, arr, k);        // (5,(// 1 2 3 4 5),8)
    }
}


// Time Compl/exity: O(N^2) due to the nested loops iterating over each pair of elements in the array.
// Space Complexity: O(1) as only a constant amount of extra space is used beyond the input arrays.



//Question
// Given condition is that the array contains all the unique elements. Then take the sum as an integer input and print all the permutations of the pairs that add up to the given sum k.

// Input Format
// First line contains an integer number n representing size of array.
// Second line contains n integer numbers representing elements of the array.
// Third line contains an integer number k

// Constraints
// 1 <= n <= 100000
// 0 <= array[index] <= 100000
// 0 <= k <= 1000000

// Output Format
// Print all pair that gives the sum equals to the given number k.

// Sample Input 0
// 5
// 1 2 3 4 5
// 8

// Sample Output 0
// 3 5
// 4 4
// 5 3

// Explanation 0
// Since arr[2]+arr[4] = 8
// arr[3]+arr[3] = 8
// arr[4]+arr[2] = 8

