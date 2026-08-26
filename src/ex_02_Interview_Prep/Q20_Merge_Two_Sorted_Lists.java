package ex_02_Interview_Prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q20_Merge_Two_Sorted_Lists {
    public static List<Integer> merge_Two_Sorted_Lists(List<Integer> list1, List<Integer> list2){
        List<Integer> list = new ArrayList<>();
        int i = 0, j=0;
        while (i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)){
                list.add(list1.get(i));
                i++;
            }else{
                list.add(list2.get(j));
                j++;
            }
        }
        while(i < list1.size()){
            list.add(list1.get(i));
            i++;
        }
        while(j < list2.size()){
            list.add(list2.get(j));
            j++;
        }
        return list;
    }
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>( Arrays.asList(1, 3, 6, 8));
        List<Integer> list2 = new ArrayList<>( Arrays.asList(2, 4, 7, 9, 13));
        List<Integer> merged_List = merge_Two_Sorted_Lists(list1, list2);
        System.out.println("Merged sorted list : "+ merged_List);
    }
}
