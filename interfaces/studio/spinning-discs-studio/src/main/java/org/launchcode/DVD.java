package org.launchcode;

public class DVD extends BasicDics implements OpticalDisc {
   private String genre;

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String name, int capacity,String genre) {
        super(name, capacity);
        this.genre = genre;
    }
//    public DVD(Double price, int storageCapacity, int speed, String contents) {
//        super(price, storageCapacity, speed, contents);
//    }
    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at speed 570 - 1500 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Playing awesome film.");
    }

    public void playVideo(){
        System.out.println("Playing a " + genre + " film.");
    }

//    @Override
//    public String playMusic() {
//        return null;
//    }
//
//    @Override
//    public void write() {
//
//    }
//
//    @Override
//    public void read() {
//
//    }
}
