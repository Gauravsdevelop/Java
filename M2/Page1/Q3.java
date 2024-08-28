// // GKSTR43 Insertion Sort

// Take an array of size N as input.

// Sort the array using insertion sort.

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

public class Q3 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        
        int N = scanner.nextInt();

      
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        insertionSort(arr);

        
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}