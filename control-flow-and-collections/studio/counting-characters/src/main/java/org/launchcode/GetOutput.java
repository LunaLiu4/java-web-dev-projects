package org.launchcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GetOutput {
    public static void getHashMap(char[] array) {
        HashMap<Character, Integer> output = new HashMap<>();
        int count;

        for (char character : array) {
            if (output.containsKey(character)) {
                count = output.get(character) + 1;
            } else {
                count = 1;
            }
            output.put(character, count);
        }
//        System.out.println(output);

        for (Map.Entry<Character, Integer> character : output.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }
    }
}
