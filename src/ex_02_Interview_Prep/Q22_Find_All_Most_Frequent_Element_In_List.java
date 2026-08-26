package ex_02_Interview_Prep;

import java.util.*;

public class Q22_Find_All_Most_Frequent_Element_In_List {
    public static List<Integer> find_All_Most_Frequent_Element_In_List(List<Integer> list) {

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find maximum frequency
        int maxFrequency = Collections.max(map.values());

        // Store all elements having maximum frequency
        List<Integer> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == maxFrequency) {
                result.add(entry.getKey());
            }
        }

        return result;
    }
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 5, 4, 5, 6, 3, 8, 3, 3, 2, 9, 8, 5, 6));

        List<Integer> most_frequent_element = Q22_Find_All_Most_Frequent_Element_In_List.find_All_Most_Frequent_Element_In_List(list);

        System.out.println(
                "Most frequent element in the list : "
                        + most_frequent_element
        );
    }
}
