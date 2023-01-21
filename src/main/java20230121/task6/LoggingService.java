package main.java20230121.task6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.time.LocalDateTime;


public class LoggingService {
    public static void log(Object o, String methodName) {
        Class<?> clazz = o.getClass();
        for (Method m : clazz.getDeclaredMethods()) {
            if (m.getName().equals(methodName)) {
                ToBeLogged a = m.getAnnotation(ToBeLogged.class);
                switch (a.logLevel()) {
                    case INFO:
                        writeToDebugLog("[INFO] Logging method " + m.getName() + " at time: " + LocalDateTime.now());
                        break;
                    case DEBUG:
                        writeToDebugLog("[DEBUG] Logging method " + m.getName() + " at time: " + LocalDateTime.now());
                        break;
                    case ERROR:
                        writeToErrorLog("[ERROR] Logging method " + m.getName() + " at time: " + LocalDateTime.now());
                }
                return;
            }
        }
    }

    public static void writeToDebugLog(String s) {
        try (OutputStream o = new FileOutputStream("debug.log", true)) {
            s = s + "\n";
            o.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToErrorLog(String s) {
        try (OutputStream o = new FileOutputStream("error.log",true)) {
            s = s + "\n";
            o.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


