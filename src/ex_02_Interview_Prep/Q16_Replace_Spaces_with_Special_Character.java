/*
Logic:
Use built-in replace()
Replace " " with _ or any char
 */

package ex_02_Interview_Prep;

public class Q16_Replace_Spaces_with_Special_Character {
    public static void main(String[] args) {
    String str = "QA Engineer";

    str = str.replace(" ", "_");

        System.out.println(str);
}
}
