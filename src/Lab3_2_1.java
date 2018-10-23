import java.util.StringTokenizer;

public class Lab3_2_1 {
    public static void main(String[] args) {

        StringTokenizer s1;
        String dd, mm, rrrr;

        String data = "07/11/1993";

        s1 = new StringTokenizer(data, "/");

        System.out.println(s1.countTokens());
        dd = s1.nextToken();
        mm = s1.nextToken();
        rrrr = s1.nextToken();

        System.out.println("Dzień: " + dd);
        System.out.println("Miesiąc: " + mm);
        System.out.println("Rok: " + rrrr);

    }
}
