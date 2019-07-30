package regular_stroki;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cymvol {

    public static void main(String[] args) {
        StringBuilder[] array = {new StringBuilder("2124141241"), new StringBuilder("1231sf"), new StringBuilder("123"),};
        int c = 0;

        for (StringBuilder b : array) {
            Pattern pattern = Pattern.compile("1");
            Matcher matcher = pattern.matcher(b);
            while (matcher.find()) {
                c++;
            }
        }
        System.out.println(c);
    }

}
