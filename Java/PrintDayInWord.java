package Java;

import java.util.Scanner;

//Write a program called PrintDayInWord, which prints “Sunday”, “Monday”, ... “Saturday” if 
//the int variable "day" is 0, 1, ..., 6, respectively. Otherwise, it shall print “Not a valid day”

public class PrintDayInWord {
    
    public void checkDay(int num){
        switch (num) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wednday");
            break;
            case 5:
            System.out.println("thursday");
            case 6:
            System.out.println("friday");
            break;
            case 7:
            System.out.println("saturday");
            break;
        
            default:
                System.out.println("Not exist");
                break;
        }
        
    }
    public static void main(String[] args) {
        
      PrintDayInWord  foo = new PrintDayInWord();
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter numbr to check day ");
      int num = sc.nextInt();
      foo.checkDay(num);
    }
}
