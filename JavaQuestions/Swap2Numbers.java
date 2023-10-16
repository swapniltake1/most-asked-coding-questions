package JavaQuestions;
import java.util.Scanner;

public class Swap2Numbers {

    // swap 2 numbers without using 3rd veriable in java.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number (A):: ?  ");
        int a= sc.nextInt();
        System.out.println("Enter 2st Number (B):: ?");
        int b=sc.nextInt();

        System.out.println("swappinng you numbers... 1st Number is "+a+" 2nd Number is "+b);

        a=a+b; // a=10, b=20 =30
        b=a-b; // =10
        a=a-b;

        System.out.println("Value of A :: "+a);
        System.out.println("value of B :: "+b);

        sc.close();
    }
}
