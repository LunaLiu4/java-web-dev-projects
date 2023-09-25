package org.launchcode;

import java.util.ArrayList;
import java.util.List;

public abstract class BasicDics {
    private String name;
    private int capacity;
    private List<String> content = new ArrayList();

    public BasicDics(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }
    public BasicDics(String name, int capacity,List<String> content){
        this(name, capacity);
        this.content = content;
    }

    public String writeData(String input){
        return "Data written: " + input;
    }

    public String getBasicInfo(){
        return "Name: " + name + "Capacity: " + capacity;
    }

}
