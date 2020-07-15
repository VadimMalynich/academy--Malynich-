package by.academy.classwork.oop.task2;

public class Person {
    private String fullName;
    private int age;

    public Person() {
        super();
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public int getAge() {
        return age;
    }

    public void move() {
        System.out.println(getFullName() + " шагает.");
    }

    public void talk() {
        System.out.println(getFullName() + " говорит.");
    }
}
