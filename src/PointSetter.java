import java.awt.*;

public class PointSetter {
    public static void main(String[] args) {

        Point location = new Point(4,13);

        System.out.println("Położenie początkowe:" );
        System.out.println("x równe: " + location.x );
        System.out.println("y równe: " + location.y);
        System.out.println();

        System.out.println("Przejscie do (7,6)");
        location.y = 6;
        location.x = 7;

        System.out.println("Położenie końcowe:" );
        System.out.println("x równe: " + location.x );
        System.out.println("y równe: " + location.y);
    }
}
