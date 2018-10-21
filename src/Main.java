import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BigDecimal value , result, m1;
         value = new BigDecimal("14000");
         m1 = new BigDecimal("1.433");
         result = value.multiply(m1);
        System.out.println(result);
    }
}
