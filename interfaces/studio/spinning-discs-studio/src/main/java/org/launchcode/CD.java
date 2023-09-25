package org.launchcode;

import java.util.List;

public class CD extends BasicDics implements OpticalDisc{


//    public CD(Double price, int storageCapacity, int speed, String contents) {
//        super(price, storageCapacity, speed, contents);
//    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public String artist;
    public CD(String name, int capacity, String artist) {
        super(name, capacity);
        this.artist = artist;
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at speed 200-500rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Let's rock!");
    }
    public void playSong(){
        System.out.println("Playing song by " + artist);
    }

//    @Override
//    public String playMusic() {
//        return "CD is playing audio music.";
//    }
//
//    @Override
//    public void write() {
//        System.out.println("CD is wrote.");
//    }
//
//    @Override
//    public void read() {
//        System.out.println("CD is read.");
//    }

}
