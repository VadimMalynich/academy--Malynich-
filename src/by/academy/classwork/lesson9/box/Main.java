package by.academy.classwork.lesson9.box;

import by.academy.classwork.oop.task7.vehicles.Car;
import by.academy.classwork.oop.task8.Dog;

public class Main {
    public static void main(String[] args) {
        Box<Dog> dog = new Box<Dog>();
        dog.setItem(new Dog("Jack", "German Shepherd"));
        dog.getItem().dogInfo();
        System.out.println();

        Box<Car> car = new Box<Car>();
        car.setItem(new Car("BMW", "A", 1500.6));
        car.getItem().printInfoCar();
    }
}
