package by.academy.classwork.lesson15.task1;

public class Cat {
    private String breed;
    protected int age;
    public String name;

    public Cat() {
    }

    public Cat(String breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }

    private void printBreed() {
        System.out.println("Breed: " + breed);
    }

    protected void printAge() {
        System.out.println("Age: " + age);
    }

    public void printName() {
        System.out.println("Name: " + name);
    }

}
