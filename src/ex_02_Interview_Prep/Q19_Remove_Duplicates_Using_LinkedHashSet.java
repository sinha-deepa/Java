package ex_02_Interview_Prep;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Q19_Remove_Duplicates_Using_LinkedHashSet {
    public static String remove_Duplicates_Using_LinkedHashSet(){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter text to remove duplicates : ");
        String str = sc.nextLine();
        Set<Character> character = new LinkedHashSet<>();
        for(char ch : str.toCharArray()){
            character.add(ch);
        }
        StringBuilder  str1 = new StringBuilder();
        for(char ch : character){
            str1.append(ch);
        }
        return str1.toString();
    }
    public static void main(String[] args){
        System.out.println("Text after removal of duplicates : "+remove_Duplicates_Using_LinkedHashSet());
    }
}
