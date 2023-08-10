package org.launchcode;

import java.util.Scanner;
public class SearchTerm {

    public static void main(String[] args) {
        String sentence = "Alive was beginning to get very tired of sitting by her sister on " +
                "the bank, and of having noting to do: once or twice she has peeped into the " +
                "book her sister was reading, but it had no pictures or conversation in it," +
                "'and what is the use of a book', thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter what you want to search:");
        String term = input.nextLine();
        System.out.println(sentence.contains(term));
            int position = sentence.indexOf(term);
            System.out.println("The index of " + term + " is " + position);
            int length = term.length();
            System.out.println("The length of " + term + " is " + length);
            String newSentence = sentence.replace(term, "");
            System.out.println(newSentence);

    }
}
