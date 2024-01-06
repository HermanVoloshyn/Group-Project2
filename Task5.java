package GroupProject2;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        //Check if Two Strings are Anagrams: Given two strings, determine if they
        //are anagrams, meaning they contain the same characters in a different order.
        //        For example, "listen" and "silent" are anagrams.

        String inputStr1 = "Listen";
        String inputStr2 = "Silent";
        System.out.println("The given strings are: " + inputStr1 +" and " + inputStr2);
        // converting their characters to lowercase
        inputStr1 = inputStr1.toLowerCase();
        inputStr2 = inputStr2.toLowerCase();
        // to check both strings are anagram or not
        if(inputStr1.length() == inputStr2.length()) { // checking length
            // converting the given strings into character arrays
            char[] array1 = inputStr1.toCharArray();
            char[] array2 = inputStr2.toCharArray();
            // sorting both arrays
            Arrays.sort(array1);
            Arrays.sort(array2);
            // checking equality and printing the result
            if(Arrays.equals(array1, array2)) {
                System.out.println("Both strings are anagram");
            } else {
                System.out.println("Both strings are not anagram.");
            }
        } else {
            System.out.println("Both strings are not anagram.");
        }
    }
}
