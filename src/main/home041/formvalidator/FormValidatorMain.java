package main.home041.formvalidator;

public class FormValidatorMain {
    public static void main(String[] args) {
        // name
        try {
            FormValidator.checkName("aaaaaaa");
            FormValidator.checkName("A");
            FormValidator.checkName("Aaaaaaasaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            FormValidator.checkName("Aa");
        } catch (FormValidatorCheckException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------");

        // birthDate
        try {
            FormValidator.checkBirthdate("09.01.1985");
            FormValidator.checkBirthdate("31.06.2021");
        } catch (FormValidatorCheckBirthdateCheckException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("------------------------------");

        // gender
        try {
            FormValidator.checkGender("MALE");
            FormValidator.checkGender("Male");
        } catch (FormValidatorCheckGenderCheckException e) {
            System.out.println(e.getMessage());
        }

        // height
        System.out.println("----------------------");
        try {
            FormValidator.checkHeight("178");
            FormValidator.checkHeight("-1");
        } catch (FormValidatorCheckHeightCheckException e) {
            System.out.println(e.getMessage());
        }
    }
}
