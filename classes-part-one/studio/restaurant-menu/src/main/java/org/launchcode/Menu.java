package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
//import java.util.Date;
import java.time.LocalDate;


public class Menu {
    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();

    public Menu(LocalDate d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }
    public Menu(){
        this.lastUpdated = LocalDate.now();
    }
    public void addMenuItem (MenuItem item){
        this.items.add(item);
        this.lastUpdated = LocalDate.now();
    }
    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }
}
