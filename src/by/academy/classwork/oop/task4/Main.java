package by.academy.classwork.oop.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        String fio, faculty, data;
        long phoneNumber;
        Scanner in = new Scanner(System.in);
        Reader reader[] = new Reader[3];
        Reader reader1 = new Reader("Иванов А. С.", number, "ФКП", "30.08.2000", 375296541250L);
        reader[0] = reader1;
        number++;
        reader1 = new Reader("Друзь В. Г.", number, "ФИТУ", "15.02.1998", 375296891550L);
        reader[1] = reader1;
        number++;
        reader1 = new Reader("Кузин В. В.", number, "ИЭФ", "14.04.2003", 375295692047L);
        reader[2] = reader1;
        Book book[] = new Book[3];
        Book book1 = new Book("Энциклопедия", "Полулех Г. А.");
        book[0] = book1;
        book1 = new Book("Гарри Поттер", "Беглов Р. И.");
        book[1] = book1;
        book1 = new Book("Словарь", "Тимошенко Т. В.");
        book[2] = book1;
       /* int numb = 5;
        String[] books=new String[numb];*/
        String books[] = {"Три товарища", "1984", "451° по Фаренгейту", "Убить пересмешника", "Идиот"};
        reader[0].takeBook(2);
        reader[1].takeBook(books);
        reader[2].takeBook(book);
        System.out.println();
        reader[2].returnBook(5);
        reader[1].returnBook(books);
        reader[0].returnBook(book);

        in.close();
    }

}
