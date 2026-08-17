/*
Logic:
     1. Start from last character
     2. Move backwards
     3. Keep adding characters to new string

       👉 Think: "abc" → c + b + a
 */

package ex_02_Interview_Prep;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter string to reverse : ");
        String str = sc.nextLine();
        String reverse = "";
        for(int i=str.length()-1; i>=0;i--){
            reverse += str.charAt(i);
        }
        System.out.println("Reverse of string ("+str+") is : "+reverse);
    }
}
