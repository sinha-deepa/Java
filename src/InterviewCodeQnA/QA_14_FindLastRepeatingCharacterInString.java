//Find the last repeating character in a string

package InterviewCodeQnA;
import java.util.HashMap;

public class QA_14_FindLastRepeatingCharacterInString {
    public static void findLastRepeatingCharacterInString(){
        String str = "abccba";

        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Count frequency
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Traverse from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);

            if (freqMap.get(ch) > 1) {
                System.out.println("Last repeating character: " + ch);
                return;
            }
        }

        System.out.println("No repeating character found");
    }

    public static void main(String[] args){
        findLastRepeatingCharacterInString();
    }
}
