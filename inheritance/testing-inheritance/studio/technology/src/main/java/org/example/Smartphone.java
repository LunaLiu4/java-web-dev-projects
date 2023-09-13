package org.example;

public class Smartphone extends Computer{
    private String module;
    private  String color;
    private double screenSize;

    public Smartphone(String brand, String processor, int storage, String module, String color, double screenSize) {
        super(brand, processor, storage);
        this.module = module;
        this.color = color;
        this.screenSize = screenSize;
    }

}
