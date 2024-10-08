// // Greater At Right
import java.util.*;
public class Q3 {
    
    static int [] checkGreater (int n, int [] arr) {   //  (5,(//1 2 3 4 5))
        int [] result = new int [n];      
        for (int i = 0; i < n; i++) {          //5   // 1 2 3 4 5    i
            int count = 0;
            for (int j = i + 1; j < n; j++) {        // 1 2 3 4 5    J
                if (arr[j] > arr[i]) {
                    count++;    //4 3 2 1 0
                }
            }
            result [i] = count;   // 4 3 2 1 0
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  //5
        int [] arr = new int [n];  
        for (int i = 0; i < n; i++) {  
            arr [i] = scn.nextInt();   //1 2 3 4 5
        }
        int [] result = checkGreater (n, arr);       //  (5,(//1 2 3 4 5))
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
// Time Complexity: O(n^2) because there are two nested loops, each running up to n, leading to quadratic time complexity.

// Space Complexity: O(n) due to the additional result array of size n.






//Question
// Given an array, for each index, replace the element with the count of greater elements present to the right of that element.

// Input Format
// First line contains an integer number n representing size of array
// Second line contains n integer number representing elements of the array

// Constraints
// 1 <= n <= 100000
// 0 <= array[index] <= 100000

// Output Format
// print the required count for every index in single line
// Sample Input 0
// 5
// 1 2 3 4 5

// Sample Output 0
// 4 3 2 1 0 
// Explanation 0
// for index 0,values at indexes 1,2,3,4 are greater than it.Therefore count is 4.
// for index 1,values at indexes 2,3,4 are greater than it.Therefore count is 3.
// for index 2,values at indexes 3,4 are greater than it.Therefore count is 2, and so on.

