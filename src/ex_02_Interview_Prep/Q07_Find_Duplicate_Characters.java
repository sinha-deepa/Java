/*Logic:
        Count frequency using HashMap
        Print characters where count > 1
        -----
        How to Remember These Easily

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

import java.util.HashMap;

public class Q07_Find_Duplicate_Characters {
    public static void main(String[] args) {
        String str = "testautomation";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) > 1) {
                System.out.println(ch + " -> " + map.get(ch));
            }
        }
    }
}
