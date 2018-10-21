import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal value, result, m1;
        double x =1.14d;
        value = new BigDecimal("14000");
        m1 = new BigDecimal(x);
        result = value.multiply(m1);
        System.out.printf("%.2f",result);
    }
}
