package main.java302;

public class TestCourseNew {
    public static void main(String[] args) {
        CourseNew course1 = new CourseNew("������� �����������������");
        CourseNew course2 = new CourseNew("���������-��������������� ����������������");

        course1.addStudent("���� �������� �.");
        course1.addStudent("����� ��������� �.");
        course1.addStudent("���� ���������� �.");
        course1.addStudent("���� �������");
        course1.addStudent("������ �����");
        course1.addStudent("��������� ���������");
        course1.addStudent("S1");
        course1.addStudent("S2");
        course1.addStudent("S3");
        course1.addStudent("S4");
        course1.addStudent("S5");
        course1.addStudent("S6");
        course1.addStudent("S7");

        course2.addStudent("���� �������� �.");
        course2.addStudent("���� ��������� �.");

        System.out.println("���������� ��������� �� ����������\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        String[] students = course1.getStudents();
        for (int i = 0; i < students.length; i++)
            System.out.print(students[i] + ", ");

        System.out.println();
        System.out.println("���������� ��������� �� ����������\n"
                + course2.getCourseName() + ": " + course2.getNumberOfStudents());

        course1.dropStudent("S1");
        System.out.println("���������� ��������� �� ����������\n"
                + course1.getCourseName() + ": " + course1.getNumberOfStudents());
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++)
            System.out.print(students[i] + (i < course1.getNumberOfStudents() - 1 ? ", " : " "));

        course1.clear();
        System.out.println("\n���������� ��������� �� ����������\n"
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
     * ������� ���� ��������� � ����������
     */
    public void clear() {
        for (int i = 0; i < numberOfStudents; i++)
            students[i] = null;
        numberOfStudents = 0;
    }

    /**
     * ������� ���������� �������� � ����������
     */
    public void dropStudent(String student) {
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)) {
                // ���������� students[i + 1] � students[i], � �.�.
                for (int k = i + 1; k < numberOfStudents; k++) {
                    students[k - 1] = students[k];
                }

                numberOfStudents--;
                break;
            }
        }
    }
}
