package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();
        if (sentence.length() == 0) {
            return wordsCount;
        }
        String[] words = sentence.split(" ");
        for (String word : words) {
            int count = wordsCountInSentence(sentence, word);
            wordsCount.put(word, count);
        }
        return  wordsCount;
    }

    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (Map.Entry<String, Integer> word : wordsCount.entrySet()) {
            sb.append("\n  " + word.getKey() + ": " + word.getValue());
        }
        sb.append("\n}");
        return sb.toString();
    }

    private static int wordsCountInSentence(String sentence, String searchingWord) {
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            if (searchingWord.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
//END
