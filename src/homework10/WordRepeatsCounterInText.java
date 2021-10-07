package homework10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordRepeatsCounterInText {
    public static void main(String[] args) {
        Map<String,Integer> allWordsCount = countRepeats(
                "This immediately reveals that map.forEach() is also using Map.Entry internally. So I would not expect any performance benefit in using map.forEach() over the map.entrySet().forEach(). So in your case the answer really depends on your personal taste :)");
        allWordsCount.forEach((key, value) -> System.out.println("Слово : " + key + " встречается " + value + " раз"));
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
