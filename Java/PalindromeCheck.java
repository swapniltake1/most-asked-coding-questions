package Java;
public class PalindromeCheck {
    public static void main(String[] args) {
        int number = 187;   // you can change this value
        int original = number;
        int reversed = 0;

        // Reverse the number
        while (number > 0) {
            int digit = number % 10;     // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            number = number / 10;        // remove last digit
        }

        // Check palindrome
        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
    }
}
