/* Table Print using System.out.printf
Print  lines of output; each line  (where ) contains the  of  in the form:
N x i = result.

Common Format Specifiers
| Specifier | Meaning        | Example           |
| --------- | -------------- | ----------------- |
| `%s`      | String         | "Deepa"           |
| `%d`      | Integer        | 100               |
| `%f`      | Decimal/Double | 99.99             |
| `%c`      | Character      | 'A'               |
| `%b`      | Boolean        | true              |
| `%n`      | New Line       | Same as println() |
 */

package InterviewCodeQnA;

import java.util.Scanner;

public class QA_02_PrintTable {

    public static void main(String[] args) {
        QA_02_PrintTable pt = new QA_02_PrintTable();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for printing of its table : ");
        int n = sc.nextInt();
        pt.printTable(n);
    }

    public void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d", n, i, n*i);
            System.out.println();
        }
    }
}
