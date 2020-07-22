package by.academy.classwork.oop.task8;

public class Horse extends Animal {
    private String name;
    private String breed;

    public Horse(String name, String breed) {
        super();
        this.name = name;
        this.breed = breed;
    }

    public Horse(String food, String location, String name, String breed) {
        super(food, location);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Морковь");
    }

    @Override
    public void makeNoise() {
        System.out.println("Фрр");
    }
}
