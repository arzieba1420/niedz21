public class Binary {
    public static void main(String[] args) {

        /*int i = 5;
        System.out.println("dziesiętny: " + i);
        System.out.println("binarny: " + Integer.toBinaryString(i));
        System.out.println("szesnastkowy: " + Integer.toHexString(i));
        System.out.println("ósemkowy : " + Integer.toOctalString(i));
        System.out.println();

        int i2 = 0173;
        System.out.println("dziesiętny: " + i2);
        System.out.println("binarny: " + Integer.toBinaryString(i2));
        System.out.println("szesnastkowy: " + Integer.toHexString(i2));
        System.out.println("ósemkowy : " + Integer.toOctalString(i2));*/

        //operatory bitowe & 1 0 0 0, | 1 1 1 0 , ^ 0 1 1 0
        // negacja bitowa ~
        // 00110101
        // 11001010
        // >> przesunięcie w prawo
        // << przesunięcie w lewo

        int a = 6;
        int b = 5;
        int c = calculate(a, b);

        System.out.println("negacja 5 = "+ (~5));
        System.out.println("przesuniecie w prawo 5 = "+ (5>>1));

        show(a, b, c);
    }

    static void show(int a, int b, int c) {
        System.out.println();
        System.out.println("Operacja: " + a + " ^ " + b + " = " + c);
        System.out.printf("%10s\n", Integer.toBinaryString(a));  //% liczba znaków string, to co wyswietlamy
        System.out.printf("%10s\n", Integer.toBinaryString(b));
        System.out.println("----------------");
        System.out.printf("%10s\n", Integer.toBinaryString(c));
    }

    static int calculate(int a, int b) {
        return a ^ b;
    }
}
