import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private String srcString;

    public Anagram(String srcString) {
        this.srcString = srcString;
    }

    public List<String> match (List<String> anagramList) {
        String word1 = srcString.toLowerCase(),
               word2;
        List<String> result = new ArrayList<>();

        for (String anagram : anagramList) {
            word2 = anagram.toLowerCase();
            if (!word1.equals(word2)    &&
                !result.contains(word2) &&
                Arrays.equals(
                    word1.chars().sorted().toArray(),
                    word2.chars().sorted().toArray())) {
                result.add(anagram);
            }
        }

        return result;
    }
}
