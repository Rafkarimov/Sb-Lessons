package main.java302;
/*
Объект типа Course можно создать с помощью конструктора Course(String courseName), передав ему название дисциплины.
Можно добавить на дисциплину студента с помощью метода addStudent(String student), удалить с дисциплины студента
с помощью метода dropStudent(String student) и получить всех обучающихся по дисциплине студентов с помощью метода
getStudents(). Предположим, что класс Course уже определен. Программа TestCourse создает две дисциплины и добавляет
на них студентов.
 */
public class Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        // Это место оставлено для выполнения задания
    }
}
