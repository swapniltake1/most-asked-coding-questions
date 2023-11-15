package Java;

/*
Write a program called CheckerBoard that displays the following n×n (n=7) checkerboard pattern 
using two nested for-loops.
# # # # # # #
# # # # # # #
# # # # # # #
# # # # # # #
# # # # # # #
# # # # # # #
# # # # # # #

Your program should use only three output statements, one EACH of the followings:
System.out.print("# "); // print # and a space, without newline
System.out.print(" "); // print a space, without newline
System.out.println(); // print a newline
 */

public class CheckerBoard {
    
    public static void main(String[] args) {
        
        for(int i=1; i <= 7; i++){

            for(int j=1; j<=7; j++){
                System.out.print("# ");
            }
            System.out.println("");
            if(i%2==0){
                System.out.print(" ");
            }
        }
    }
}
