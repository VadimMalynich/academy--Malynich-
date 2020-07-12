/* Необходимо реализовать программу, которая будет позволять вводить сделки
 * купли-продажи товаров между двумя участниками. В каждой сделке может быть
 * несколько товаров, сумма сделки рассчитывается из суммы всех товаров. Сумма
 * каждого товара рассчитывается из его стоимости и количества. Программа должна
 * позволить ввести информацию о сделках, сохранить ее в памяти и вывести на
 * экран. Ввод информацию осуществляется с экрана (консоли). Количество
 * дополнительной информацию о сделке, участнике, товаре придумать самому
 * (больше одного поля для класса).*/
package by.academy.Lesson5.shop;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException{
        Scanner scanner = new Scanner(System.in);
        User seller = new User("Vasya");
        User buyer = new User("Sasha");
        int n;
        do {
            System.out.print("Введите количество продуктов: ");
            n = scanner.nextInt();
        } while (n <= 0);
        Product product[] = new Product[n];
        String name;
        double price;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите название продукта: ");
            name = scanner.next();
            System.out.print("Введите цену продукта: ");
            price = scanner.nextDouble();
            Product product1 = new Product(price, name);
            product[i]=product1;
        }
        Deal deal = new Deal(seller, buyer, product);
        /*for(Product pr:product){
            System.out.println(pr.getName());
            System.out.println(pr.getPrice());
        }*/
        System.out.println(deal.sumDeal());
    }
}
