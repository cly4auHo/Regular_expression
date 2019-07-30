package regular_stroki;

public class Splinter {

    public static void main(String args[]) {
        String Str = new String("Предложение1.Предложение2.Предложение3.");

        for (String r : Str.split("\\.")) {
            System.out.println(r + ".");
        }
    }

}
