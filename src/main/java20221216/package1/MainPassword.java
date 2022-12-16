package main.java20221216.package1;

public class MainPassword {
    public static void main(String[] args) {
        Password password = new Password("privet");
        System.out.println(password.getPassword());
//        password.hashPassword(); не работает
        System.out.println(password.getPasswordLength());
        System.out.println(password.isPassword());
    }
}
