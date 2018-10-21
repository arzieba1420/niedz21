public class Casting {
    public static void main(String[] args) {
        double d = 4.45;
        int i;
        short s = 8;

        i = (int) s;
        System.out.println(i);

        Employee emp = new Employee();
        VicePresident veep = new VicePresident();

        emp = veep;

        veep = (VicePresident)emp;

        float f3 = 4.3f;

        Float f1 = 4.23F;
        Float f2 = 6.34f;
        System.out.println(Math.min(f1,f2));


    }
}


class Employee {
}

class VicePresident extends Employee {
}
