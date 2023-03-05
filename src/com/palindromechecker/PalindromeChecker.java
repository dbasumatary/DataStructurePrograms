package com.palindromechecker;

import java.util.LinkedList;
import java.util.Deque;
import java.util.Scanner;

//Checking palindrome using deque
public class PalindromeChecker {
    public static boolean checkPalindrome(String string) {

        // method takes a string as input and uses a dequeue to
        // reverse the order of the characters in the string.
        Deque<Character> deque = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {

            //We iterate over each character in the string and add it to
            //the end of the dequeue using the addLast method.
            deque.addLast(string.charAt(i));
        }

        //use a StringBuilder to build a reversed version of the string
        //by repeatedly removing characters from the end of dequeue using pollLast method
        //and appending them to the end of the StringBuilder.
        StringBuilder reversedString = new StringBuilder();
        while (!deque.isEmpty()) {
            reversedString.append(deque.pollLast());
        }

        //First convert the StringBuilder back to string
        //Returns boolean value
        return string.equals(reversedString.toString());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = scanner.nextLine();

        if (checkPalindrome(string)) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
        }
    }
}
