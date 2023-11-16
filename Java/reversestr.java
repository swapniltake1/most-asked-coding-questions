package Java;

/*Write a program called ReverseString, which prompts user for a String, and prints 
the reverse of the String. The output shall look like:
Enter a String: abcdef
The reverse of String "abcdef" is "fedcba". */
public class reversestr {
    public static void main(String[] args) {
        
        String str = "abcdef";

        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
