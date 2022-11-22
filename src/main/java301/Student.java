package main.java301;
/*
Student нет setter-методов и все его поля данных имеют модификатор доступа private, но при этом он не является
неизменяемым классом:
 */
public class Student {
    private int id;
    private String name;
    private java.util.Date dateCreated;

    public Student(int ssn, String newName) {
        id = ssn;
        name = newName;
        dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }
}
