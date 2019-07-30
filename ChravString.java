package regular_stroki;

public class ChravString {

    public static void main(String[] args) {

        char[][] array = {{'h', 'e', 'l', 'l', 'o'}, {'w', 'o', 'r', 'l', 'd'}};
        String[] result = fora(array);

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String[] fora(char[][] array) {

        String result[] = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = new String(array[i]);
        }
        return result;
    }

}
