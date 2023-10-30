import java.util.Scanner;

public class StringPalindromeOrNot {

    // Function
    public boolean isPalindrome(String input) {
        // flag
        boolean result = true;
        // length of string
        int length = input.length();
        // For loop i
        for (int i = 0; i <= length/2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StringPalindromeOrNot check = new StringPalindromeOrNot();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String");

        String str = sc.nextLine();

        boolean isPalindromic = check.isPalindrome(str);

        if (isPalindromic) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        sc.close();
    }
}
