/*
Pyramid pattern in Java

    *
   ***
  *****
 *******
*********

 */

package InterviewCodeQnA;

import java.util.Scanner;

public class QA_10_PyramidStarPattern {
    public void pyramidStarPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter odd value of n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
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
        QA_10_PyramidStarPattern psp = new QA_10_PyramidStarPattern();
        psp.pyramidStarPattern();
    }
}

