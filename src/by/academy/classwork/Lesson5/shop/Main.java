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
package by.academy.classwork.Lesson5.shop;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        User seller = new User("George");
        String name;
        User buyer = new User("Jack");
        int n;
        do {
            System.out.print("Введите количество продуктов: ");
            n = scanner.nextInt();
        } while (n < 0);
        Product product[] = new Product[n + 3];
        double price, discount;
        for (int i = 0; i < n + 3; i++) {
            if (i <= n - 1) {
                System.out.print("Введите название продукта: ");
                name = scanner.next();
                System.out.print("Введите цену продукта: ");
                price = scanner.nextDouble();
                Product product1 = new Product(price, name);
                product[i] = product1;
            } else if (i == n) {
                System.out.print("Введите название фирмы мороженого: ");
                name = scanner.next();
                System.out.print("Введите цену этого мороженого: ");
                price = scanner.nextDouble();
                System.out.print("Введите скидку на это мороженое: ");
                discount = scanner.nextDouble();
                IceCream iceCream = new IceCream(price, name);
                iceCream.setDiscount(discount);
                product[i] = iceCream;
            } else if (i == n + 1) {
                System.out.print("Введите название фирмы печенья: ");
                name = scanner.next();
                price = (double) (1 + Math.random() * 5);
                System.out.print("Введите скидку на это печенье: ");
                discount = scanner.nextDouble();
                Biscuits biscuits = new Biscuits(price, name, discount);
                product[i] = biscuits;
            }
            else {
                System.out.print("Введите название фирмы чипсов: ");
                name = scanner.next();
                price = (double) (0 + Math.random() * 5);
                discount = (double) (0 + Math.random() * 100);
                Chips chips = new Chips(price, name, discount);
                product[i] = chips;
            }
        }
        Deal deal = new Deal(seller, buyer, product);
        int k = 0, quantity = 0, count = 0;
        for (Product pr : product) {
            System.out.println(++k + ". " + pr.getName());
            //System.out.println(pr.getPrice());
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
        System.out.println(deal.sumQuantity(quantity, k));

    }
}
