package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String myString = "If the product of two terms is zero then common sense says at least" +
                " one of the two terms has to be zero to start with. So if you move all " +
                "the terms over to one side, you can put the quadratics into a form that" +
                " can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();

        HashMap<Character, Integer> output = new HashMap<>();
        int count = 0;

        for(char character: charactersInString){
            if(output.containsKey(character)){
                count = output.get(character) + 1;
            }else {
                count = 1;
            }
            output.put(character,count);
        }

        for (Map.Entry<Character, Integer> character : output.entrySet()) {
            System.out.println(character.getKey() + ": " +character.getValue());
        }
    }
}
