package Java;

import java.util.Scanner;

/* Write a program called CheckPassFail which prints "PASS" if the int variable "mark" is more 
than or equal to 50; or prints "FAIL" otherwise */
public class CheckPassFail {
    
    public void checkResult(String studentName, int marks){
        
        int pass=50;

        if(marks >= pass){
                System.out.println(studentName+" Is PASS with :: "+marks);
        }
        else{
            System.out.println(studentName+" FAIL got only ::"+marks);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name=sc.nextLine();
        System.out.println("Enter Student Marks");
        int marks = sc.nextInt();

       CheckPassFail result = new CheckPassFail();
        result.checkResult(name, marks);

        

        
    }
}
