/*Создать класс NewThread расширяющий Thread.
Переопределить метод run().
В цикле for вывести на консоль символ 100 раз.
Создать экземпляр класса и запустить новый поток.*/
package by.academy.classwork.lesson16.task1;

public class Main {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        newThread.run();
    }
}
