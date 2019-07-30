package regular_stroki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Podstrok_start_end {

    public static void main(String[] args) {
        String test = "Здравствуйте!!";
        System.out.println(check2(test));
    }

    public static int check1(String b) {
        int c = 0;
        Pattern pattern = Pattern.compile("qwe");
        Matcher matcher = pattern.matcher(b);
        while (matcher.find()) {
            c++;
        }
        return c;
    }

    public static boolean check2(String b) { // начинается на 
        Pattern pattern = Pattern.compile("^Здравствуйте!.*$");
        Matcher matcher = pattern.matcher(b);
        return matcher.matches();
    }

    public static boolean check3(String b) { // заканчивается на
        Pattern pattern = Pattern.compile("^.*Best regards(\\.|!)$");
        Matcher matcher = pattern.matcher(b);
        return matcher.matches();
    }

}
