package main.java302;

public class TestCourseNew {
    public static void main(String[] args) {
        CourseNew course1 = new CourseNew("«Основы программирования»");
        CourseNew course2 = new CourseNew("«Объектно-ориентированное программирование»");

        course1.addStudent("Петр Иванович Н.");
        course1.addStudent("Борис Сергеевич П.");
        course1.addStudent("Анна Дмитриевна К.");
        course1.addStudent("Юрий Гагарин");
        course1.addStudent("Герман Титов");
        course1.addStudent("Валентина Терешкова");
        course1.addStudent("S1");
        course1.addStudent("S2");
        course1.addStudent("S3");
        course1.addStudent("S4");
        course1.addStudent("S5");
        course1.addStudent("S6");
        course1.addStudent("S7");

        course2.addStudent("Петр Иванович Н.");
        course2.addStudent("Анна Сергеевна Д.");

        System.out.println("Количество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < students.length; i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.println("Количество студентов по дисциплине\n"
                + course2.getCourseName() + ": " + course2.getNumberOfStudents());

        course1.dropStudent("S1");
        System.out.println("Количество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));

        course1.clear();
        System.out.println("\nКоличество студентов по дисциплине\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
    }
}

class CourseNew {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public CourseNew(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length) {
            increaseSize();
        }

        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    private void increaseSize() {
        String[] temp = new String[students.length * 2 + 1];
        System.arraycopy(students, 0, temp, 0, students.length);
        students = temp;
    }

    public String[] getStudents() {
        String[] result = new String[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++)
            result[i] = students[i];
        return result;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    /**
     * Удаляет всех студентов с дисциплины
     */
    public void clear() {
        for (int i = 0; i < numberOfStudents; i++)
            students[i] = null;
        numberOfStudents = 0;
    }

    /**
     * Удаляет указанного студента с дисциплины
     */
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                // Перемещает students[i + 1] в students[i], и т.д.
                for (int k = i + 1; k < numberOfStudents; k++) {
                    students[k - 1] = students[k];
                }

                numberOfStudents--;
                break;
            }
        }
    }
}
