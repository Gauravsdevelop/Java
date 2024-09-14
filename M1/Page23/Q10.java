// HW_Counting Smaller Numbers in an Array

import java.util.*;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];     //5
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();  // 8 1 2 2 3
        }
        
        for(int i=0;i<n;i++){        // 8 1 2 2 3
            int count=0;
            for(int j=n-1;j>=0;j--){ // 8 1 2 2 3
                if(a[i]>a[j] && j!=i){
                    count++;          
                }
            }  System.out.print(count+" ");       // 4 0 1 1 3
        }
      
    }
}

// Time Complexity: O(N^2) due to the two nested loops. The outer loop runs N times, and for each iteration, the inner loop runs N times.
// Space Complexity: O(1) as no additional space is used other than the input array.




//Question

// Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i]

// NOTE :-

// After answering the question, attempt the related question in the linked resource to improve your understanding of the question . Click here

// Input Format

// First line contains an integer N representing the size of array.
// Second line contains N number of integers representing the elements of array.

// Constraints
// 0 <= N <= 10000
// 0 <= arr[i] <= 10000

// Output Format
// Print the required answer.

// Sample Input 0
// 5
// 8 1 2 2 3
// Sample Output 0
// 4 0 1 1 3

// import java.util.*;

// public class Q10 {

//       public static int[] smallerNumbersThanCurrent(int[] nums) {
//         int n = nums.length;
//         int[] sorted = nums.clone();
//         Arrays.sort(sorted);

//         Map<Integer, Integer> rank = new HashMap<>();
//         for (int i = 0; i < n; i++) {
//             rank.putIfAbsent(sorted[i], i);
//         }

//         int[] result = new int[n];
//         for (int i = 0; i < n; i++) {
//             result[i] = rank.get(nums[i]);
//         }

//         return result;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int n = scanner.nextInt(); // Read the number of elements
//         int[] nums = new int[n];
        
//         for (int i = 0; i < n; i++) {
//             nums[i] = scanner.nextInt(); // Read each element
//         }
        
//         int[] result = smallerNumbersThanCurrent(nums);
        
//         // Print the result in the required format
//         for (int i = 0; i < result.length; i++) {
//             if (i > 0) System.out.print(" ");
//             System.out.print(result[i]);
//         }
//         System.out.println();
        
//         scanner.close();
//     }
// }
