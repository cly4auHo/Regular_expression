package regular_stroki;

public class Registr {

    public static void main(String[] args) {
        String l = "FGEQwewEeee";
        System.out.println(transfer(l));
    }

    public static String transfer(String l) {
        String str = "";

        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) <= 'z' && l.charAt(i) >= 'a') {
                str += Character.toUpperCase(l.charAt(i));
            } else {
                str += Character.toLowerCase(l.charAt(i));
            }
        }
        return str;
    }
}
