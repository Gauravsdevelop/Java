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



import java.util.*;

public class Q5 {

      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> primeFactors = new ArrayList<>();
        findUniquePrimeFactors(N, primeFactors);

        // Sort the prime factors to ensure they are printed in ascending order
        Collections.sort(primeFactors);

        // Print the unique prime factors, each on a new line
        for (int prime : primeFactors) {
            System.out.println(prime);
        }
    }

    private static void findUniquePrimeFactors(int n, ArrayList<Integer> primeFactors) {
        // Check for number of 2s that divide n
        if (n % 2 == 0) {
            primeFactors.add(2);
            while (n % 2 == 0) {
                n /= 2;
            }
        }

        // Check for odd factors from 3 to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                primeFactors.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // If n becomes a prime number greater than 2
        if (n > 2) {
            primeFactors.add(n);
        }
    }
}