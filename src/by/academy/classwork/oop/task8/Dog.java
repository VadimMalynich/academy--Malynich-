package by.academy.classwork.oop.task8;

public class Dog extends Animal{
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        super();
        this.name = name;
        this.breed = breed;
    }

    public Dog(String food, String location, String name, String breed) {
        super(food, location);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Собачий корм");
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }
}
