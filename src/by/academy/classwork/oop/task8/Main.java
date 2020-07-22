package by.academy.classwork.oop.task8;

public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[3];
        Dog dog = new Dog("Кость", "вольер", "Альфа", "Шпиц");
        animal[0] = dog;
        Cat cat = new Cat("Рыба", "дом", "Линда", "Сиамский");
        animal[1] = cat;
        Horse horse = new Horse("Картофель", "ангар", "Джек", "Арабская");
        animal[2] = horse;
        Veterinarian veterinarian = new Veterinarian();
        for (int i = 0; i < animal.length; i++) {
            veterinarian.treatAnimal(animal[i]);
        }
        dog.makeNoise();
        dog.sleep();
        dog.eat();
        cat.makeNoise();
        cat.eat();
        cat.sleep();
        horse.makeNoise();
        horse.eat();
        horse.sleep();
    }
}
