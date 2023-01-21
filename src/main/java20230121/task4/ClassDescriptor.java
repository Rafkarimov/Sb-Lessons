package main.java20230121.task4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ClassDescriptor {
    String author();
    String date();
    int currentVersion();
    String[] reviewers();
}

