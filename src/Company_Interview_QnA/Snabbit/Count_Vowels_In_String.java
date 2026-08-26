package Company_Interview_QnA.Snabbit;

import java.util.Scanner;

public class Count_Vowels_In_String {
    // Approach 1: Manual iteration (interview-standard,
    public static int count_Vowels(String str){
        if(str == null || str.isEmpty())
            return 0;
        int count = 0;
        String vowels = "aeiouAEIOU";
        for(char ch : str.toCharArray()){
            if(vowels.indexOf(ch)!=-1){
                count ++;
            }
        }
        return count;
    }

    // Approach 2: Stream-based (idiomatic modern Java, good to show fluency)
    public static long count_vowels_stream(String str){
        if(str == null)
            return 0;
        return str.chars().mapToObj(c-> (char)c).filter(c-> "aeiouAEIOU".indexOf(c)!=-1).count();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to count vowels : ");
        String input = sc.nextLine();
        System.out.println("Count of vowels in user entered string via manual count: "+count_Vowels(input));
        System.out.println("Count of vowels in user entered string via stream count: "+count_vowels_stream(input));
    }
}
