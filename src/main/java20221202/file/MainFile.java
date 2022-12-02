package main.java20221202.file;

import java.io.IOException;

public class MainFile {
    public static void main(String[] args) throws IOException {
        //ReadFile
        String fileLocation = "C:\\Users\\Professional\\IdeaProjects\\Sb-Lessons\\src\\main\\java20221202\\file\\input.txt";
        ReadFile.readAndWriteDataFromFile(fileLocation);
    }
}
