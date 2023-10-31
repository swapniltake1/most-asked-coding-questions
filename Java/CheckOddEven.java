package Java;

import java.util.Scanner;

public class CheckOddEven {
    
    public void checkNum(int num){
        if(num%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Numbber is odd");
        }
    }

    public static void main(String[] args) {
        
        CheckOddEven foo = new CheckOddEven();
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter your number to check :::");
        int n=sc.nextInt();
        foo.checkNum(n);
        
    }
}
