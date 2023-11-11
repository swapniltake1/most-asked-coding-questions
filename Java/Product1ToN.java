package Java;


 /* Write a program called Product1ToN to compute the product of integers 1 to 10 (i.e., 
1×2×3×...×10). Try computing the product from 1 to 11, 1 to 12, 1 to 13 and 1 to 14. */

public class Product1ToN {
    
   public void productCheck(int start, int end){
    
    int count=1;

    for(int i=start; i<=end; i++){
        count = count*i;
    }


    System.out.println("product of "+start+" to "+end+" = "+count);

   }

   public static void main(String[] args) {
    
    Product1ToN foo = new Product1ToN();
    foo.productCheck(1, 10);
    
   }



}
