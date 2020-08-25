package by.academy.deal2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> product = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int flag;
        String name;
        User seller = enterData("продавца", scanner);
        User buyer = enterData("покупателя", scanner);
        int n;
        do {
            System.out.print("Введите количество продуктов: ");
            n = scanner.nextInt();
        } while (n < 0);
        double price, discount;
        IceCream iceCream = new IceCream();
        Biscuits biscuits = new Biscuits();
        Chips chips = new Chips();
        for (int i = 0; i < n + 3; i++) {
            if (i <= n - 1) {
                System.out.print("Введите название продукта: ");
                name = scanner.next();
                System.out.print("Введите цену продукта: ");
                price = scanner.nextDouble();
                Product prod = new Product(price, name, 7);
                product.add(prod);
            } else if (i == n) {
                System.out.print("Введите название фирмы мороженого: ");
                name = "Мороженное " + scanner.next();
                System.out.print("Введите цену этого мороженого: ");
                price = scanner.nextDouble();
                iceCream = new IceCream(price, name);
                product.add(iceCream);
            } else if (i == n + 1) {
                System.out.print("Введите название фирмы печенья: ");
                name = "Печенье " + scanner.next();
                price = (double) (1 + Math.random() * 5);
                biscuits = new Biscuits(price, name);
                product.add(biscuits);
            } else {
                System.out.print("Введите название фирмы чипсов: ");
                name = "Чипсы " + scanner.next();
                price = (double) (0 + Math.random() * 5);
                discount = (double) (0 + Math.random() * 100);
                chips = new Chips(price, name, discount);
                product.add(chips);
            }
        }
        Deal deal = null;
        if (n >= 0) {
            System.out.print("1. Добавить продукт\n2. Удалить продукт\nВаш выбор: ");
            do {
                flag = scanner.nextInt();
            } while (flag < 1 || flag > 2);
            if (flag == 1) {
                System.out.print("Введите название продукта: ");
                name = scanner.next();
                System.out.print("Введите цену продукта: ");
                price = scanner.nextDouble();
                Product product1 = new Product(price, name, 7);
                product.add(n, product1);
                deal = new Deal(seller, buyer, product);
                setQuantity(product, deal, iceCream, biscuits, scanner);
            } else if (n == 0) {
                System.out.println("Класс Product не содержит данных доступных для удаления!");
                deal = new Deal(seller, buyer, product);
                setQuantity(product, deal, iceCream, biscuits, scanner);
            } else {
                System.out.print("Введите название продукта который хотите удалить: ");
                String tempName;
                scanner.skip("\n");
                tempName = scanner.nextLine();
                int tempNumb = 0;
                for (Product pr : product) {
                    if (tempName.equals(pr.getName())) {
                        break;
                    }
                    tempNumb++;
                }
                if (tempNumb == n) {
                    System.out.println("Такого продукта не было добавлено!");
                    deal = new Deal(seller, buyer, product);
                    setQuantity(product, deal, iceCream, biscuits, scanner);
                } else {
                    product.remove(tempNumb);
                    deal = new Deal(seller, buyer, product);
                    setQuantity(product, deal, iceCream, biscuits, scanner);
                }
            }
        }
    }


    public static void setQuantity(ArrayList<Product> product, Deal deal, IceCream iceCream, Biscuits
            biscuits, Scanner scanner) {
        int k = 0, quantity = 0, count = 0;
        for (Product pr : product) {
            System.out.println(++k + ". " + pr.getName());
        }
        System.out.print("Выберете номер товара который хотите купить: ");
        k = scanner.nextInt();
        for (Product pr : product) {
            if (k - 1 == count) {
                System.out.print("Введите количество продукта \"" + pr.getName() + "\", которое хотите приобрести: ");
                quantity = scanner.nextInt();
                break;
            }
            count++;
        }
        System.out.println(deal.sumDeal());
        if (k - 1 == product.size() - 3) {
            System.out.println(iceCream.getDiscount(quantity));
        } else if (k - 1 == product.size() - 2) {
            System.out.println(biscuits.getDiscount(quantity));
        } else {
            System.out.println(deal.sumQuantity(quantity, k));
        }
        System.out.println(deal.getDeadline());
    }

    public static User enterData(String str, Scanner scanner) {
        User userMethods = new User();
        String name, dateOfBirth = "", phone = "", email = "";
        System.out.print("Введите имя " + str + ": ");
        name = scanner.nextLine();
        while (!userMethods.checkDateOfBirth(dateOfBirth)) {
            System.out.print("Введите дату рождения " + str + " формата дд/мм/гггг или дд-мм-гггг: ");
            dateOfBirth = scanner.nextLine();
        }
        while (!userMethods.checkPhoneNumber(phone)) {
            System.out.print("Введите белорусский номер " + str + " : ");
            phone = scanner.nextLine();
        }
        while (!userMethods.checkEmail(email)) {
            System.out.print("Введите email " + str + " : ");
            email = scanner.nextLine();
        }

        User user = new User(name, dateOfBirth, phone, email);
        return user;
    }
}
