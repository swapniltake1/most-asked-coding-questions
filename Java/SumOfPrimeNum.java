package Java;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Write a Java program to find the sum of all prime numbers within a given range.
Allow the user to input the range (start and end values), and then output the sum of prime numbers within that range.
*/

public class SumOfPrimeNum {
   /**
     * @param start
     * @param end
     */
    public void calculateSum(int start, int end) {

        ArrayList<Integer> primeNums = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            boolean isPrime = true;

            for (int b = 2; b <= Math.sqrt(i); b++) {
                if (i % b == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime && i > 1) {
                primeNums.add(i);
            }
        }

        System.out.println("Prime numbers between " + start + " and " + end + ": " + primeNums);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int val1 = sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int val2 = sc.nextInt();
        SumOfPrimeNum foo = new SumOfPrimeNum();
        foo.calculateSum(val1, val2);

    }
}