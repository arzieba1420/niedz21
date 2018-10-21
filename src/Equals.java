public class Equals {
    public static void main(String[] args) {


        String str1, str2;
        str1 = new String("To jest jakiś tekst");
        str2 = new String("To jest jakiś tekst");

        if(str1.equals(str2)){

            System.out.println("Równe!!!");
        }

        A a = new A();
        B b = new B();

        if (a.equals(b)){
            System.out.println("równe nasze klasy ");
        }
    }
}


class A{}

class B{}
