package ex_02_Interview_Prep;

import java.util.LinkedHashMap;

public class Q09_First_NonRepeating_Character {
    public static void main(String[] args) {
        String str = "aabbcde";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            if (map.get(ch) == 1) {
                System.out.println("First non-repeating: " + ch);
                break;
            }
        }
    }
}
