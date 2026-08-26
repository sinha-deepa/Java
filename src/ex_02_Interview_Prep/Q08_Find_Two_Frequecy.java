package ex_02_Interview_Prep;

import java.util.HashMap;

public class Q08_Find_Two_Frequecy {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 2, 3, 4, 2};
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int key : freq.keySet()) {
            System.out.println(key + " occurs " + freq.get(key) + " time(s)");
        }
    }
}
