//Count vowels and consonants in a String

package InterviewCodeQnA;

import java.util.Scanner;

public class QA_12_CountVowelsNConsonantInString {
    public void countVowelsNConsonantInString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String to count vowels and consonants : ");
        String str = sc.nextLine();
        int countVowels = 0;
        int countConsonant = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    countVowels++;
                } else {
                    countConsonant++;
                }
            }
        }

        System.out.println("Vowels count: " + countVowels);
        System.out.println("Consonants count: " + countConsonant);
    }

    public static void main(String[] args) {
        QA_12_CountVowelsNConsonantInString cvcs = new QA_12_CountVowelsNConsonantInString();
        cvcs.countVowelsNConsonantInString();
    }
}
