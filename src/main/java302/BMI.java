package main.java302;

public class BMI {
    final int SMS_PER_METER = 100; // 1 ���� �������� 100 ��
    private String name;
    private int age;
    private double weight;
    private double height;

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    /** ������� BMI � ���������� ������, ���������, �����,
     * ������ � ������ � �����������
     */
    public BMI(String name, int age, double weight,
               double meters, double sms) {};

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }

    public double getBMI() {
        double bmi = weight / ((height / SMS_PER_METER * height / SMS_PER_METER));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "������������� ���";
        else if (bmi < 25)
            return "�����";
        else if (bmi < 30)
            return "���������� ���";
        else
            return "��������";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
