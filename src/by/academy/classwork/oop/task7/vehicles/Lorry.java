package by.academy.classwork.oop.task7.vehicles;

import by.academy.classwork.oop.task7.details.Engine;
import by.academy.classwork.oop.task7.professions.Driver;

public class Lorry extends Car {
    private float capacity;

    public Lorry(float capacity) {
        super();
        this.capacity = capacity;
    }

    public Lorry(float capacity, String mark, String classAuto, double weight, Driver driver, Engine engine) {
        super(mark, classAuto, weight, driver, engine);
        this.capacity = capacity;
    }

    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }

    public float getCapacity() {
        return capacity;
    }

    public void printInfoLorry() {
        printInfo();
        System.out.println("Грузоподъемность кузова: " + capacity);
    }
}
