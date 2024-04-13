/*
 * Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 

Constraints:

0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
 * 
 * 
 */



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationForPhoneNumber {
    // Mapping of digits to letters
    private static final Map<Character, String> phoneMap = new HashMap<>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};

    public List<String> letterCombinations(String digits) {
        List<String> combinations = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return combinations;
        }
        backtrack(combinations, new StringBuilder(), digits, 0);
        return combinations;
    }

    private void backtrack(List<String> combinations, StringBuilder currentCombination, String digits, int index) {
        if (index == digits.length()) {
            combinations.add(currentCombination.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = phoneMap.get(digit);
        for (char letter : letters.toCharArray()) {
            currentCombination.append(letter);
            backtrack(combinations, currentCombination, digits, index + 1);
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }

    public static void main(String[] args) {
        LetterCombinationForPhoneNumber solution = new LetterCombinationForPhoneNumber();

        // Test cases
        String digits1 = "23";
        String digits2 = "";
        String digits3 = "2";

        System.out.println(solution.letterCombinations(digits1)); // Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
        System.out.println(solution.letterCombinations(digits2)); // Output: []
        System.out.println(solution.letterCombinations(digits3)); // Output: ["a","b","c"]
    }
}
