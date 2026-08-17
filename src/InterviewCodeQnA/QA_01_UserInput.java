//How to Take string and number Input from Users

package InterviewCodeQnA;

import java.util.Scanner;

public class QA_01_UserInput {
    public static void main(String[] args){
        QA_01_UserInput UI = new QA_01_UserInput();
        UI.takeUserInput();
    }

    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input data: ");
        String str = sc.nextLine();
        System.out.println("My name is "+str);
        int n = sc.nextInt();
        System.out.println("My age is "+n);
    }
}


