package Java;

import java.util.Scanner;

// Find factorial for given no Program in Java

public class FindFactorial {
    public static void main(String[] args) {
        
        int a,b, fact=1;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number to check factorials ");

         a = sc.nextInt();
        
         for(b=1; b<= a; b++){

                 //1*1 = 1; 
                 //1*2 = 2;
                 //2*3 = 6;
                 //6*4 = 24;
                 //24*5= 120

            fact=fact*b;
            
            System.out.println("Factorial of "+b+" is = "+fact);
         }
         sc.close();
    }
}
