package by.academy.classwork.oop.task2;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person();
        Person person2=new Person("Васильев Василий Васильевич", 20);
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}

