// // Double Occurence

import java.util.*;

public class Q3 {
public static int countacc(int a1[],int x){ //((3,4,5,1,4,6), //1) //2//3//4//5
 int count=0;
 for(int i=0;i<a1.length;i++){     //i<6
     if(a1[i]==x){     //i=3
         count++;  // 1 //1 //2 //1
     }
 }return count;
}
public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);   

    int n = sc.nextInt();    //5

    int a[]=new int[n];     // 1,2,3,4,5
    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }

    int m = sc.nextInt();     //6
    int a1[] =new int[m];  

    for(int i=0;i<m;i++){       //3,4,5,1,4,6
        a1[i]=sc.nextInt();
    }

    //logic 
    for(int i=0;i<n;i++){                             
        int x=a[i]; // we are giving element to the x integer    //1
        int count=countacc(a1,x); //((//3,4,5,1,4,6), //1)   //2//3//4//5 final after function done count value = // 1 //1 //2 //1

        if(count==2){          
            System.out.print(x+" ");     //4
        }
    }
    
}
}

// Time Complixity:- O(n * m): The countacc function runs in O(m) time for each of the n elements in a. Thus, the overall complexity is O(n * m).
// Space Complexity O(1): The space complexity is constant beyond the input arrays, as the function uses a fixed amount of extra space.



//question
// Given an array of size n with unique integer elements. And then take m as an integer input. Declare the second array of size m that stores values of int data-type. Then take m integer inputs and store them in the array one by one.

// Then print all the elements of the first array which occur exactly twice in the second array.

// Input Format

// First line contains an integer number n representing size of first array.
// Second line contains n integer inputs representing elements of first array.
// Third line contains an integer number m representing size of second array.
// Fourth line contains m integer inputs representing elements of second array.

// Constraints
// 1 <= n , m <= 100000

// 0 <= arr1[i] , arr2[i] <= 100000

// Output Format
// An series on integer element in single line.

// Sample Input 0
// 5
// 1 2 3 4 5
// 5
// 1 1 2 3 4

// Sample Output 0

// 1 
// Explanation 0

// 1 is only element of first array that has twice occurence in second array.









// import java.util.*;

// public class Q3 {

  
//         public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input size of the first array
//         int n = scanner.nextInt();
//         int[] arr1 = new int[n];

//         // Input elements of the first array
//         for (int i = 0; i < n; i++) {
//             arr1[i] = scanner.nextInt();
//         }

//         // Input size of the second array
//         int m = scanner.nextInt();
//         int[] arr2 = new int[m];

//         // Input elements of the second array
//         for (int i = 0; i < m; i++) {
//             arr2[i] = scanner.nextInt();
//         }

//         // Use a HashMap to count occurrences in the second array
//         Map<Integer, Integer> countMap = new HashMap<>();
//         for (int value : arr2) {
//             countMap.put(value, countMap.getOrDefault(value, 0) + 1);
//         }

//         // Print elements from the first array that occur exactly twice in the second array
//         for (int value : arr1) {
//             if (countMap.getOrDefault(value, 0) == 2) {
//                 System.out.print(value + " ");
//             }
//         }
//     }
// }




// 5
// 1 2 3 4 5
// 5
// 1 1 2 3 4







// import java.util.*;

//  public class Q3 {

  
//          public static void main(String[] args) {
//          Scanner scanner = new Scanner(System.in);

//          // Input size of the first array
//          int n = scanner.nextInt();
//          int[] arr1 = new int[n];

//          // Input elements of the first array
//          for (int i = 0; i < n; i++) {
//              arr1[i] = scanner.nextInt();
//          }

//         //  Input size of the second array
//          int m = scanner.nextInt();
//          int[] arr2 = new int[m];

//         //  Input elements of the second array
//          for (int i = 0; i < m; i++) {
//              arr2[i] = scanner.nextInt();
//          }


//          int count = 0 ;
//                 for( int j=0; j<= arr1.length - 1; j++){
//                      for (int k=0; k<= arr2.length; k++){
                        
//                      if( arr1[j] == arr2[k]){
//                         count++;
//                         System.out.println(count);

//                         if (count == 2){
//                             System.out.println("output :" + arr2[k]);
//                         }
//                      }
         
//                    }
//        }

//        }
//     }
    
