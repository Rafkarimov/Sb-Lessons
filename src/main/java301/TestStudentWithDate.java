package main.java301;
/*
В программе TestStudentWithDate показано, что значение поля данных dateCreated возвращается с помощью метода
getDateCreated(). Оно является ссылкой на объект типа Date. С помощью этой ссылки можно изменить содержимое dateCreated.
 */
public class TestStudentWithDate {
    public static void main(String[] args) {
        Student student = new Student(111223333, "Иван");
        java.util.Date dateCreated = student.getDateCreated();
        dateCreated.setTime(200000); // Теперь значение поля dateCreated изменилось!
    }
}
