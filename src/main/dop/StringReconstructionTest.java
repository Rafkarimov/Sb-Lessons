package main.dop;

import java.io.*;

/**
 * StringReconstructionTest
 *
 * @author Eugene Matyushkin
 */
public class StringReconstructionTest {

    private static final String FILENAME = "C:\\Users\\User\\IdeaProjects\\Sb-Lessons\\src\\main" +
            "\\dop\\alphabet.utf8.txt";
    private static final String ENCODING_WIN1251 = "windows-1251";
    private static final String ENCODING_UTF8 = "UTF-8";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(FILENAME), ENCODING_WIN1251));     // 1.
        String incorrect = br.readLine();
        br.close();
        System.out.println("Incorrect string: " + incorrect);
        String restored = new String(incorrect.getBytes(ENCODING_WIN1251), ENCODING_UTF8); // 2.
        System.out.println("Restored string: " + restored);
        br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(FILENAME), ENCODING_UTF8));                       // 3.
        String correct = br.readLine();
        br.close();
        System.out.println("Correct string: " + correct);
    }
}
