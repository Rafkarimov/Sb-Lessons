package main.java20221216.package1;

public class Password {
    private final String SALT = "sipersecret";
    private String password;

    public Password(String password) {
        this.password = password;
        this.password = hashPassword();
    }

    private String hashPassword() {
        return SALT + password;
    }

    public String getPassword() {
        return password;
    }

    protected int getPasswordLength() {
        return password.length();
    }

    boolean isPassword() {
        return true;
    }
}
