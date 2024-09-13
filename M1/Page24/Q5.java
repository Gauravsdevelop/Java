  // // // HW_Repeating and Missing element

import java.util.*;

public class Q5 {

     public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();           //4
         int A[]= new int[n];       
         for(int i =0; i<n; i++){          // 1/2/4/4
             A[i]= scn.nextInt(); 
         }
         
         int freq[] = new int[n+1];   //5    [0,1,1,0,2]

         for(int i=0; i<n; i++){     
             freq[A[i]]++ ;      //   [0,1,1,0,2]
         }
         int missing = 0;

         int repeating = 0;

         for(int i=1; i<=n; i++){     

             if(freq[i] > 1 ){        
                repeating = i;   //4
            } 
            
             if(freq[i] == 0){  
                missing = i;        //3
             }
            
         }
         System.out.println(repeating);
         System.out.print(missing);
     }
     }
     

    //  Time Complexity: O(n), where n is the size of the array. This is because you are iterating through the array twice: once to populate the frequency array and once to find the missing and repeating numbers.

     // Space Complexity: O(n), for the freq array which is of size n + 1.



//Question
// Given an array arr[] of size N of positive integers(1 - N). One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Write a program to print the repeating element and the missing element in array.

// Input Format

// First line contains integer input N (size of array).
// Second line contains n integers of arr[] elements.

// Constraints
// 1 ≤ N ≤ 10^4
// 1 ≤ arr[i] ≤ N

// Output Format
// In the first line print repeating element.
// In the second line contains print missing element.

// Sample Input 0
// 4
// 1 2 4 4

// Sample Output 0
// 4
// 3

// Explanation 0
// Repeating number is 4 and smallest positive missing number is 3 in given array.

// Sample Input 1
// 5
// 1 1 2 3 4

// Sample Output 1
// 1
// 5

// Explanation 1
// Repeating number is 1 and positive missing number is 5 in given array.
// import java.util.*;

// public class Q5 {
    
//       public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);    

//         // Input size of array
//         int N = scanner.nextInt();
//         int[] arr = new int[N];

//         // Input elements of array
//         for (int i = 0; i < N; i++) {
    //             arr[i] = scanner.nextInt();    
    //         }
    
    //         // Calculate expected sum and sum of squares for numbers 1 to N
    //         int expectedSum = N * (N + 1) / 2;
    //         int expectedSumSquares = N * (N + 1) * (2 * N + 1) / 6;
    
    //         // Calculate actual sum and sum of squares from the given array
    //         int actualSum = 0;
    //         int actualSumSquares = 0;
    
    //         for (int i = 0; i < N; i++) {
        //             actualSum += arr[i];    
        //             actualSumSquares += arr[i] * arr[i];
        //         }
        
        //         // Calculate differences
        //         int sumDiff = actualSum - expectedSum; // B - A
        //         int sumSquaresDiff = actualSumSquares - expectedSumSquares; // B^2 - A^2
        
        //         // B^2 - A^2 = (B + A) * (B - A)
        //         // sumSquaresDiff = (B + A) * sumDiff
        //         int sumPlus = sumSquaresDiff / sumDiff; // B + A
        
        //         // Solving equations to find A and B
        //         int B = (sumPlus + sumDiff) / 2;
        //         int A = sumPlus - B;
        
        //         // Print the repeating and missing numbers
        //         System.out.println(B);
        //         System.out.println(A);
        //     }
        // }
        
        
        //priya code
        // import java.io.*;
        // import java.util.*;
        
        // public class Q5 {
            
        //     public static void main(String[] args) {
//     Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();
//         int A[]= new int[n];
//         for(int i =0; i<n; i++){
    //             A[i]= scn.nextInt();
    //         }
    //         //n=5
    //         int freq[] = new int[n+1];
    //         for(int i=0;i<n;i++){
        //             freq[A[i]]++;
        //         }
        //         int missing = 0;
        //         int repeating = 0;
        //         for(int i=1;i<=n;i++){
            //             if(freq[i]>1) repeating = i;
            
            //             if(freq[i] == 0) missing = i;
            
            //         }
            //         System.out.println(repeating);
            //         System.out.print(missing);
            //     }
            //     }


          
            // import java.util.*;
            
            // public class Q5 {
            
            //     public static void main(String[] args) {
            //          Scanner scanner = new Scanner(System.in);
            //         // Read the size of the array
            
            //         int n = scanner.nextInt();   //5
            //         // Read the array elements
            
            //         int[] arr = new int[n];
            //         for (int i = 0; i < n; i++) {  
            //             arr[i] = scanner.nextInt(); //12334
            //         }
            
            //         // Variables to store repeating and missing elements
            //         int repeatingA = -1, missingB = -1 ;
            
            //         // Traverse the array to mark elements
            //         for (int i = 0; i < n; i++) {  //12334
            //             int index = Math.abs(arr[i]) - 1;  //1 //2 //3 //3 //4
            //             if (arr[index] < 0) {
            //                 repeatingA = Math.abs(arr[i]); //-1 //-2 //-2 //-3
            //             } else {
            //                 arr[index] = -arr[index];   //0 
            //             }
            //         }
            
            //         // Find the missing element
            //         for (int i = 0; i < n; i++) { //12334
            //             if (arr[i] > 0) {          
            //                 missingB = i + 1;
            //                 break; 
            //             } 
            //         }
            
            //         // Print the results
            //         System.out.println( repeatingA);
            //         System.out.println( missingB);
            
            //     }
            // }
            
// Time Complexity:O(N): The algorithm performs two separate passes through the array. The first pass marks elements to identify the repeating number, and the second pass finds the missing number. Each pass takes linear time.

// Space Complexity:O(1): The algorithm uses a constant amount of extra space for variables and modifies the input array in-place.
