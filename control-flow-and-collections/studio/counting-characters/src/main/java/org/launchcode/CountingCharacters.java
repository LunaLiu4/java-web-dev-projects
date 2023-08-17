package org.launchcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least" +
                " one of the two terms has to be zero to start with. So if you move all " +
                "the terms over to one side, you can put the quadratics into a form that" +
                " can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
        GetOutput.getHashMap(charactersInString);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your string: ");
        String text = input.nextLine();
        text = text.toLowerCase().replaceAll("[^a-zA-Z]", "");
        charactersInString = text.toCharArray();
        GetOutput.getHashMap(charactersInString);
    }

}
