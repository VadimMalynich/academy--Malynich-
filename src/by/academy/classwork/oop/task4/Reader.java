package by.academy.classwork.oop.task4;

public class Reader {
    private String fio;
    private int number;
    private String faculty;
    private String data;
    private long phoneNumber;

    public Reader() {
        super();
    }

    public Reader(String fio, int number, String faculty, String data, long phoneNumber) {
        this.fio = fio;
        this.number = number;
        this.faculty = faculty;
        this.data = data;
        this.phoneNumber = phoneNumber;
    }

    public String getFio() {
        return fio;
    }

    public int getNumber() {
        return number;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getData() {
        return data;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void takeBook(int book) {
        if (book == 1) {
            System.out.print(getFio() + " взял " + book + " книгу\n");
        } else if (book < 5) {
            System.out.print(getFio() + " взял " + book + " книги\n");
        } else {
            System.out.print(getFio() + " взял " + book + " книг\n");
        }
    }

    public void takeBook(String[] books) {
        System.out.print(getFio() + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            if (i == books.length - 1) {
                System.out.print(books[i] + ".\n");
            } else {
                System.out.print(books[i] + ", ");
            }
        }
    }

    public void takeBook(Book book[]) {
        System.out.print(getFio() + " взял книги: ");
        for (int i = 0; i < book.length; i++) {
            if (i == book.length - 1) {
                System.out.print(book[i].getName() + ".\n");
            } else {
                System.out.print(book[i].getName() + ", ");
            }
        }
    }

    public void returnBook(int book) {
        if (book == 1) {
            System.out.print(getFio() + " вернул " + book + " книгу.\n");
        } else if (book < 5) {
            System.out.print(getFio() + " вернул " + book + " книги.\n");
        } else {
            System.out.print(getFio() + " вернул " + book + " книг.\n");
        }
    }

    public void returnBook(String[] books) {
        System.out.print(getFio() + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            if (i == books.length - 1) {
                System.out.print(books[i] + ".\n");
            } else {
                System.out.print(books[i] + ", ");
            }
        }
    }

    public void returnBook(Book book[]) {
        System.out.print(getFio() + " вернул книги: ");
        for (int i = 0; i < book.length; i++) {
            if (i == book.length - 1) {
                System.out.print(book[i].getName() + ".\n");
            } else {
                System.out.print(book[i].getName() + ", ");
            }
        }
    }
}
