package Java;

/* 

Write a program called SquareBoard that displays the following n×n (n=5) pattern using two 
nested for-loops.
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #

 */

public class PrintSqureHash {
    
    public static void main(String[] args) {
        
        for(int i = 1; i <=5; i++){

            for(int j=1; j<=5;j++){
                 System.out.print(" # ");
            }
            System.out.println(" ");
        }
    }
}
