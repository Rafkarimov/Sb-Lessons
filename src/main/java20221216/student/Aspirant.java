package main.java20221216.student;

public class Aspirant extends Student {

    public Aspirant(String firstName, String lastName, int group, int averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    @Override
    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        }
        return 100;
    }
}
