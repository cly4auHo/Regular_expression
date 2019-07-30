package regular_stroki;

public class StringPerevorot {

    public static void main(String[] args) {

        StringBuilder[] array = {new StringBuilder("Дед"), new StringBuilder("qwerty")};
        StringBuilder[] result = rave(array);

        for (StringBuilder sb : result) {
            System.out.println(sb);
        }
    }

    public static StringBuilder[] rave(StringBuilder[] array) {

        StringBuilder[] result = new StringBuilder[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = array[i].reverse();
        }
        return result;
    }
}
