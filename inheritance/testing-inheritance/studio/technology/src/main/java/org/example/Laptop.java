package org.example;

public class Laptop extends Computer{
    private String module;
    private String color;

    public Laptop(String brand, String processor, int storage,String module, String color) {
        super(brand, processor, storage);
        this.module = module;
        this.color = color;
    }

    public String getModule() {
        return module;
    }

    public String getColor() {
        return color;
    }

}

