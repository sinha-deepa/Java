package ex_02_Interview_Prep;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid_Email {
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
        Valid_Email ve = new Valid_Email();
        ve.valid_Email();
    }
}
