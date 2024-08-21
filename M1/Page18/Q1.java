// // HW_Print Armstrong in a range

// Take x and y as integer inputs.

// Print all the Armstrong numbers in separate line which lie in the range x to y (both x and y inclusive)

// Use the function isArmstrong() which checks if a number is an Armstrong number or not and returns true or false accordingly.

// Input Format

// For each test case,

// x will be given in the first line

// y will be given in the second line.

// Constraints

// 1 <= x , y <= 2^10
// Output Format

// Print the numbers as integer outputs where each number is printed in a separate line.

// Sample Input 0

// 100
// 500
// Sample Output 0

// 153 
// 370 
// 371
// 407 
// Sample Input 1

// 1 
// 200
// Sample Output 1

// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9
// 153
// Sample Input 2

// 200
// 500
// Sample Output 2

// 370
// 371
// 407
// Sample Input 3

// 400
// 500
// Sample Output 3

// 407
// Sample Input 4

// 50
// 500
// Sample Output 4

// 153
// 370
// 371
// 407

import java.util.*;

public class Q1 {

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == originalNum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input x and y
      
        int x = scanner.nextInt();
       
        int y = scanner.nextInt();
        
        // Validate x and y
        if (x < 1 || y < 1 || x > 1024 || y > 1024) {
            System.out.println("Invalid input. x and y should be in range 1 to 1024.");
            return;
        }
        
        // Print Armstrong numbers in the range [x, y]
     
        for (int i = x; i <= y; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}