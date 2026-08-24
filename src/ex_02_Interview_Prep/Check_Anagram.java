/*
Logic:
Convert to char array
Sort both
Compare arrays

👉 Same letters → same sorted form

---
All problems use only 3 core patterns:

🧠 Pattern 1: Loop
Reverse string
Count vowels
🧠 Pattern 2: HashMap
Frequency problems
Duplicates
🧠 Pattern 3: Sorting
Anagram
------
 */

package ex_02_Interview_Prep;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Anagram {
    public static void main(String[] args) {
//        String s1 = "listen";
//        String s2 = "silent";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first word : ");
        String s1 = sc.nextLine();
        System.out.print("Enter second word : ");
        String s2 = sc.nextLine();
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagram");
            } else {
                System.out.println("Not Anagram");
            }
    }
}

