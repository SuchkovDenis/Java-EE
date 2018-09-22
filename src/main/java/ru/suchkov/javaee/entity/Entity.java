package ru.suchkov.javaee.entity;

import java.util.ArrayList;

public class Entity {
    private int id;
    private String image;
    private String name;
    private double price;
    private String shortDescription;
    private String fullDescription;
    private String addetInfoName;
    private String addetInfoDescription;
    private ArrayList<String> characteristics;

    public Entity(int id, String image, String name, double price, String shortDescription, String fullDescription, String addetInfoName, String addetInfoDescription, ArrayList<String> characteristics) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.price = price;
        this.shortDescription = shortDescription;
        this.fullDescription = fullDescription;
        this.addetInfoName = addetInfoName;
        this.addetInfoDescription = addetInfoDescription;
        this.characteristics = characteristics;
    }

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getFullDescription() {
        return fullDescription;
    }

    public String getAddetInfoName() {
        return addetInfoName;
    }

    public String getAddetInfoDescription() {
        return addetInfoDescription;
    }

    public ArrayList<String> getCharacteristics() {
        return characteristics;
    }
}
