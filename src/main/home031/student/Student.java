package main.home031.student;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

/*
2.	Необходимо реализовать класс Student.
У класса должны быть следующие приватные поля:
●	String name — имя студента
●	String surname — фамилия студента
●	int[] grades — последние 10 оценок студента. Их может быть меньше, но не может быть больше 10.
И следующие публичные методы:
●	геттер/сеттер для name
●	геттер/сеттер для surname
●	геттер/сеттер для grades
●	метод, добавляющий новую оценку в grades. Самая первая оценка должна быть удалена, новая должна сохраниться
в конце массива (т.е. массив должен сдвинуться на 1 влево).
●	метод, возвращающий средний балл студента (рассчитывается как среднее арифметическое от всех оценок в массиве
grades)

 */
public class Student implements Comparable<Student> {
    private final Random random = new SecureRandom();
    private String name;
    private String surname;
    private int[] grades; // = new int[10]; второй вариант

    public Student(String name, String surname) { // первый вариант
        this.name = name;
        this.surname = surname;
        grades = new int[10];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = random.nextInt(5) + 1; // чтобы создать случайную оценку от 1 до 5
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void addNewGrade(int newGrade) {
        for (int i = 1; i < grades.length; i++) {
            grades[i - 1] = grades[i];
        }
        grades[grades.length - 1] = newGrade;
    }

    public double findAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.getSurname().compareTo(other.getSurname());
    }
}
