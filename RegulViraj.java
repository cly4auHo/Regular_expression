package regular_stroki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulViraj {

    public static void main(String[] args) {
        String test = ")Ямайка";
        System.out.println(check10(test));
    }

    public static boolean check(String s) {
        Pattern pattern = Pattern.compile("^[А-Н]{3,3}[0-9]{4,4}$");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }

    public static boolean check2(String a) {
        Pattern pattern = Pattern.compile("^\\d{3}$");
        Matcher matcher = pattern.matcher(a);
        return matcher.matches();
    }

    public static boolean check3(String b) {
        Pattern pattern = Pattern.compile("^\\w{3,}[0-9]{3,}[_]{3,}$");
        Matcher matcher = pattern.matcher(b);
        return matcher.matches();
    }

    public static boolean check4(String c) {
        Pattern pattern = Pattern.compile("^[0-9_A-zА-я]{3,}$");
        Matcher matcher = pattern.matcher(c);
        return matcher.matches();
    }

    public static boolean check5(String d) {
        Pattern pattern = Pattern.compile("^[А-я]{0,5}$");
        Matcher matcher = pattern.matcher(d);
        return matcher.matches();
    }

    public static boolean check6(String c) {
        Pattern pattern = Pattern.compile("^[а-я][A-z]{3}[0-9]{2}$");
        Matcher matcher = pattern.matcher(c);
        return matcher.matches();
    }

    public static boolean check7(String c) {
        Pattern pattern = Pattern.compile("^[0]{3}[H-R]{2}[1-9]{7}$");
        Matcher matcher = pattern.matcher(c);
        return matcher.matches();
    }

    public static boolean check8(String c) {
        Pattern pattern = Pattern.compile("^(АВ|АА|ВЖ)[-](89|95|73)$");
        Matcher matcher = pattern.matcher(c);
        return matcher.matches();
    }

    public static boolean check9(String c) {
        Pattern pattern = Pattern.compile("^(www\\.|http://)[A-z0-9]+\\.(edu|com|fr)$");
        Matcher matcher = pattern.matcher(c);
        return matcher.matches();
    }

    public static String check10(String t) {
        return t.replaceAll("[Яя]ма[йи]ка", "Гвинея");
    }

}
