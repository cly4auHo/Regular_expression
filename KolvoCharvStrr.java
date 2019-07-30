package regular_stroki;

public class KolvoCharvStrr {

    public static void main(String[] args) {
        char array[] = {'g', 'h'};
        System.out.println(calculate(array, "aaAAgg"));
    }

    public static boolean Pass(String args) {

        char[] bigL = new char[26];
        char[] litL = new char[26];
        char[] digits = new char[10];

        for (int i = 0; i < 26; i++) {
            bigL[i] = (char) (65 + i);
        }
        for (int i = 0; i < 26; i++) {
            litL[i] = (char) (97 + i);
        }
        return true;
    }

    public static int calculate(char[] array, String str) {
        int counter = 0;

        char[] mass = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (array[i] == mass[j]) {
                    counter++;
                }
            }
        }
        return counter;
    }

}
