package ex_01_Loops;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a word to check if it's a palindrome:");
        String word = scanner.nextLine();
        String reversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }
        if (word.equalsIgnoreCase(reversedWord)){
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}

