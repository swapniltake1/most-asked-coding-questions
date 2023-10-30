import java.util.Scanner;

// Check given number is prime or not 


public class PrimeNumberCheck{

    public static boolean isPrime(int n){  
        
            if(n==0 || n==1){
           System.out.println("Your number is not prime  !!");
            return false;
        }

        if(n==2){
           System.out.println("Your Number is Prime");
            return true;
        }

        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
              System.out.println("Your number not prime ....");
                return false;
            }
        }

        System.out.println("Number is Prime ");
        return true;
    }


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Hii There...");
        System.out.println("Enter number which you want to check....");
       // int n = sc.nextInt();
          System.out.println(isPrime(sc.nextInt()));

          System.out.println("Thank You #$%^&*");

         
        

    }
}