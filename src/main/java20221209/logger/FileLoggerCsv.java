package main.java20221209.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileLoggerCsv extends FileOutputter implements Logger {
    private String fileName;

    public FileLoggerCsv() {
        fileName = getDefaultFileName() + getFileExtension();; // дефолтное имя,конструктор без аргументов
    }

    public FileLoggerCsv(String fileName) {
        this.fileName = getDefaultFileName() + getFileExtension();
    }

    @Override
    public void log(String message) {
        try (Writer writer = new FileWriter(fileName, true)) {// заботиться чтоб закрыть все ресурсы,
            // если уберем тру, то будем перезаписывать
            writer.write(message);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    String getFileExtension() {
        return "csv";
    }
}