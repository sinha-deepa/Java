package ex_02_Interview_Prep;

import java.util.HashMap;

public class Q04_Count_Occurrence_of_Each_Character {

    public static void main(String[] args) {
        String str = "selenium";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        System.out.println(map);
    }
}

/*
Logic:
Use HashMap → key = char, value = count
Increase count each time char appears

map.getOrDefault()
This is the key to understanding the entire program.
map.getOrDefault(ch, 0)
means:
"Give me the current value associated with this character. If the character doesn't exist in the HashMap, give me 0."
First character: s
Initially:
map = {}
We process:
ch = 's'
Now:
map.getOrDefault('s', 0)
Does 's' exist?
No.
Therefore:
0
Then:
0 + 1 = 1
So:
map.put('s', 1);
Map becomes:
{s=1}
 */
