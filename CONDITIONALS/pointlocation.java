import java.util.Scanner;

public class pointlocation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER X COORDINATE: ");
        int x = sc.nextInt();
        System.out.print("ENTER Y COORDINATE: ");
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("POINT IS IN FIRST QUADRANT");
        } else if (x < 0 && y > 0) {
            System.out.println("POINT IS IN SECOND QUADRANT");
        } else if (x < 0 && y < 0) {
            System.out.println("POINT IS IN THIRD QUADRANT");
        } else if (x > 0 && y < 0) {
            System.out.println("POINT IS IN FOURTH QUADRANT");
        } else if (x == 0 && y == 0) {
            System.out.println("POINT IS AT ORIGIN");
        } else if (x == 0) {
            System.out.println("POINT IS ON Y AXIS");
        } else if (y == 0) {
            System.out.println("POINT IS ON X AXIS");
        }
    }
}
