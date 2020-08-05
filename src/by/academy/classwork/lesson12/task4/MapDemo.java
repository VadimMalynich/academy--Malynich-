package by.academy.classwork.lesson12.task4;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> catalog = new HashMap<String, Integer>();
        addProductToMap(catalog, "Product1");
        addProductToMap(catalog, "Product1");
        addProductToMap(catalog, "Product1");

        addProductToMap(catalog, "Product2");
        addProductToMap(catalog, "Product2");
        addProductToMap(catalog, "Product2");

        addProductToMap(catalog, "Product3");
        addProductToMap(catalog, "Product3");
        addProductToMap(catalog, "Product3");

        addProductToMap(catalog, "Apple");

        for (String product : catalog.keySet()) {
            System.out.println(product + " " + catalog.get(product));
        }
    }

    public static void addProductToMap(Map<String, Integer> catalog, String product) {
        if (catalog == null) {
            return;
        }
        if (catalog.containsKey(product)) {
            catalog.put(product, catalog.get(product) + 1);
        } else {
            catalog.put(product, 1);
        }
    }
}
