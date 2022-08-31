package by.academy.classwork.lesson18;

import java.util.Date;

public class CreditCard implements Payment {
    private String issuer;
    private Long cardNo;
    private Date expiryDate;

    public boolean authorise(double amount){
        return false;
    }

    @Override
    public boolean pay(Double price) {
        return true;
    }
}
