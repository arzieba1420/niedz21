public class Lab3_1_2 {
    public static void main(String[] args) {

        int a = 19;
        int b = 8;
        show (a,b);

    }

    static void show (int a, int b){
        int iloraz = a/b;
        int reszta = a%b;
        System.out.println("Wynik dzielenia "+a+ " i "+b+" to: "+iloraz+"\t"+reszta);
    }
}
