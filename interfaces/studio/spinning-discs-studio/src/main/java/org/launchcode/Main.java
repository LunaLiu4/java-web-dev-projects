package org.launchcode;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.
        BasicDics cd = new CD("Fan Mail",750,"TLC");
        BasicDics dvd = new DVD("Gladiator",1500,"Action");


        // TODO: Call each CD and DVD method to verify that they work as expected.

        System.out.println(cd.getBasicInfo());
        System.out.println(dvd.getBasicInfo());

        System.out.println(cd.writeData("Do not go chasing waterfalls."));
        System.out.println(dvd.writeData("Are you not entertained?"));

        OpticalDisc newCd = (OpticalDisc) cd; //casting 多态
        newCd.spinDisc();

        CD newCd1 = (CD) cd;  //another way casting
        newCd1.spinDisc();
        System.out.println(newCd1.getBasicInfo());
        newCd1.playSong();
    }
}