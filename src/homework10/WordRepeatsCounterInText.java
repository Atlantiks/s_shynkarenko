package homework10;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordRepeatsCounterInText {
    public static void main(String[] args) {
        Map<String,Integer> allWordsCount = countRepeats(
                "При сдаче после 11 октября от максимального балла будет отниматься штраф за просрочку.");
        allWordsCount.forEach((key, value) -> System.out.println("Слово : " + key + "  встречается " + value + " раз"));
    }

    public static  Map<String,Integer> countRepeats(String text) {
        String[] words = text.split(" ");
        Map<String,Integer> allWordsCount = new LinkedHashMap<>();

        for (String word : words) {
            if (allWordsCount.containsKey(word)) {
                allWordsCount.put(word, allWordsCount.get(word) + 1);
            } else {
                allWordsCount.put(word, 1);
            }
        }
        return allWordsCount;
    }
}
