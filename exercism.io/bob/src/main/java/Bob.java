/**
 * Created by Admin on 04.11.2016.
 */
public class Bob {
    private static final String WHATEVER = "Whatever.";
    private static final String CHILLOUT = "Whoa, chill out!";
    private static final String SURE     = "Sure.";
    private static final String FINE     = "Fine. Be that way!";

    public String hey (String sentence) {
        if (sentence == null || sentence.trim().length() == 0)
            return Bob.FINE;
        else
        if (sentence.equals(sentence.toUpperCase()) &&
            sentence.replaceAll("(\\p{Punct}|\\p{Digit}|\\p{Blank})", "").length() != 0)
            return Bob.CHILLOUT;
        else
        if (sentence.matches(".+[?]$"))
            return Bob.SURE;
        else
            return Bob.WHATEVER;
    }

}
