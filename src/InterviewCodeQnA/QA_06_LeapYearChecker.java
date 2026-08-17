/*
Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
Use an if-else statement to make this determination.
 */

package InterviewCodeQnA;

import java.util.Scanner;

public class QA_06_LeapYearChecker {
    public void leapYearChecker(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check if it's a leap year:");
        int year = scanner.nextInt();
        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public static void main(String[] args){
        QA_06_LeapYearChecker lyc = new QA_06_LeapYearChecker();
        lyc.leapYearChecker();
    }
}
