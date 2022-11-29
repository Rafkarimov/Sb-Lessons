package main.home031.student;

import java.util.Arrays;

/*
3.	Необходимо реализовать класс StudentService.
У класса должны быть реализованы следующие публичные методы:
●	bestStudent() — принимает массив студентов (класс Student из предыдущего задания), возвращает лучшего студента
(т.е. который имеет самый высокий средний балл). Если таких несколько — вывести любого.
●	sortBySurname() — принимает массив студентов (класс Student из предыдущего задания) и сортирует его по фамилии.

 */
public class StudentService {
    public Student bestStudent(Student[] students) {
        double maxAverage = 1;
        Student student = null;
        for (Student value : students) {
            double temp = value.findAverage();
            if (temp > maxAverage) {
                maxAverage = temp;
                student = value;
            }
        }
        return student;
//        return Arrays.stream(students)
//                .max(Comparator.comparing(Student::findAverage))
//                .get(); через стрим
    }

    public void sortBySurname(Student[] students) {
        //1 способ
//        Collator collator = Collator.getInstance(Locale.getDefault());
//        System.out.println(Locale.getDefault());
//        collator.setStrength(Collator.PRIMARY); // для русских букв


//        Arrays.sort(students, Comparator.comparing(Student::getSurname)); // 2 способ

        Arrays.sort(students); // 3 способ


//        for (int i = 0; i < students.length - 1; i++) {
////            if (students[i].getSurname().compareTo(students[i + 1].getSurname()) > 0) {
//            if (collator.compare(students[i+1].getSurname(), students[i].getSurname()) > 0) {
//                Student temp = students[i];
//                students[i] = students[i + 1];
//                students[i + 1] = temp;
//            }
//        }
    }
}
