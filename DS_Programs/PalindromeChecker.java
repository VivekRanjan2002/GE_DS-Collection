/*
a. Desc -> A palindrome is a string that reads the same forward and backward, for
example, radar, toot, and madam. We would like to construct an algorithm to
input a string of characters and check whether it is a palindrome.
b. I/P -> Take a String as an Input
c. Logic -> The solution to this problem will use a deque to store the characters of
the string. We will process the string from left to right and add each character to
the rear of the deque.
d. O/P -> True or False to Show if the String is Palindrome or not.
 */
package org.example.DS_Programs;
import java.util.*;
public class PalindromeChecker {
    public static boolean isPalindrome(String input) {
        Deque<Character> deque = new ArrayDeque<>();

        // Convert input string to lowercase and remove all the space characters
        String processedInput = input.toLowerCase().replaceAll(" ", "");

        // Add characters to the rear of the deque
        for (int i = 0; i < processedInput.length(); i++) {
            deque.addLast(processedInput.charAt(i));
        }

        // Check for palindrome by comparing characters from both ends of the deque
        while (deque.size() > 1) {
            if (!Objects.equals(deque.removeFirst(), deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        boolean isInputPalindrome = isPalindrome(inputString);
        if (isInputPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        scanner.close();
    }
}
