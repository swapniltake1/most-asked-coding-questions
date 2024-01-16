package Java;

public class IsPalindrome {
    
    
    public void isPalindromeString(String input){
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                System.out.println("String is not isPalindrome");
                return; 
            }
        }
        System.out.println("isNotPalindrome");
    }

    public static void main(String[] args) {
        IsPalindrome foo = new IsPalindrome();
        foo.isPalindromeString("Mahesh");
    }
}
