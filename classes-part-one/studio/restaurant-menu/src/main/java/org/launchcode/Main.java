package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem spaghetti = new MenuItem(22.99, "spaghtti with meatball", "Main Course", true);
        MenuItem tray = new MenuItem(2.00, "Good", "Appetizer", true);
        MenuItem cheeseCake = new MenuItem(4.99, "CheeseCake", "Dessert", true);

        Menu menu = new Menu();

        menu.addMenuItem(spaghetti);
        menu.addMenuItem(tray);
        menu.addMenuItem(cheeseCake);
        System.out.println(menu.getItems());
//        System.out.println(menu.getLastUpdated());
        System.out.println(spaghetti);
//        menu.printMenu();

        menu.removeMenuItem(tray);
        System.out.println(menu.getItems());

    }
}
