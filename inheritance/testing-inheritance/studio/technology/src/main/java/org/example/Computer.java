package org.example;

public class Computer {
    private String brand;
    private  String processor;
    private int storage;

    public Computer(String brand, String processor, int storage) {
        this.brand = brand;
        this.processor = processor;
        this.storage = storage;
    }

    public String getBrand() { return brand; }

    public String getProcessor() {
        return processor;
    }

    public int getStorage() {
        return storage;
    }

    public void displayInfo(){
        System.out.println("Brand: " + this.brand + "\nProcessor: " + this.processor +"\nStorage: " + this.storage + "GB");
    }
}
