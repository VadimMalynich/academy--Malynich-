package by.academy.homework.homework2.validation;

public class Main {
    public static void main(String[] args) {
        Validator belPhone = new BelarusPhoneValidator();
        Validator americanPhone = new AmericanPhoneValidator();
        Validator emailValidator = new EmailValidator();

        System.out.println(emailValidator.validate("academy@academy.by"));
        System.out.println(belPhone.validate("+375331234567"));
        System.out.println(americanPhone.validate("+12004000000"));
    }
}