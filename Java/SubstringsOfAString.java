package Java;

import java.util.Scanner;

//Find All substring of string in java Program
public class SubstringsOfAString {
    public static void main(String[] args) {
        String string, sub;
        int i, c,length;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter new String");

        string=sc.nextLine();
        
        length=string.length();

        System.out.println("Substring of "+string+" are ::");

        for(c=0; c<length; c++){  // loop for loping code till string ends 

            for( i=0;i<=length+c; i++){    // loop for printing substring

                sub=string.substring(c, c+i);  // create  a sub string

                System.out.println(sub); // printing substring

            }
        }
    }
}
