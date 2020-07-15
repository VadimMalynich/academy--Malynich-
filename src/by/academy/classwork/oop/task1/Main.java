package by.academy.classwork.oop.task1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(375295473620l, "Samsung", 200.6);
        Phone phone2 = new Phone(375335876932l, "Apple", 154.85);
        Phone phone3 = new Phone(375152146987l, "Huawei", 263.12);
        System.out.println("Телефон №1: номер +" + phone1.getNumber() + ", модель " + phone1.getModel() + ", вес " + phone1.getWeight());
        System.out.println("Телефон №2: номер +" + phone2.getNumber() + ", модель " + phone2.getModel() + ", вес " + phone2.getWeight());
        System.out.println("Телефон №3: номер +" + phone3.getNumber() + ", модель " + phone3.getModel() + ", вес " + phone3.getWeight());
        phone1.receiveCall("Ангелина");
        phone2.receiveCall("Виталий");
        phone3.receiveCall("Босс");
        phone1.receiveCall("Евгений", 375335896321l);
        phone2.receiveCall("Елена", 375152587496l);
        phone3.receiveCall("Леонид", 375292583020l);
        phone1.sendMessage("Привет!", 375331023650l);
        phone2.sendMessage("Купишь хлеб?.", 375152962036l);
        phone3.sendMessage("Перезвони.", 375292102540l);
    }
}
