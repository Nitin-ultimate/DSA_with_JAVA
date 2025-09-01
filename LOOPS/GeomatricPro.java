import java.util.Scanner;
public class GeomatricPro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the common ratio: ");
        int r = sc.nextInt();
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++) {
            System.out.println(a);
            a*= r;
        }   
    }
}