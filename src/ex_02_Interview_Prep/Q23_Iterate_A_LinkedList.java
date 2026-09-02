package ex_02_Interview_Prep;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Q23_Iterate_A_LinkedList {
    public static void iterate_A_LinkedList(){
        LinkedList<String> list = new LinkedList<>(Arrays.asList("a", "v", "d","g"));
        // using iterator
        System.out.println("using Iterator : ");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        // using enhanced for loop
        System.out.println("using enhanced for loop :");
        for(String item: list) {
            System.out.println(item);
        }
        // using for loop
        System.out.println("using for loop : ");
        for(int i = 0; i<= list.size()-1; i++){
            System.out.println(list.get(i));
        }
    }
    public static void main(String[] args){
        iterate_A_LinkedList();
    }
}
