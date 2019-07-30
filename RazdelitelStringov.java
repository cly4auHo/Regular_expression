package regular_stroki;

public class RazdelitelStringov {

    public static String myJoin(String... args) {
        String result = "";

        if (args.length <= 1) {
            throw new IllegalArgumentException("opusti");
        }
        for (int i = 1; i < args.length; i++) {
            if (i != args.length - 1) {
                result = result + args[i] + args[0];
            } else {
                result = result + args[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(myJoin(" razdel ", "str1", "str2", "str3", "str4","d"));
    }
}
