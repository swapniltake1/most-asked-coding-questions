package JavaQuestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n, reverse = 0;

        System.out.println("Enter no to reverse----");

        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();

        while(n!=0){

            reverse=reverse*10;     // reverse = 0*10= 0
            System.out.println("reverse 1 :: "+reverse);
            reverse=reverse+n%10;   // 0=0+5/10= 2
            System.out.println("reverse 2 :: "+reverse);
            n=n/10;              
        }
        System.out.println("reverse of entered number is ::"+reverse);
    }
}



// output :

/* 
Enter no to reverse----
122
reverse 1 :: 0
reverse 2 :: 2
reverse 1 :: 20
reverse 2 :: 22
reverse 1 :: 220
reverse 2 :: 221
reverse of entered number is ::221 
*/
