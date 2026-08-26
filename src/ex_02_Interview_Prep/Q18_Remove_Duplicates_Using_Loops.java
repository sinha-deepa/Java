/*
Write a Java program to remove duplicate characters from a given String while preserving the order of their first occurrence.

For example:

Input:  "Hello World"
Output: "Helo Wrd"

The program should:

1. Process the string character by character.
2. Keep the first occurrence of each character.
3. Remove subsequent occurrences.
4. Preserve the original order.
5. Handle spaces as characters unless otherwise specified.
 */

package ex_02_Interview_Prep;

import java.util.Scanner;

public class Q18_Remove_Duplicates_Using_Loops {
    public static void remove_duplicates(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text to find and remove duplicates : ");
        String str = sc.nextLine();
        String removed_duplicate_str = "";

        for(int i = 0; i<=str.length()-1; i++){
            char ch = str.charAt(i);
            if(removed_duplicate_str.indexOf(ch)==-1){
                removed_duplicate_str +=ch;
            }
        }
        System.out.println("text after duplicates removal : "+removed_duplicate_str);
    }
    public static void main(String[] args){
        remove_duplicates();
    }

}
