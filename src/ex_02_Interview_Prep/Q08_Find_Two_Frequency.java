package ex_02_Interview_Prep;

import java.util.HashMap;

public class Q08_Find_Two_Frequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 2, 3, 4, 2};

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print frequency of the number 2 specifically
        int target = 2;
        int count = freq.getOrDefault(target, 0);
        System.out.println(target + " occurs " + count + " time(s)");
    }
}