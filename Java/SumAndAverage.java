package Java;

import java.util.Scanner;

/* 
Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to an upperbound (e.g., 
100). Also compute and display the average. The output shall look like:
The sum is 5050
The average is 50.5
*/

public class SumAndAverage {
    
    public void additionofnumbers(int start, int end ){
        int totalsum=0; 

       // System.out.println("Addtion started from ::"+start +" to "+ end);

        for(int a=start; a<=end; a++){
                  //  System.out.println("addition of"+ a);
                   totalsum = a+totalsum;
        }

        System.out.println("The sum is "+totalsum);

        //System.out.println("calculating average of total addition ::");

        checkAverage(totalsum);

    }

     public void checkAverage(int sumofnumbers){

        double avarage = sumofnumbers/100;
                 System.out.println( "The average is " +avarage);
        }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number to start calculate the addition");
        int aa = sc.nextInt();
        System.out.println("Enter End of number till additiomnngoes  ");
        int ab = sc.nextInt();

        SumAndAverage foo = new SumAndAverage();
        foo.additionofnumbers(aa, ab);
        
    }

}
