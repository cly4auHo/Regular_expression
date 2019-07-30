package regular_stroki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parol {

    public static void main(String[] args) {
        String test = "GZa55FFaazz";
        System.out.println(check(test));
    }

    public static boolean check(String s) {
        Pattern pattern = Pattern.compile("^[A-Z](?=.*?[A-Z]){2,}(?=.*?[0-9]){2,}(?=.*?[a-z]){2,}.{8,}");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static boolean check2(String s) {
        Pattern pattern = Pattern.compile("^[1-9]{7}[A-Za-z]{4}$");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
}
