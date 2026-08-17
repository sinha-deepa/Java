package ex_02_Interview_Prep;

import java.util.HashMap;

public class Count_Occurrence_of_Each_Character {

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
 */
