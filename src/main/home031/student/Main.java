package main.home031.student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //2.Student
        Student student1 = new Student("Мишка", "Косолапый");
        Student student2 = new Student("Мышка", "Нарушка");
        Student student3 = new Student("Зайка", "Попрыгайка");
        Student student4 = new Student("Серый", "Волк");
        Student student5 = new Student("Вини", "Пух");
//        Student student1 = new Student("Мишка", "Koso");
//        Student student2 = new Student("Мышка", "Naru");
//        Student student3 = new Student("Зайка", "Poprig");
//        Student student4 = new Student("Серый", "Vof");
//        Student student5 = new Student("Вини", "Puh");
        Student[] studentArray = new Student[]{student1, student2, student3, student4, student5};
//        student.setGrades(new int[]{3, 5, 3, 4, 5, 2, 3, 5, 4, 3}); вывод в консоль второго варианта решения
        System.out.println(Arrays.toString(student1.getGrades()));
        student1.addNewGrade(5);
        System.out.println(Arrays.toString(student1.getGrades()));
        System.out.println(student1.findAverage());

        StudentService studentService = new StudentService();
        Student bestStudent = studentService.bestStudent(studentArray);
//        System.out.println(bestStudent);
        studentService.sortBySurname(studentArray); // 1 dfhbfyn
        for (Student student : studentArray) {
            System.out.println(student);
        }
    }
}
