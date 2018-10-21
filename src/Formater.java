import java.util.Locale;

public class Formater {
    public static void main(String[] args) {

        int i = 98943;
        String s = "jakiś napis";
        double d = Math.PI;

        System.out.printf("%20d",i);    // odstęp int
        System.out.println();
        System.out.printf("%20s",s);    // odstęp double
        System.out.println();
        System.out.printf(new Locale("us"),"%.50f",d);  //precyzja liczb zmiennoprzecinkowych


    }
}
