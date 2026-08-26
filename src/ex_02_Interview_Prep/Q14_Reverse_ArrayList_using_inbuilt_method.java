package ex_02_Interview_Prep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q14_Reverse_ArrayList_using_inbuilt_method {

    private static void reverse_ArrayList(){
        List<String> words = new ArrayList<>(Arrays.asList("aloo", "banana", "chiku", "dog", "fog", "love"));
        Collections.reverse(words);
        System.out.println("Reversed arraylist : "+words);
//        if (words != null) {
//            for (word : words) {
//                words.reversed();
//                System.out.println();
//            }
//        }
    }

    public static void main(String[] args){
        Q14_Reverse_ArrayList_using_inbuilt_method ral = new Q14_Reverse_ArrayList_using_inbuilt_method();
        ral.reverse_ArrayList();
    }
}
