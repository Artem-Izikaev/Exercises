import java.util.HashMap;
import java.util.Map;

public class DNA {
    private Map<Character, Integer> nuclMap = new HashMap<>();

    public DNA(String dna) {
        nuclMap.put('A', 0);
        nuclMap.put('C', 0);
        nuclMap.put('G', 0);
        nuclMap.put('T', 0);
        for (char nucleotide : dna.toCharArray()) {
            nuclMap.put(nucleotide, nuclMap.get(nucleotide) + 1);
        }
    }

    public int count (char nucleotide) {
        if (nuclMap.get(nucleotide) == null)
            throw new IllegalArgumentException("Illegal argument value: " + nucleotide);
        return nuclMap.get(nucleotide);
    }

    public Map<Character, Integer> nucleotideCounts () {
        return nuclMap;
    }
}
