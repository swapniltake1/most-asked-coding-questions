package JavaQuestions;

import java.util.Scanner;

// .How to add two number Program in java 
//  WAP to addition of 2 numebrs in java
public class AddNumbers {
    public static void main(String[] args) {
        int a,b,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number :: ??");
        a=sc.nextInt();
        System.out.println("Enter 2nd number :: ??");
        b=sc.nextInt();

        System.out.println("Addition of  :: " +a+" + "+b);
        
        c=a+b;
        System.out.println("Answer :: "+c);
        sc.close();

    }
}
