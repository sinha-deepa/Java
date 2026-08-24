/*
A leap year must either be divisible by 400, or it must be divisible by 4 but not by 100.
I therefore use an OR between those two conditions, with an AND inside the second condition.
 */

package ex_01_Loops;

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year to check if it's a leap year:");
        int year = scanner.nextInt();

        boolean isLeapYear =
                (year % 400 == 0) ||
                        (year % 4 == 0 && year % 100 != 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
