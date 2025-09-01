import java.util.Scanner;
// Write a java program to find the GCD(greatest common divisor) of two numbers using a loop.

public class AssignmentQ3 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        // int gcd = 1;
        // for(int i=1; i<=a && i<=b; i++){
        //     if(a%i==0 && b%i==0){
        //         gcd = i;
        //     }
        // }
        // System.out.print("Greatest common divisor is " +gcd);
        int gcd = 0;;
        while(a != b){
            if( a>b ){
                a = a - b;
            }
            if( b>a ){
                b= b - a;
            }
            gcd = a;
        }
        System.out.print("Greatest common divisor is " +gcd);
    }
}