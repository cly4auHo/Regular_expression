package regular_stroki;

public class KolvoVowel {

    public static void main(String[] args) {
        System.out.println(count("авобвааапра"));
    }

    public static int count(String text) {
        int count = 0;
        char[] constant = "аеиоуэюя".toCharArray();
        char[] s = text.toCharArray();

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < constant.length; j++) {
                if (s[i] == constant[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
