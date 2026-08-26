package ex_02_Interview_Prep;

import java.util.ArrayList;
import java.util.Scanner;

public class Q13_Reverse_Arraylist_Using_Loop {

    private static void reverse_arraylist(){
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter size of arraylist : ");
        int size = sc.nextInt();
        ArrayList<String> words = new ArrayList<>();
        System.out.print("Enter "+ size + " elements one by one : ");
        for(int i=0; i<=size-1;i++ ){
            words.add(sc.nextLine());
        }
        if(words==null || words.isEmpty()){
            System.out.println("Arraylist is null or empty.");
            return;
        }
        ArrayList<String> reversedWords = new ArrayList<>();
        for(int i =words.size()-1; i>=0; i--){
            reversedWords.add(words.get(i));
        }
        System.out.println("Reversed ArrayList: " + reversedWords);
        sc.close();
    }
    public static void main(String[] args){
        reverse_arraylist();
    }
}
