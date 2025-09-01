import java.util.Scanner;   
public class ArithmaticPro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter n: ");
        // int n = sc.nextInt();
        //With formula
        // 1 3  5 7 9 11 13 15 17 19.....
        // for(int i=1; i<=(2*n)-1; i+=2) {
        //     System.out.println(i);
        // }
        // 4 7 10 13 16....
        // for(int i=4; i<=(3*n)+1; i+=3) { // use this ap formula [a+(n-1)d]
        //     System.out.println(i);
        // }


        //Universal code for any AP
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the common difference: ");
        int d = sc.nextInt();
        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++) {
            System.out.println(a);
            a = a+d;
        }
    }
}
