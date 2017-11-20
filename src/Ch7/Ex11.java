package Ch7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Write a program that reads a sentence into an array list. Then, using Collections.shuffle, shuffle all but the first and
last word, without copying the words into another collection.
 */
public class Ex11 {
    public static void main(String[] args) {
        String sentence = "now is the time for all good men to come to the aid of their country";
        List<String> words = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Collections.shuffle(words.subList(1,words.size()-1));
        System.out.println(words);
    }
}
