public class Lab3_1_1 {
    public static void main(String[] args) {

        double startValue = 14000;
        System.out.println("Inwestycja po 3 latach wynosi: " + Math.round(revalue(startValue)) );
        System.out.format("%.2f", revalue(startValue)  );
        System.out.println();
        System.out.printf("%.2f",revalue(startValue ));


    }

    static double revalue (double a) {
        double firstYear = a*1.4;
        double secondYear = firstYear - 1500;
        return  secondYear * 1.12;

    }
}
