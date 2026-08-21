package ex_02_Interview_Prep;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_ArrayList_In_Place {

    private static void reverseArrayList() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int size = scanner.nextInt();

        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter " + size + " elements:");

        for (int i = 0; i < size; i++) {
            words.add(scanner.next());
        }

        if (words.isEmpty()) {
            System.out.println("ArrayList is empty.");
            return;
        }

        System.out.println("Original ArrayList: " + words);

        int left = 0;
        int right = words.size() - 1;

        while (left < right) {

            String temp = words.get(left);

            words.set(left, words.get(right));

            words.set(right, temp);

            left++;
            right--;
        }

        System.out.println("Reversed ArrayList: " + words);

        scanner.close();
    }

    public static void main(String[] args) {
        reverseArrayList();
    }
}
