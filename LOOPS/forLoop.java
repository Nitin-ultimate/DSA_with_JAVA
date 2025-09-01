import java.util.Scanner;
public class forLoop{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            System.out.println("Hello World");
        }


        // Print 1 to 100 numbers 
        // for(int i=1; i<=100; i++) {
        //     System.out.println(i);
        // }

        //Print even numbers between 1 to 100
        // for(int i=1; i<=100; i++) {
        //     if(i %2 == 0) {
        //         System.out.println(i);
        //     }
        // }


        //Print all number from 1 to 100 which are either divisible by 5 or 3..
        // for(int i=1; i<=100; i++) {
        //     if(i%3 == 0 || i%5 == 0) {
        //         System.out.println(i);
        //     }
        // }

        //Print table of 19
        // for(int i=19; i<=190; i++) { 170round almost
        //     if(i%19 == 0) {
        //         System.out.println(i);
        //     }
        // }
        // for(int i=19; i<=190; i+=19) {
        //     System.out.println(i);    }10 rounds only This code is better than the upper code
    }
}
