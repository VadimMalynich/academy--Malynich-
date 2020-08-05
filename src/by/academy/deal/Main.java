/* Необходимо реализовать программу, которая будет позволять вводить сделки
 * купли-продажи товаров между двумя участниками. В каждой сделке может быть
 * несколько товаров, сумма сделки рассчитывается из суммы всех товаров. Сумма
 * каждого товара рассчитывается из его стоимости и количества. Программа должна
 * позволить ввести информацию о сделках, сохранить ее в памяти и вывести на
 * экран. Ввод информацию осуществляется с экрана (консоли). Количество
 * дополнительной информацию о сделке, участнике, товаре придумать самому
 * (больше одного поля для класса).*/
/*Добавить 3 типа продукта, наследоваться от Product,
 реализовать метод подсчета цены для каждого продукта.
 Добавить расчет цены со скидкой. (В каждом продукте своя скидка).*/
package by.academy.deal;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
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
        Product product[] = new Product[n + 3];
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
                Product product1 = new Product(price, name, 7);
                product[i] = product1;
            } else if (i == n) {
                System.out.print("Введите название фирмы мороженого: ");
                name = "Мороженное " + scanner.next();
                System.out.print("Введите цену этого мороженого: ");
                price = scanner.nextDouble();
                iceCream = new IceCream(price, name);
                product[i] = iceCream;
            } else if (i == n + 1) {
                System.out.print("Введите название фирмы печенья: ");
                name = "Печенье " + scanner.next();
                price = (double) (1 + Math.random() * 5);
                biscuits = new Biscuits(price, name);
                product[i] = biscuits;
            } else {
                System.out.print("Введите название фирмы чипсов: ");
                name = "Чипсы " + scanner.next();
                price = (double) (0 + Math.random() * 5);
                discount = (double) (0 + Math.random() * 100);
                chips = new Chips(price, name, discount);
                product[i] = chips;
            }
        }
        Deal deal = null;
        if (n >= 0) {
            System.out.print("1. Добавить продукт\n2. Удалить продукт\nВаш выбор: ");
            do {
                flag = scanner.nextInt();
            } while (flag < 1 || flag > 2);
            if (flag == 1) {
                Product temp[] = new Product[n + 4];
                for (int i = 0; i < n; i++) {
                    temp[i] = product[i];
                }
                System.out.print("Введите название продукта: ");
                name = scanner.next();
                System.out.print("Введите цену продукта: ");
                price = scanner.nextDouble();
                Product product1 = new Product(price, name, 7);
                temp[n] = product1;
                for (int i = n + 1; i < n + 4; i++) {
                    temp[i] = product[i - 1];
                }
                deal = new Deal(seller, buyer, temp);
                setQuantity(temp, deal, iceCream, biscuits, scanner);
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
                for (tempNumb = 0; tempNumb < n; tempNumb++) {
                    if (tempName.equals(product[tempNumb].getName())) {
                        break;
                    }
                }
                if (tempNumb == n) {
                    System.out.println("Такого продукта не было добавлено!");
                    deal = new Deal(seller, buyer, product);
                    setQuantity(product, deal, iceCream, biscuits, scanner);
                } else {
                    Product temp[] = new Product[n + 2];
                    for (int i = 0; i < tempNumb; i++) {
                        temp[i] = product[i];
                    }
                    for (int i = tempNumb; i < n + 2; i++) {
                        temp[i] = product[i + 1];
                    }
                    deal = new Deal(seller, buyer, temp);
                    setQuantity(temp, deal, iceCream, biscuits, scanner);
                }
            }
        }
        scanner.close();
    }

    public static void setQuantity(Product product[], Deal deal, IceCream iceCream, Biscuits biscuits, Scanner scanner) {
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
        if (k - 1 == product.length - 3) {
            System.out.println(iceCream.getDiscount(quantity));
        } else if (k - 1 == product.length - 2) {
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