package by.academy.Lesson5.shop;

public class Deal {
    private User buyer;
    private User seller;
    private Product[] product;

    public Deal() {
        super();
    }

    public Deal(User seller, User buyer, Product[] product) {
        super();
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public void setProduct(Product[] product) {
        this.product = product;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public Product[] getProduct() {
        return product;
    }

    public double sumDeal() {
        double sum = 0;
        System.out.println("Продавец: " + getSeller().getName());
        System.out.println("Покупатель: " + getBuyer().getName());
        for (Product pr : product) {
            sum += pr.getPrice();
        }
        return sum;
    }
}
