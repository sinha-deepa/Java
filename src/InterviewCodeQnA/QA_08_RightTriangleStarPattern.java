/*
Right Triangle Star Pattern

*
**
***
****
*****

 */

package InterviewCodeQnA;

import java.util.Scanner;

public class QA_08_RightTriangleStarPattern {
    public void rightTriangleStarPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        QA_08_RightTriangleStarPattern rtsp = new QA_08_RightTriangleStarPattern();
        rtsp.rightTriangleStarPattern();
    }
}
