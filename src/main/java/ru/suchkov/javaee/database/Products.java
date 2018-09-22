package ru.suchkov.javaee.database;

import ru.suchkov.javaee.entity.Entity;

import java.util.ArrayList;

public class Products {
    private static Products ourInstance = new Products();

    public static Products getInstance() {
        return ourInstance;
    }

    private ArrayList<Entity> entities;

    private Products() {
        entities = new ArrayList<>();

        /* Entity
        String image,
        String name,
        double price,
        String shortDescription,
        String fullDescription,
        String addetInfoName,
        String addetInfoDescription,
        ArrayList<String> characteristics) */

        for (int i = 1; i < 11; i++) {
            ArrayList<String> arrayList = new ArrayList<>();
            for (int j = 1; j < 5; j++) arrayList.add(String.format("Характеристика %d", j));
            entities.add(new Entity(
                    i,
                    String.format("product%d.png", i),
                    String.format("Серфборд FireWire Pyzalien %d", i),
                    Math.random()*100000,
                    String.format("Здесь находится краткое описание товара %d", i),
                    String.format("Здесь находится более полное описание товара %d", i),
                    String.format("Дополнительная информацияя о товаре %d", i),
                    String.format("Здесь находится дополнительная информация о товаре %d", i),
                    arrayList));
        }
    }

    public ArrayList<Entity> getEntities() {
        return entities;
    }
}
