package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {

    public static boolean scrabble(String letters, String word) {
        char[] wordCharArray = word.toLowerCase().toCharArray();
        char[] lettersCharArray = letters.toCharArray();
        List <Character> wordCharList = new ArrayList<Character>();
        List <Character> letterCharList = new ArrayList<Character>();

        for (char ch : lettersCharArray) {
            letterCharList.add(ch);
        }

        int indexChar;
        for (char ch : wordCharArray) {
            if (letterCharList.contains(ch)) {
                indexChar = letterCharList.indexOf(ch);
                letterCharList.remove(indexChar);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(scrabble("rkqodlw", "woRld"));
    }
}
//END
