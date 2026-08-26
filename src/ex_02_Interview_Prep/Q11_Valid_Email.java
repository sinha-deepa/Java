/*
Test for Invalid Emails

"plainaddress" - Missing @ and domain
"@invalid.com" - Missing username
"joe@[123.123.123.123]" - Square brackets around IP address
" näme@example.com" - Contains illegal character
"john..doe@example.com" - Double dot
"john@doe@example.com" - Double @
"john@example@com" - Missing top level domain (.com)
"john@example.c" - Top level domain too short
"john@example.com1" - Top level domain cannot have numbers
"<john@example..com>" - Double dot in domain name
"john@example.com." - Trailing dot in domain name
"<john@example..com>." - Double dots and trailing dot
"john@example.com.." - Double dot before top level domain
 */

/*
 * Email Regex Explanation:
 *
 * ^                         -> Start of the string
 * [a-zA-Z0-9_+&*-]+         -> Username: allows letters, numbers, _, +, &, *, -
 * (?:\.[a-zA-Z0-9_+&*-]+)* -> Optional additional username parts separated by '.'
 * @                         -> Mandatory @ symbol
 * (?:[a-zA-Z0-9-]+\.)+     -> Domain name followed by '.', one or more times
 * [a-zA-Z]{2,}              -> Domain extension/TLD: letters only, minimum 2 characters, no maximum
 * $                         -> End of the string
 *
 * Regex quantifiers:
 * +   -> 1 or more
 * *   -> 0 or more
 * ?   -> 0 or 1
 * {2,} -> Minimum 2 characters, no maximum
 *
 * (?:...) -> Non-capturing group; groups regex elements without storing the match.
 *
 * Note:
 * In Java, "\\." is used to match a literal "." because "\\" escapes the
 * backslash in the Java String, resulting in "\." being passed to the regex engine.
 *
 * Example valid emails:
 * john@example.com
 * john.kumar@example.co.in
 * john+test@mycompany.technology
 */

/*
 * Pattern & Matcher:
 *
 * Pattern.compile(emailRegex)
 * -> Compiles the regex String into a Pattern object.
 * -> Pattern represents the compiled regular expression/rule.
 *
 * pat.matcher(email)
 * -> Creates a Matcher object for the given email.
 * -> Matcher applies the compiled Pattern to the input email.
 *
 * mat.matches()
 * -> Checks whether the ENTIRE email matches the regex.
 * -> Returns true if the complete email follows the regex; otherwise false.
 *
 * Flow:
 * Regex String → Pattern.compile() → Pattern
 * Pattern + Email → matcher() → Matcher
 * Matcher → matches() → true / false
 */


package ex_02_Interview_Prep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q11_Valid_Email {
    public void valid_Email(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email to validate : ");
        String email = sc.nextLine();

        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@"+
                "(?:[a-zA-Z0-9-]+\\.)+[a-z"+
                "A-Z]{2,}$";
        if (email == null || email.isEmpty()) {
            System.out.println("Invalid email: Email is null or empty");
            return;
        }
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(email);
        if(mat.matches()){
            System.out.println("Email is valid.");
        }else
            System.out.println("Email is invalid");
    }

    public static void main(String[] args){
        Q11_Valid_Email ve = new Q11_Valid_Email();
        ve.valid_Email();
    }
}
