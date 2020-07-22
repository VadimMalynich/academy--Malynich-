package by.academy.classwork.oop.task8;

public abstract class Animal {
    private String food;
    private String location;

    public Animal() {
        super();
    }

    public Animal(String food, String location) {
        super();
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public void sleep() {
        System.out.println("Такое-то животное спит");
    }
}
