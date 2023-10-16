package JavaQuestions;
import java.util.Scanner;

public class Swap2Num{
    public static void main(String[] args) {
        
        int a, b, temp;
       // temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st value :: ");
        a=sc.nextInt();
        System.out.println("Enter the 2st value :: ");
        b=sc.nextInt();

        System.out.println("Before Swaping a:: "+a + "  & B:: "+b);

        System.out.println("Swapping your numbers ::");

        temp=a;
        a=b;
        b=temp;

        System.out.println("value of a::"+a+"  & value of b::"+b);
        


    }
}