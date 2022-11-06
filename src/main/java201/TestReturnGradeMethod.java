package main.java201;
/*
Чтобы увидеть различия между методом типа void и возвращающим значение методом, доработаем метод printGrade() таким
образом, чтобы он возвращал значение. Новый метод, который мы назовем getGrade(), возвращает оценку, как показано
в программе TestReturnGradeMethod.
 */
public class TestReturnGradeMethod {
    public static void main(String[] args) {
        System.out.print("Оценка равна " + getGrade(78.5));
        System.out.print("\nОценка равна " + getGrade(59.5));
    }

    public static char getGrade(double score) {
        if (score >= 90.0)
            return 'A';
        else if (score >= 80.0)
            return 'B';
        else if (score >= 70.0)
            return 'C';
        else if (score >= 60.0)
            return 'D';
        else
            return 'F';
    }
}
