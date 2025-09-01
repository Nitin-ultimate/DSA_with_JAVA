import java.util.Scanner;
public class ternary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num = sc.nextInt();
        // int result = (num % 2 == 0) ? 1 : 0;
        // System.out.println(result);
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);
        // System.out.println((num % 2 == 0) ? "Even" : "Odd");i
    }
}