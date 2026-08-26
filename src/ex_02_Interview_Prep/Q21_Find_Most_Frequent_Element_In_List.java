package ex_02_Interview_Prep;

import java.util.*;

public class Q21_Find_Most_Frequent_Element_In_List {

    public static int find_Most_Frequent_Element_In_List(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: list){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
            return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 5, 4, 6, 3, 8, 3, 3, 2, 9, 8, 5, 6));
        int most_frequent_element = Q21_Find_Most_Frequent_Element_In_List.find_Most_Frequent_Element_In_List(list);
        System.out.println("Most frequent element in the list : " + most_frequent_element);
    }
}

