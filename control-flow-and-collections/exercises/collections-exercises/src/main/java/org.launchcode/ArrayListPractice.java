package org.launchcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 numbers of an array:");
        int number;
        for(int i = 0;i<10;i++){
            number = input.nextInt();
            ints.add(number);
        }
        System.out.println(ints);
        int total = sumEven(ints);
        System.out.println("The sum of the even numbers is: "+total);

        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("car");
        words.add("dance");
        words.add("elephant");
        words.add("tiger");

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        printWordsWithFiveLetters(words, numChars);
        //convert String to ArrayList
        String text = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        String[] textArray = text.split(" ");
        ArrayList<String> textList = new ArrayList<>(Arrays.asList(textArray));
        System.out.println(textList);
        printWordsWithFiveLetters(textList, numChars);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int sum = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }
        return sum;
    }

    public static void printWordsWithFiveLetters(ArrayList<String> arr, int num) {
        ArrayList<String> newArr = new ArrayList<>();
        for(String word: arr){
            if (word.length() == num){
                System.out.println(word);
            }
        }
    }
}
