public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister zawsze spłaca swoje długi.";

        System.out.println("Tekst to: " + str);
        System.out.println("Długość tekstu: "+ str.length() + " znaków");
        System.out.println("Na pozycji znajduje się: " + str.charAt(0)); //charAt liczy od 0

        System.out.println("Fragment tekstu od znaku 10 do 16: " + str.substring(10,16));
        System.out.println();
        System.out.println("Index pierwszej litery 't': " + str.indexOf('t')); // indexOf liczy od 0
        System.out.println();
        System.out.println("Indeks pierwszego podtekstu \"długi\": " + str.indexOf("długi"));
        System.out.println();
        System.out.println("Tekst z wielkimi literami: "+ str.toUpperCase());
    }
}
