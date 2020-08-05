package by.academy.homework.homework3.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Type obj = null;
        int flag, arraySize, size, type = 0;
        boolean menu = true;
        System.out.println("Choose type of data to work:");
        System.out.print("1. Integer;\n2. Float;\n3. Double;\n4. String\n");
        flag = checkEnter(scanner, 4);
        System.out.print("\n1. Set size automatically\n2. Set size manually");
        arraySize = checkEnter(scanner, 2);
        if (arraySize == 1) {
            if (flag == 1) {
                obj = new Type<Integer>();
                type = 1;
            }
            if (flag == 2) {
                obj = new Type<Float>();
                type = 2;
            }
            if (flag == 3) {
                obj = new Type<Double>();
                type = 3;
            }
            if (flag == 4) {
                obj = new Type<String>();
                type = 4;
            }
        } else {
            size = checkSize(scanner);
            if (flag == 1) {
                obj = new Type<Integer>(size);
                type = 1;
            }
            if (flag == 2) {
                obj = new Type<Float>(size);
                type = 2;
            }
            if (flag == 3) {
                obj = new Type<Double>(size);
                type = 3;
            }
            if (flag == 4) {
                obj = new Type<String>(size);
                type = 4;
            }
        }

        while (menu) {
            printMenu();
            flag = checkEnter(scanner, 10);
            switch (flag) {
                case 1:
                    System.out.print("\nEnter element: ");
                    if (type == 1) {
                        Integer temp = scanner.nextInt();
                        obj.add(temp);
                    }
                    if (type == 2) {
                        float temp = scanner.nextFloat();
                        obj.add(temp);
                    }
                    if (type == 3) {
                        double temp = scanner.nextDouble();
                        obj.add(temp);
                    }
                    if (type == 4) {
                        String temp = scanner.next();
                        obj.add(temp);
                    }
                    break;
                case 2:
                    obj.print();
                    break;
                case 3:
                    System.out.print("\nEnter index of element for print: ");
                    int index;
                    index = checkSize(scanner);
                    System.out.print(obj.get(index));
                    break;
                case 4:
                    System.out.println("Last element: " + obj.getLast());
                    break;
                case 5:
                    System.out.println("First element: " + obj.getFirst());
                    break;
                case 6:
                    obj.printArrayLength();
                    break;
                case 7:
                    obj.getLastFillElementIndex();
                    break;
                case 8:
                    index = checkDeleteIndex(scanner);
                    obj.remove(index);
                    break;
                case 9:
                    System.out.print("\nEnter element for delete: ");
                    if (type == 1) {
                        Integer temp = scanner.nextInt();
                        obj.remove(temp);
                    }
                    if (type == 2) {
                        float temp = scanner.nextFloat();
                        obj.remove(temp);
                    }
                    if (type == 3) {
                        double temp = scanner.nextDouble();
                        obj.remove(temp);
                    }
                    if (type == 4) {
                        String temp = scanner.next();
                        obj.remove(temp);
                    }
                    break;
                case 10:
                    menu = false;
                    System.out.print("\nExit program");
                    break;
                default:
                    System.out.print("\nError!");
            }
        }


    }

    public static void printMenu() {
        System.out.print("\n1. Add element\n2. Print array\n3. Get element by index\n4. Get last element" +
                "\n5. Get first element\n6. Print array length\n7. Print last fill element index" +
                "\n8. Delete element by index\n9. Delete element by value\n10. Exit");
    }

    public static int checkSize(Scanner scanner) {
        int size;
        do {
            System.out.print("\nEnter size of array: ");
            while (!scanner.hasNextInt()) {
                System.out.print("No number entered\nTry again: ");
                scanner.next();
            }
            size = scanner.nextInt();
        } while (size < 1);
        return size;
    }

    public static int checkDeleteIndex(Scanner scanner) {
        int size;
        do {
            System.out.print("\nEnter index of element for delete: ");
            while (!scanner.hasNextInt()) {
                System.out.print("No number entered\nTry again: ");
                scanner.next();
            }
            size = scanner.nextInt();
        } while (size < 0);
        return size;
    }

    public static int checkEnter(Scanner scanner, int max) {
        int flag;
        do {
            System.out.print("\nYour choice: ");
            while (!scanner.hasNextInt()) {
                System.out.print("No number entered\nTry again: ");
                scanner.next();
            }
            flag = scanner.nextInt();
        } while (flag > max || flag < 1);
        return flag;
    }
}

/*switch (flag) {
            case 1:
                if (arraySize == 1) {
                    Type<Integer> obj = new Type<>();
                } else {
                    size = checkSize(scanner);
                    Type<Integer> obj = new Type<>(size);
                }
                break;
            case 2:
                if (arraySize == 1) {
                    Type<Float> obj = new Type<>();
                } else {
                    size = checkSize(scanner);
                    Type<Float> obj = new Type<>(size);
                }
                break;
            case 3:
                if (arraySize == 1) {
                    Type<Double> obj = new Type<>();
                } else {
                    size = checkSize(scanner);
                    Type<Double> obj = new Type<>(size);
                }
                break;
            case 4:
                if (arraySize == 1) {
                    Type<String> obj = new Type<>();
                } else {
                    size = checkSize(scanner);
                    Type<String> obj = new Type<>(size);
                }
                break;
            default:
                System.out.print("\nError!");
                break;
        }*/
/*
        if (arraySize == 1) {
            if(flag==1){
            Type<Integer> obj = new Type<>();
            }
            if(flag==2){
            Type<Float> obj = new Type<>();
            }
            if(flag==3){
            Type<Double> obj = new Type<>();
            }
            if(flag==4){
            Type<String> obj = new Type<>();
            }
            else{
            size = checkSize(scanner);
            if(flag==1){
            Type<Integer> obj = new Type<>(size);
            }
            if(flag==2){
            Type<Float> obj = new Type<>(size);
            }
            if(flag==3){
            Type<Double> obj = new Type<>(size);
            }
            if(flag==4){
            Type<String> obj = new Type<>(size);
            }
            }*/