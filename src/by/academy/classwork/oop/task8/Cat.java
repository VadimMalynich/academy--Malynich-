package by.academy.classwork.oop.task8;

public class Cat extends Animal {
    private String name;
    private String breed;

    public Cat(String name, String breed) {
        super();
        this.name = name;
        this.breed = breed;
    }

    public Cat(String food, String location, String name, String breed) {
        super(food, location);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Кошачий корм");
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }
}
