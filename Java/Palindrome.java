package Java;

import java.util.Scanner;
//. Check Given No is palindrome or Not in java Program
public class Palindrome{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check palindrome or not");
        // innitialization
        String s1=sc.nextLine();
        String reverse="";
        int length=s1.length();

        // loop to reverse the  string 
        for(int i=length-1; i>=0; i--){
            reverse=reverse+s1.charAt(i);
        }
        // Comparison
        if(s1.equals(reverse)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
