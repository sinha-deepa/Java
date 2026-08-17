/*
Left Triangle Star Pattern

*****
****
***
**
*

 */

package InterviewCodeQnA;

import java.util.Scanner;

public class QA_09_LeftTriangleStarPattern {
    public void leftTriangleStarPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of rows : ");
        int n = sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        QA_09_LeftTriangleStarPattern ltsp = new QA_09_LeftTriangleStarPattern();
        ltsp.leftTriangleStarPattern();
    }
}

