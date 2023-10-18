package JavaQuestions;

import java.util.Scanner;

// Find Largest no in java Program
public class LargestNum {
    public static void main(String[] args) {
        int x,y,z;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers :: ");
        x=sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();

        if(x>y && x>z){
            System.out.println("First Number is Largest ::" +x);
        }
        else if( y>x && y>z){
             System.out.println("Secoend Number is Largest ::" +y);
        }
        else if( z>x && z>y){
             System.out.println("Secoend Number is Largest ::" +z);
        }
        else
             System.out.println("Entered numbers are not distinct.");

             sc.close();

    }
}
