/*
Write a program to read a File and Extract Words.

Write a Java program that:

1. Accepts the path of a .txt file.
2. Reads the file line by line until the end of the file.
3. Extracts individual words/tokens from each line.
4. Treat the following characters as separators between words:
    Space, comma (,), period (.), semicolon (;), exclamation mark (!), question mark (?)
5. Print each extracted word/token on a separate line.
6. Handle the situation where the file cannot be read or does not exist without crashing the program.
7. Make sure the file is properly closed after processing, even if an error occurs.
8. Create a separate method responsible for extracting and printing the tokens from a single line.

Example input file:

Hello, my name is John.

Expected output:

Hello
my
name
is
John

 */

package ex_02_Interview_Prep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q06_File_Read_And_Tokenize {

    private static void tokenizeLine(String line) {
        StringTokenizer tokenizer = new StringTokenizer(line, " ,.;!?");

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }

    public static void main(String[] args) {
        String filePath = "/Users/deepakumari/Downloads/Learn/Java_Batch/Java_Programs/Java/Data/Test_data.txt";

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                tokenizeLine(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null)
                    reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}

