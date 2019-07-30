package regular_stroki;

public class Probeldelete {

    public static String Probel(String test) {
        return test.replaceAll(" ,", ",");
    }

    public static void main(String[] args) {
        String s = "fdsfsdfsdf , sdfs , adf";
        System.out.println(Probel(s));
    }

}
