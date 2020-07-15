package by.academy.classwork.oop.task1;

public class Phone {
    private long number;
    private String model;
    private double weight;

    public Phone() {
        super();
    }

    public Phone(long number, String model) {
        super();
        this.number = number;
        this.model = model;
    }

    public Phone(long number, String model, double weight) {
        super();
        new Phone(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public long getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name + ". Ваш номер: +" + getNumber());
    }

    public void receiveCall(String name, long number) {
        System.out.println("Звонит " + name + ". Входящий номер: +" + number);
    }

    public void sendMessage(String message, long number) {
        System.out.println("Исходящий номер +" + number + ". Сообщение: " + message);
    }
}
