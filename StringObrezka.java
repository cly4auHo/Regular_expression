package regular_stroki;

public class StringObrezka {

    public static void main(String[] args) {

        StringBuilder[] array = {new StringBuilder("2124141241"), new StringBuilder("123sf"), new StringBuilder("123"),};
        StringBuilder[] result = modif(array);
        for (StringBuilder sb : result) {
            System.out.println(sb);
        }
    }

    public static StringBuilder[] modif(StringBuilder[] array) {
        StringBuilder[] result = new StringBuilder[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i].toString().length() > 7) {
                result[i] = new StringBuilder(array[i].substring(0, 5));
            } else {
                result[i] = new StringBuilder(array[i].toString());
            }
        }
        return result;
    }
}
