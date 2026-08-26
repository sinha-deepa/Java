package ex_02_Interview_Prep;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Q17_Remove_Duplicate_Characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to remove duplicates : ");
        String str = sc.nextLine();
        HashSet<Character> set = new HashSet<>();
        String result = "";

        for (char ch : str.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result += ch;
            }
        }

        System.out.println(result);

/*
Line-by-Line Logic (One-Liners)
HashSet<Character> set = new HashSet<>();
👉 Create a set to store unique characters only
String result = "";
👉 Initialize empty string to store final output without duplicates
for (char ch : str.toCharArray())
👉 Loop through each character of the string
if (!set.contains(ch))
👉 Check if character is not already seen
set.add(ch);
👉 Add character to set (mark as visited)
result += ch;
👉 Append character to result (only first occurrence)
System.out.println(result);
👉 Print the final string with duplicates removed
one line to remember - Loop through string → if char not seen → add to set + result → print unique string”
 */

 // Variation 2: Remove Duplicates WITHOUT Using Set ❗


 String str1 = "programming";
 String result1 = "";
 for(int i = 0; i < str.length(); i++) {
     char ch = str1.charAt(i);

     if (result.indexOf(ch) == -1) {
         result1 += ch;
     }
 }

 System.out.println(result1);

// Variation 3: Print Only Duplicate Characters


        String str2 = "programming";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch);
            }
        }

//        Variation 4: First Non-Repeating Character ⭐

        String str7 = "aabbcde";

        LinkedHashMap<Character, Integer> map7 = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println(ch);
                break;
            }
        }

//  Variation 5: Count Unique Characters


        String str4 = "programming";

        HashSet<Character> set2 = new HashSet<>();

        for (char ch : str4.toCharArray()) {
            set2.add(ch);
        }

        System.out.println("Unique count: " + set2.size());


//        Variation 6: Remove Only Adjacent Duplicates 🔥



        String str5 = "aabbccdaa";
        String result3 = "";

        for (int i = 0; i < str5.length(); i++) {
            if (i == 0 || str5.charAt(i) != str5.charAt(i - 1)) {
                result3 += str5.charAt(i);
            }
        }

        System.out.println(result);
//💡 Logic
//        Compare current char with previous
//        Add only if different
//🚀 Variation 7: Most Frequent Character ⭐⭐


        String str6 = "programming";

        HashMap<Character, Integer> map2 = new HashMap<>();

        for (char ch : str6.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        char maxChar = ' ';
        int max = 0;

        for (char ch : map2.keySet()) {
            if (map2.get(ch) > max) {
                max = map2.get(ch);
                maxChar = ch;
            }
        }

        System.out.println(maxChar);
//💡 Logic
//        Count frequency
//        Track max count
    }
}