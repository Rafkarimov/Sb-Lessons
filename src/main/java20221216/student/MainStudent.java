package main.java20221216.student;

public class MainStudent {
    public static void main(String[] args) {

        Student student = new Student("Иван", "Иванов", 532, 5);
        System.out.println(student.getScholarship());
        student.getAverageMark();
        System.out.println(student.getScholarship());

        Aspirant aspirant = new Aspirant("Иван", "Иванов", 532, 5);
        System.out.println(aspirant.getScholarship());
        aspirant.setAverageMark(4);
        System.out.println(aspirant.getScholarship());
    }
}
