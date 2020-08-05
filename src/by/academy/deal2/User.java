package by.academy.deal2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {
    private String name;
    private String dateOfBirth;
    private String phone;
    private String email;
    private Pattern p1 = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])/([0]?[0-9]|[1-9]|1[0-2])/\\d{4}$");
    private Pattern p2 = Pattern.compile("^([0]?[1-9]|[1-9]|[1|2][0-9]|[3][0|1])-([0]?[1-9]|[1-9]|1[0-2])-\\d{4}$");
    private Pattern belarusPhone = Pattern.compile("^\\+375+([2][459]|33|44)+[1-9]+\\d{6}$");
    private Pattern emailPattern = Pattern.compile("^[A-Z0-9a-z._%+-]+@[A-Za-z0-9\\.-]+\\.[A-Za-z]{2,64}$");

    public User() {
        super();
    }

    User(String name, String dateOfBirth, String phone, String email) {
        super();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public boolean checkPhoneNumber(String phone) {
        Matcher m = belarusPhone.matcher(phone);
        return m.find();
    }

    public boolean checkEmail(String email) {
        Matcher m = emailPattern.matcher(email);
        return m.find();
    }

    public boolean checkDateOfBirth(String str) {
        Matcher m1 = p1.matcher(str);
        if (m1.find()) {
            return true;
        }
        Matcher m2 = p2.matcher(str);
        if (m2.find()) {
            return true;
        }
        return false;
    }

    public void printInfoUser() {
        System.out.println(getName() + ", дата рождения: " + getDateOfBirth() + ", контактный телефон: "
                + getPhone() + ", email: " + getEmail());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}