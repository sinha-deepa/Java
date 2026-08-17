/*
💡 Logic:
Reverse string
Compare original vs reversed

👉 Same = palindrome
 */

package ex_02_Interview_Prep;

import java.util.Scanner;

public class Check_Palindrome_using_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter string to reverse : ");
        String str = sc.nextLine();
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        System.out.println("Reverse of string (" + str + ") is : " + reverse);
        if(str.equals(reverse)){
            System.out.println("Given string is palindrome");
        }else{
            System.out.println("Given string is not palindrome");
        }
    }
}
