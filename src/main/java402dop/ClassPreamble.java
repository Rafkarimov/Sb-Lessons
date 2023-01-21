package main.java402dop;

@interface ClassPreamble {
    String author();
    String date();
    int currentRevision() default 1;
    String lastModified() default "N/A";
    String lastModifiedBy() default "N/A";
    // Можно использовать массив
    String[] reviewers();
}
