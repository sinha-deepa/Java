/*
💡 Logic:
Reverse string
Compare original vs reversed

👉 Same = palindrome
 */

package ex_02_Interview_Prep;

import java.util.Scanner;

public class Q03_Check_Palindrome_using_reverse_method {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check for palindrome :");
        String str = sc.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed string is: "+reversed);
        if(str.equals(reversed)){
            System.out.println("String is palindrome");
        }else
            System.out.println("String is not palindrome");
    }
}
