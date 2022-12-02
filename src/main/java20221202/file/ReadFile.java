package main.java20221202.file;
/*
Читаем данные из файла
В файле у нас будут дни недели текстом
В результате вывести название дня недели и его порядковый номер
Результат будет записываться в output.txt

 */

import main.java20221202.enams.WeekDays;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class ReadFile {
    //пусть где будем хранить файл
    private static final String PKG_DIR = "C:\\Users\\Professional\\IdeaProjects\\Sb-Lessons\\src\\main" +
            "\\java20221202\\file";

    private static final String OUTPUT_FILE_NAME = "output.txt";

    private ReadFile() {
    }

    ;

    public static void readAndWriteDataFromFile(String filePath) throws IOException { //throws IOException один
        // из способов
        Scanner scanner = new Scanner(new File(filePath));
        String[] days = new String[10];
        int i = 0;
        while (scanner.hasNextLine()) {
            days[i++] = scanner.nextLine(); // заполняем массив из файла
        }

        Writer wr = new FileWriter(PKG_DIR + "\\" + OUTPUT_FILE_NAME);// как записывать новый файл
        for (int j = 0; j < i; j++) {
            String res = "Порядковый номер дня недели" + days[j] + " = " + WeekDays.ofName(days[j]).dayNumber + "\n";
            wr.write(res);
        }
        wr.close();
        scanner.close();


        // необходимо ресурсы .write необходимо закрывать и отпустить, так как они сделали свою работу
//        try {
//            wr.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }


    }
}
