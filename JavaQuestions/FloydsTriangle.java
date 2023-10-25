package JavaQuestions;

import java.util.Scanner;

//Print Floyd’s Triangle in java Program

public class FloydsTriangle{
    public static void main(String[] args) {
        
        int n, num = 1, c, d;

        Scanner dc=new Scanner(System.in);
        System.out.println("Enter how much row you want in tringle ::");
        n=dc.nextInt();

        System.out.println("Floyd's triangle ::");

        for(c=1; c<=n; c++){

            for(d=1; d<=c; d++){

                System.out.print(num+" ");
                num++;
            }

            System.out.println("");
        }
    }
}