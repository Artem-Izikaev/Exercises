import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Artem Izikaev on 08.12.2016.
 */
public class PhoneNumber {
    private String purePhoneNumber;

    public PhoneNumber(String phoneNumber) {
                // cut non digits
        Pattern exclDigit = Pattern.compile("[^0-9]+");
        Matcher cutNonDigit = exclDigit.matcher(phoneNumber);
        this.purePhoneNumber = cutNonDigit.replaceAll("");
                // validate phone number
        this.purePhoneNumber =
                (this.purePhoneNumber.length() < 10 ||
                 this.purePhoneNumber.length() > 11 ||
                 this.purePhoneNumber.length() == 11 &
                !this.purePhoneNumber.substring(0, 1).equals("1")
                ) ?
                    "0000000000" :
                    (this.purePhoneNumber.length() == 11 ? this.purePhoneNumber.substring(1) : this.purePhoneNumber);
    }

    /** Returns pure unformatted phone number */
    public String getNumber () {
        return this.purePhoneNumber;
    }

    /** Returns area code of phone number */
    public String getAreaCode () {
        return this.purePhoneNumber.substring(0,3);
    }

    /** Returns formatted phone number */
    public String pretty () {
        return "(" + this.purePhoneNumber.substring(0,3) + ")" +
               " " + this.purePhoneNumber.substring(3,6) + "-" +
                     this.purePhoneNumber.substring(6);
    }
}
