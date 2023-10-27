package Java;

import java.util.Random;

public class OtpGenerator {
    
    public int generateOtp(){
        Random random = new Random();
        int otp=random.nextInt(1000000);
        return otp;
    }

    public static void main(String[] args) {
      OtpGenerator otpGenerator= new OtpGenerator();
     // otpGenerator.generateOtp();
      System.out.println(otpGenerator.generateOtp());

    }
}
