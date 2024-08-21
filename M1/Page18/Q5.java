// // Print all unique prime factors
// Take a whole number N as an integer input and then print all the unique prime factors of N such that each prime factor is printed in a separate line.

// Input Format

// Input contains an integer N.

// Constraints

// 1 <= N <= 2^31-1
// Output Format

// Print the prime factors as an integer value where each prime number should be printed in a separate line.

// Sample Input 0

// 45
// Sample Output 0

// 3
// 5
// Sample Input 1

// 100
// Sample Output 1

// 2
// 5
// Sample Input 2

// 240
// Sample Output 2

// 2
// 3
// 5
// Sample Input 3

// 350
// Sample Output 3

// 2
// 5
// 7
// Sample Input 4

// 400
// Sample Output 4

// 2
// 5
// Sample Input 5

// 390
// Sample Output 5

// 2
// 3
// 5
// 13



import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Q5 {
    public static void printPrimeFactors(int N) {
        // Create a set to store the unique prime factors
        Set<Integer> primeFactors = new HashSet<>();
        
        // Start with 2 as the first potential prime factor
        int factor = 2;
        
        // Repeatedly divide N by the current factor until it is no longer divisible
        while (N > 1) {
            if (N % factor == 0) {
                // If N is divisible by the current factor, add it to the set
                primeFactors.add(factor);
                
                // Divide N by the current factor
                N /= factor;
            } else {
                // If N is not divisible by the current factor, move on to the next factor
                factor++;
            }
        }
        
        // Print the unique prime factors
        for (int f : primeFactors) {
            System.out.println(f);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        printPrimeFactors(N);
        scanner.close();
    }
}