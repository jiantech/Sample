import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z]{3}[.]{1}[\\d]{4}[#]{1}[A-Za-z]*[@]{1}[gmail.com]{1}");
        Matcher matcher = pattern.matcher("bha.5345#BBHrath@gmail.com");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
