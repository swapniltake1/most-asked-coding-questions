/* 
 * Problem: Calculate Factorial
Write a Java method that calculates the factorial of a number. The factorial of a non-negative integer n is the product of all positive integers less than or equal to n.

For example:

Factorial of 5 (5!) = 5 x 4 x 3 x 2 x 1 = 120
Factorial of 0 (0!) = 1
Your method should take an integer n as input and return its factorial. Remember to handle cases where n is negative or zero.
 */
package Java;

public class Factorial {

    // method to calculate factorial numbers
    public static int calculateFactorial(int num) {
        if (num < 0) {
            return -1; // Handle negative numbers (Factorial of negative numbers is undefined)
        } else {
            int factorial = 1;
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }

    public static void main(String[] args) {
        int number = 5; // Example number to calculate factorial
        int result = Factorial.calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
