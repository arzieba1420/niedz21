public class Lab3_1_3 {
    public static void main(String[] args) {

        int i = 22;

        System.out.println(i+ " w systemie dwójkowym to "+ Integer.toBinaryString(i));
        System.out.println(i+ " w systemie ósemkowym to "+ Integer.toOctalString(i));
        System.out.println(i+ " w systemie szesnastkowym to "+ Integer.toHexString(i));
    }
}
