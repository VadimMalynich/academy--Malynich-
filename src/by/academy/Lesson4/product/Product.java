package by.academy.Lesson4.product;

public class Product {
    public String name;
    public int quantity;
    private double discount;
    protected double price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return this.discount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    private void calculationQuantity() {

    }
    /*private void returnString(){
        System.out.println(name);
    }

    protected double sumPrice(double price){
        price=this.price*discount;
        return this.price;
    }

    public double findCount(double sum){
        return this.count;
    } */

}
