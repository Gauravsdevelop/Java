// // Find all Combination

    import java.util.*;
    public class Q1 {   
        static void Combination(int [] arr, int n, int k) { //(1 2 3 4 5 , 5 ,8)
            for (int i = 0; i < n; i++) {        //1 2 3 4 5
                for (int j = i; j < n; j++) {    //1 2 3 4 5
                    if ((arr[i] + arr[j]) == k) {
                        System.out.println(arr[i] + " " + arr[j]);   //3,5 //4,4 //5,3
                        break;
                    }
                }
            }
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int [] arr = new int [n];   //5
            for (int i = 0; i < n; i++) {
                arr [i] = scn.nextInt();   //1 2 3 4 5
            }
            int k = scn.nextInt();   //8
            scn.close();
            Combination(arr, n, k);   //(//1 2 3 4 5 , 5 ,8)
        }
    }
    // Time Complexity :- time complexity of O(n^2) because in the worst case, you check each possible pair of elements.
    //Space Complexity :- The space complexity is O(1) since the algorithm uses only a constant amount of additional space beyond the input array. The space used for storing the array is not considered in the complexity analysis.




// Given condition is that the array contains all the unique elements. Then take the sum as an integer input and print all the combinations of the pairs that add up to the given sum.

// Input Format
// An integer number n representing size of array
// N numbers representing elements of array
// An integer number k.

// Constraints
// 1<=n<=100000
// 0<=array[index]<=100000
// 0<=k<=1000000

// Output Format
// Print all Combination of pairs that gives the sum equals to the given number k.

// Sample Input 0
// 5
// 1 2 3 4 5
// 8

// Sample Output 0
// 3 5
// 4 4
// Explanation 0

// arr[2]+arr[4] = 8, also arr[4] +arr[2] = 8 but we need to print only combination. therefore we are not printing 5 3 as answer. arr[3]+arr[3] = 4.
