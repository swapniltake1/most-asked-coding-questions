import java.util.Scanner;

// Swap two numbers without using 3rd veriable.



public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-------- Welcome to number Swapper -----------");
        System.out.println("Enter First Number");
        int a = sc.nextInt();

        System.out.println("Enter 2nd Number");
        int b = sc.nextInt();

        System.out.println("you entered number 1 is "+a+" & 2nd Number is "+b);

        System.out.println("Swapping Your numbers ***********");
 
        // if a = 10, b = 5   then a=10+5: a=15;
        a=b+a;
        // b= 5-15: b=10;
        b=a-b;
       // a= 15-10: a=5;
        a=a-b;
      
        System.out.println("here is your swapped numbers : 1 "+ a);
         System.out.println("here is your swapped numbers : 2 "+ b);


    }
}
