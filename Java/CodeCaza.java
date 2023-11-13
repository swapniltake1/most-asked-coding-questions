package Java;

/*. 

Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line. 
The program shall print "Coza" in place of the numbers which are multiples of 3, "Loza" for 
multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on. The 
output shall look like:

Expected Output:
1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11 
Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22 
23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza  

*/
public class CodeCaza {
    public static void main(String[] args) {
        
       for(int i=1; i<=110; i++){
        
        if(i%3 == 0 && i%5 == 0){
            System.out.print(" CozaLoza ");
        }
        else if( i%3 == 0){
            System.out.print(" Coza ");
        }
        else if(i%5 == 0){
           System.out.print(" Loza ");
        }
        else if(i%7 == 0){
            System.out.print(" Woza ");
        }
        else{
           System.out.print(" "+i+" ");
        }
       // int num11=11;
        if(i%11 == 0){
            System.out.println(" ");
         //  num11=num11*num11;
        }

 
    }
    }
}