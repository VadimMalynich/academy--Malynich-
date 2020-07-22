package by.academy.classwork.oop.task7.vehicles;

import by.academy.classwork.oop.task7.details.Engine;
import by.academy.classwork.oop.task7.professions.Driver;

public class Car {
    private String mark;
    private String classAuto;
    private double weight;
    Driver driver;
    Engine engine;

    public Car() {
        super();
    }

    public Car(String mark, String classAuto, double weight, Driver driver, Engine engine) {
        this.mark = mark;
        this.classAuto = classAuto;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getMark() {
        return mark;
    }

    public String getClassAuto() {
        return classAuto;
    }

    public double getWeight() {
        return weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void printInfo() {
        System.out.println("Информаци об автомобиле: марка " + getMark() + ", класс " + getClassAuto()
                + ", вес " + getWeight() + ";");
        System.out.println("Водитель: " + getDriver().getFio() + ", возраст " + getDriver().getAge()
                + ", стаж " + getDriver().getExperience() + ";");
        System.out.println("Мотор: мощность " + getEngine().getPower() + ", производитель "
                + getEngine().getManufacturer());
    }
}
