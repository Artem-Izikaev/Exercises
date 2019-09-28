import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> phrase (String phrase) {
        Map<String, Integer> wordMap = new HashMap<>();
        // "\\p{Punct}?[ \\t\\n\\r!&@$%^:]+"
        for (String nextWord : phrase.split("\\W+")) {
            nextWord = nextWord.toLowerCase();
            wordMap.put(nextWord, wordMap.getOrDefault(nextWord, 0) + 1);
        }
        return wordMap;
    }
}
