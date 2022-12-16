package main.java20221216.package2;

import main.java20221216.package1.Password;

public class PasswordChild extends Password {
    public PasswordChild(String password) {
        super(password);
        System.out.println(super.getPasswordLength());
    }


}
