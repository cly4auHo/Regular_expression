package regular_stroki;

public class ObrezkaStrok {

    public static void main(String args[]) {
        String[] array = {"Добро пожаловать", "проверь меня", "проверь меня", "прости", "))))", "cat"};

        modif(array);

        for (String s : array) {
            System.out.println(s);
        }
    }

    public static void modif(String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                continue;
            } else {
                if (array[i].length() < 3) {
                    continue;
                } else {
                    array[i] = array[i].substring(0, 3);
                }
            }
        }
    }

}
