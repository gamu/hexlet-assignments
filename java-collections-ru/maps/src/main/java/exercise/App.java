package exercise;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static Map getWordCount(String sentence) {
        var result = new HashMap<String, Integer>();
        if(sentence.isEmpty())
            return result;
        var words = sentence.split(" ");
        for (var word: words) {
            if(result.containsKey(word)) {
                var count = result.get(word);
                count ++;
                result.replace(word, count);
            } else {
                result.put(word, 1);
            }
        }
        return result;
    }

    public static String toString(Map<String, Integer> wordsMap) {
        if(wordsMap.isEmpty())
            return "{}";
        var result = new StringBuilder();
        result.append("{\n");
        for (Map.Entry<String, Integer> wordEntry: wordsMap.entrySet()) {
            result.append("  ");
            result.append(wordEntry.getKey());
            result.append(": ");
            result.append(wordEntry.getValue());
            result.append("\n");
        }
        result.append("}");
        return result.toString();
    }
}
