/*
💡 Logic:
Convert string → char array
Check if character exists in "aeiou"
Count accordingly
 */

package ex_02_Interview_Prep;

import java.util.Scanner;

public class Q05_Count_Vowels_n_Consonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to find vowels and consonants : ");
        String str = sc.nextLine();
        int vowels = 0, consonants = 0;
//        for (char ch : str.toLowerCase().toCharArray()) {
//            if ("aeiou".indexOf(ch) != -1) {
//                vowels++;
//            } else {
//                consonants++;
//            }
//        }
        for (char ch : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(ch) != -1) {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
