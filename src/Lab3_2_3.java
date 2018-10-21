public class Lab3_2_3 {
    static int counter;

    Lab3_2_3() {
        counter++;
    }

    public static void main(String[] args) {

        Lab3_2_3 l1 = new Lab3_2_3();

        Lab3_2_3 l2 = new Lab3_2_3();
        Lab3_2_3 l3 = new Lab3_2_3();
        System.out.println(counter);


    }
}
