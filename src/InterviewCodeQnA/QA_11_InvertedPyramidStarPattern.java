package InterviewCodeQnA;

import java.util.Scanner;

public class QA_11_InvertedPyramidStarPattern {
    public void invertedPyramidStarPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    public static void main(String[] args){
        QA_11_InvertedPyramidStarPattern ipsp = new QA_11_InvertedPyramidStarPattern();
        ipsp.invertedPyramidStarPattern();
    }
}


