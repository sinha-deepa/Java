/*
Create a program that checks whether a given string is a palindrome.
A palindrome is a word or phrase that reads the same backward as forward (ignoring spaces, punctuation, and capitalization).
Use an if-else statement to determine if the string is a palindrome.
 */

package InterviewCodeQnA;

import java.util.Scanner;

public class QA_04_PalindromeChecker {
    public void palindromeChecker(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to check palindrome : ");
        String word = sc.nextLine();
        String reverse = "";
        for(int i = word.length()-1; i>=0; i--){
            reverse = reverse + word.charAt(i);
        }
        System.out.println("Reverse of string (" + word + ") is : " + reverse);
        if(word.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("not palindrome");
        }
    }
    public static void main(String[] args){
        QA_04_PalindromeChecker pc = new QA_04_PalindromeChecker();
        pc.palindromeChecker();
    }
}
