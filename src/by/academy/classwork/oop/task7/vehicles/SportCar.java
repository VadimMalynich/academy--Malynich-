package by.academy.classwork.oop.task7.vehicles;

import by.academy.classwork.oop.task7.details.Engine;
import by.academy.classwork.oop.task7.professions.Driver;

public class SportCar extends Car {
    private float speed;

    public SportCar(float speed) {
        super();
        this.speed = speed;
    }

    public SportCar(float speed, String mark, String classAuto, double weight, Driver driver, Engine engine) {
        super(mark, classAuto, weight, driver, engine);
        this.speed = speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getSpeed() {
        return speed;
    }

    public void printInfoSportCar() {
        printInfo();
        System.out.println("Предельная скорость: " + speed);
    }
}
