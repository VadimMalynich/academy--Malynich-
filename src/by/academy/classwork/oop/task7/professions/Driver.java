package by.academy.classwork.oop.task7.professions;

public class Driver extends Person {
    private String fio;
    private int experience;

    public Driver(int age, String fio, int experience) {
        super(age);
        this.fio = fio;
        this.experience = experience;
    }

    public String getFio() {
        return fio;
    }

    public int getExperience() {
        return experience;
    }
}
