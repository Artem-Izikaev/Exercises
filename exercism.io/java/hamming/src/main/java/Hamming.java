import java.util.stream.IntStream;

public class Hamming {
    public static int compute (String dna1, String dna2) {
        if (dna1.equals(dna2))
            return 0;
        if (dna1.length() != dna2.length())
            throw new IllegalArgumentException();

        return (int) IntStream.range(0, dna1.length())
                .filter(i -> dna1.charAt(i) != dna2.charAt(i))
                .count();
    }
}
