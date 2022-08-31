package by.academy.classwork.lesson18;

public class Address {
    private int doorNo;
    private String street;
    private String city;
    private String zip;

    public Address(int doorNo, String street, String city, String zip) {
        this.doorNo = doorNo;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public void printAddress() {
        System.out.println("City: " + city + "; street: " + street + "; door№: " + doorNo + "; zip: " + zip + ".");
    }
}
