package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MenuItem spaghetti = new MenuItem(22.99, "spaghtti with meatball", "main Course", true);
        MenuItem tray = new MenuItem(2.00, "Good", "app", true);
//        MenuItem pasta = new MenuItem(8.99, "Pasta", "Main Course", true);
//        MenuItem cheeseCake = new MenuItem(4.99, "CheeseCake", "Dessert", true);
//        MenuItem  = new MenuItem(0.99, "Pepsi", "Drink", true);


        Menu menu = new Menu();
//        ArrayList<MenuItem> menuItems = new ArrayList<>();

        menu.addMenuItem(spaghetti);
        menu.addMenuItem(tray);
        System.out.println(menu.getItems());
        System.out.println(menu.getLastUpdated());

    }
}
