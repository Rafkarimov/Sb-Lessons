package main.java20221209.logger;

public abstract class FileOutputter {
    private final String defaultFileName = "default";

    public String getDefaultFileName() {
        return defaultFileName;
    }

    abstract String getFileExtension();
}
