package by.academy.deal2;

import java.util.*;

public class Deal {
    private User buyer;
    private User seller;
    private ArrayList<Product> product;
    private Date deadline;

    public Deal() {
        super();
        init();
    }

    public Deal(User seller, User buyer, ArrayList<Product> product) {
        super();
        this.buyer = buyer;
        this.seller = seller;
        this.product = product;
        init();
    }

    public void init() {
        Calendar c = new GregorianCalendar();
        c.add(Calendar.DAY_OF_MONTH, 10);
        this.deadline = c.getTime();
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    public User getBuyer() {
        return buyer;
    }

    public User getSeller() {
        return seller;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public double sumDeal() {
        double sum = 0;
        System.out.print("\nПродавец: ");
        getSeller().printInfoUser();
        System.out.print("Покупатель: ");
        getBuyer().printInfoUser();
        for (Product pr : product) {
            sum += pr.getPrice();
        }
        System.out.print("\nОбщая сумма товаров: ");
        return sum;
    }

    public double sumQuantity(int quantity, int k) {
        double sum = 0;
        int count = 0;
        for (Product pr : product) {
            if (k - 1 == count) {
                sum = pr.getDiscount() * quantity;
                System.out.print("Цена за товар \"" + pr.getName() + "\", количеством " + quantity + ": ");
                break;
            }
            count++;
        }
        return sum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Deal{");
        sb.append("buyer=").append(buyer);
        sb.append(", seller=").append(seller);
        sb.append(", product=").append(product);
        sb.append(", deadline=").append(deadline);
        sb.append('}');
        return sb.toString();
    }
}