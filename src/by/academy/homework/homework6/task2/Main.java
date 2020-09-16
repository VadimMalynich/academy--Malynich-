package by.academy.homework.homework6.task2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vasya", "Pupkin", 2, "25/11/2003");
        User user = new User("vasyapup", "12345678", "vasya.pup@mai;.ru");
        try {
            Class<Person> personClass = Person.class;
            Class<User> userClass = User.class;
            getMethods(personClass, userClass);
            getDeclaredMethods(personClass, userClass);
            getField(personClass, userClass);
            getFields(personClass, userClass);
            getDeclaredField(personClass, userClass);
            getDeclaredFields(personClass, userClass);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void getMethods(Class class1, Class class2) {
        try {
            Method personMethods[] = class1.getMethods();
            Method userMethods[] = class2.getMethods();
            System.out.println("\nPerson methods: ");
            printMethods(personMethods);
            System.out.println("\nUser methods: ");
            printMethods(userMethods);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void getDeclaredMethods(Class class1, Class class2) {
        try {
            Method personMethods[] = class1.getDeclaredMethods();
            Method userMethods[] = class2.getDeclaredMethods();
            System.out.println("\nPerson declared methods: ");
            printMethods(personMethods);
            System.out.println("\nUser declared methods: ");
            printMethods(userMethods);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void getField(Class class1, Class class2) {
        try {
            Field personfield1 = class1.getField("firstName");
            Field personfield2 = class1.getField("lastName");
            Field personfield3 = class1.getField("age");
            Field personfield4 = class1.getField("dateOfBirth");
            Field userfield1 = class2.getField("login");
            Field userfield2 = class2.getField("password");
            Field userfield3 = class2.getField("email");
            setAccessTrue(personfield1, personfield2, personfield3, personfield4);
            printField(personfield1, personfield2, personfield3, personfield4);
            setAccessTrue(userfield1, userfield2, userfield3);
            printField(userfield1, userfield2, userfield3);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void getFields(Class class1, Class class2) {
        try {
            Field personFields[] = class1.getFields();
            Field userFields[] = class2.getFields();
            System.out.println("\nPerson fields: ");
            printFields(personFields);
            System.out.println("\nUser fields: ");
            printFields(userFields);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void getDeclaredField(Class class1, Class class2) {
        try {
            Field personfield1 = class1.getDeclaredField("firstName");
            Field personfield2 = class1.getDeclaredField("lastName");
            Field personfield3 = class1.getDeclaredField("age");
            Field personfield4 = class1.getDeclaredField("dateOfBirth");
            Field userfield1 = class2.getDeclaredField("login");
            Field userfield2 = class2.getDeclaredField("password");
            Field userfield3 = class2.getDeclaredField("email");
            setAccessTrue(personfield1, personfield2, personfield3, personfield4);
            System.out.println("\nPerson declared field: ");
            printField(personfield1, personfield2, personfield3, personfield4);
            setAccessTrue(userfield1, userfield2, userfield3);
            System.out.println("\nUser declared field: ");
            printField(userfield1, userfield2, userfield3);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void getDeclaredFields(Class class1, Class class2) {
        try {
            Field personFields[] = class1.getDeclaredFields();
            Field userFields[] = class2.getDeclaredFields();
            System.out.println("\nPerson declared fields: ");
            printFields(personFields);
            System.out.println("\nUser declared fields: ");
            printFields(userFields);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void printMethods(Method method[]) {
        for (Method m : method) {
            System.out.println(m + " ");
        }
    }

    public static void printFields(Field fields[]) {
        for (Field f : fields) {
            System.out.println(f + " ");
        }
    }

    public static void printField(Field... f) {
        for (Field field : f) {
            System.out.println("Field: " + field);
        }
    }

    public static void setAccessTrue(Field... fields) {
        for (Field f : fields) {
            f.setAccessible(true);
        }
    }
}