package main.java302;

public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("������ �������� �.", 18, 60, 178);
        System.out.println("BMI ��� " + bmi1.getName() + " ����� "
                + bmi1.getBMI() + " " + bmi1.getStatus());

        BMI bmi2 = new BMI("������ �������� �.", 100, 178);
        System.out.println("BMI ��� " + bmi2.getName() + " ����� "
                + bmi2.getBMI() + " " + bmi2.getStatus());

        BMI bmi3 = new BMI("������� �������� �.", 37, 88, 178, 25.0);
    }
}
