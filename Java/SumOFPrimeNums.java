 package Java;

/*
 * 
 * Question:
 *  Write a Java program to find the sum of all prime numbers within a given range.
 *  The program should prompt the user to enter the range (start and end), and then display the sum of all prime numbers within that range.
 */



class SumOFPrimeNums {

    public static void calculateSum(int start, int end){
        int totalsum=0;
        if(start!=0){
         
            for(int i=start; i<=end; i++){
                if(i%1==0 && i%2!=0){
                  //  System.out.println("Prime No : "+i);
                    totalsum=i+totalsum;
                   // System.out.println("Totalsum: "+totalsum);
                }
            }

            System.out.println(" Total Sum Is = "+totalsum);
        }
        else{
            System.out.println("check input number ");
        }

    }

    public static void main(String[] args) {
        SumOFPrimeNums.calculateSum(2, 10);
    }
    
}