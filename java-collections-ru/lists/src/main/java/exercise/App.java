package exercise;

import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static boolean scrabble(String letters, String word) {
        var wordChars = word.toLowerCase().toCharArray();
        var lettersChars =  letters.toLowerCase().toCharArray();
        var letterList = new ArrayList<>();
        Arrays.sort(wordChars);
        Arrays.sort(lettersChars);
        for(var item: lettersChars) {
            letterList.add(item);
        }
        for(var letter: wordChars){
            if(letterList.contains(letter)){
                var idx = letterList.indexOf(letter);
                letterList.remove(idx);
            }else{
                return false;
            }
        }
        return true;
    }
}
