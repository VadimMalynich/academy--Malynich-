package by.academy.classwork.oop.task7;

import by.academy.classwork.oop.task7.details.Engine;
import by.academy.classwork.oop.task7.professions.Driver;
import by.academy.classwork.oop.task7.vehicles.Car;
import by.academy.classwork.oop.task7.vehicles.Lorry;
import by.academy.classwork.oop.task7.vehicles.SportCar;

import java.lang.reflect.GenericDeclaration;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(250, 500);
        Driver driver1 = new Driver(26, "Иванов И. И.", 8);
        Driver driver2 = new Driver(39, "Пирожков А. Г.", 19);
        Driver driver3 = new Driver(50, "Кузин В. В.", 1);
        Car car = new Car("BMW", "A", 1500.6, driver1, engine);
        car.printInfo();
        Lorry lorry = new Lorry(15000, "Audi", "B", 2100.8, driver2, engine);
        lorry.printInfoLorry();
        SportCar sportCar = new SportCar((float) 400.5, "Mercedes", "S", 2504, driver3, engine);
        sportCar.printInfoSportCar();
        car.start();
        car.turnLeft();
        car.turnRight();
        car.stop();
    }
}
