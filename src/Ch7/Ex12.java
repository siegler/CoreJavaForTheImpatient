package Ch7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Using Collections.shuffle, write a program that reads a sentence, shuffles the words, and prints the result. Fix the capitalization of the initial word and the punctuation of the last word (before and after the shuffle). Hint: Don’t shuffle the words.
 */
public class Ex12 {
    public static void main(String[] args) {
        String sentence = "Now is the time for all good men to come to the aid of their country.";
        List<String> words = Arrays.asList(sentence.toLowerCase().split(" "));
        String lastWord = words.get(words.size()-1);
        //Remove period from last word
        words.set(words.size()-1, lastWord.substring(0, lastWord.length()-1));
        Collections.shuffle(words);
        String firstWord = words.get(0);
        //Capitalize
        firstWord = firstWord.substring(0,1).toUpperCase() + firstWord.substring(1);
        words.set(0, firstWord);
        words.set(words.size()-1, words.get(words.size()-1) + ".");
        String result = "";
        String sep = "";
        for (String word: words) {
            result += sep + word;
            sep = " ";
        }
        System.out.println(result);
    }
}
