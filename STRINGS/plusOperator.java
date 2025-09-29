import java.util.Scanner;

public class plusOperator {
    public static void main(String[] args) {
        // String s="abc";
        // String b="def";
        // s = s + b;
        // s = s + 10;
        // System.out.println(s);
        // System.out.println("abc"+10+20);
        // System.out.println(10+20+"abc"); // LEFT TO RIGHT 30ABC

        //  CONVERT INT TO STRING

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        s += n;
        System.out.println(s);
    }
}
