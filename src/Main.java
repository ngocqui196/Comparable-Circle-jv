import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle1: circles) {
            System.out.println(circle1);
        }

        Arrays.sort(circles);

        System.out.println("After- sorted: ");
        for (ComparableCircle circle2: circles) {
            System.out.println(circle2);
        }
    }
}
