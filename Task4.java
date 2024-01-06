package GroupProject2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Check if a String is Palindrome: Determine whether a given string is a
        //palindrome, which means it reads the same forwards and backward. For
        //example, "madam" is a palindrome.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        boolean isPalindromeWord=isPalindrome(word);
        if (isPalindrome(word))  {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
        scanner.close();
    }
    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase(); // Convert the word to lowercase for case-insensitive comparison
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
