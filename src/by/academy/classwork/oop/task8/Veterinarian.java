package by.academy.classwork.oop.task8;

public class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println("Еда животного: " + animal.getFood() + ". Расположение животного: " + animal.getLocation());
    }
}
