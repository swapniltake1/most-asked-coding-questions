package JavaQuestions;
import java.util.Scanner;
//How to check Odd and Even Number in java.

public class OddOrEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check even or odd-->");
        int a = sc.nextInt();

        if(a % 2== 0){
            System.out.println("Entered Number is even :::" +a);
        }
        else{
            System.out.println("Entered number is Odd :::"+a);
        }
        sc.close();
    }
}