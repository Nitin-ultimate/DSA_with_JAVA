import java.util.Scanner;
public class triangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST SIDE: ");
        int a = sc.nextInt();
        System.out.println("ENTER SECOND SIDE: ");
        int b = sc.nextInt();
        System.out.println("ENTER THIRD SIDE: ");
        int c = sc.nextInt();
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Its a Triangle");
        }
        else {
            System.out.println("not a triangle");
        }
    }
}