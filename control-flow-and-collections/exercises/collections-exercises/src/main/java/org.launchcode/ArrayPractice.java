package org.launchcode;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = new int[] {1, 1, 2, 3, 5, 8};
        for(int number: integerArray){
            if (number % 2  != 0) {
                System.out.println(number);
            }
        }
        String text = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] result = text.split(" ");
        System.out.println(Arrays.toString(result));
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }
}
