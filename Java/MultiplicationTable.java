package Java;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        int a, input;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for multiplication Table...!!");
        input=sc.nextInt();

        for(a=1; a<=10; a++){
                System.out.println("Multiplication of "+input+" * "+a+" = "+input*a);
        }
        sc.close();
    }
}
