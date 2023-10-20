package JavaQuestions;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the first string to compare:");
        String s1 = sc.nextLine();
        System.out.println("Write the second string to compare:");
        String s2 = sc.nextLine();

        if (s1.compareTo(s2) > 0) {
            System.out.println("First string is greater: " + s1);
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("Second string is greater: " + s2);
        } else {
            System.out.println("Strings are equal");
        }
    }
}


//explainationns::The compareTo method returns an integer value that indicates the lexicographical difference between the strings. If the result is greater than 0, it means the first string is lexicographically greater. If the result is less than 0, it means the second string is lexicographically greater. If the result is 0, it means both strings are equal.