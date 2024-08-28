//GKSTR45 Selection Sort    // Min. element at correct position

// Take an array of size N as input.
// Sort the array using selection sort.

// Note: Don't use inbuilt sort function.

// Input Format  
// An integer N, which is the size of the array.
// N integers, depicting the elements of the array.

// Constraints
// 0 <= arr.length <= 10^4
// -1*10^5 <= arr[i] <= 10^5

// Output Format
// Return A sorted array of size N.

// Sample Input 0
// 5
// 9 4 3 8 7
// Sample Output 0
// 3 4 7 8 9


import java.util.*;

public class Q2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        
        for(int i=0; i<n; i++){
            A[i] = sc.nextInt(); 
        }
        // logic for selction sort
        
        for(int i=0; i<n-1; i++){  // i=0
            
            int minIdx = i ;  // assuming index of minimum element is i
           
            for(int j=i+1 ; j< n ; j++){
                if(A[j]< A[minIdx]){
                    minIdx = j;
                                     
                }
                
            }    //now swap
            
            int temp = A[i];
            A[i] = A[minIdx];
            A[minIdx] = temp;
        }
        for (int i=0; i<n; i++){
            System.out.print(A[i]+ " " );
        }
      
    }
}


//Discussed One