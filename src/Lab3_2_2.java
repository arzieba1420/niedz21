class Lab3_2_2C1 {

        int a, b, c;

}

class Lab3_2_2C2 extends Lab3_2_2C1 {
    public static void main(String[] args) {

        Lab3_2_2C1 l = new Lab3_2_2C1();
        l.a = 5;
        l.b = 7;
        l.c = 9;

        System.out.println(l.a + "\t"+l.b+"\t"+l.c);
    }
}
