package by.academy.classwork.lesson18;

public class Account extends Customer {
    private int accountNo;

    public Account(String name, Address address, int accountNo) {
        super(name, address);
        this.accountNo = accountNo;
    }
}
