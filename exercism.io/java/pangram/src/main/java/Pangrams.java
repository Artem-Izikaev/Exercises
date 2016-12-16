public class Pangrams {
    public static boolean isPangram (String string) {
        return string.toLowerCase()
                .replaceAll("[^a-z]+","")
                .chars()
                .distinct()
                .count() == 26;
    }
}
