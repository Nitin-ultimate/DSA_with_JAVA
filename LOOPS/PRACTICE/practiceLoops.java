import java.util.Scanner;
public class practiceLoops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int count = 0;
    //  Number of digit in given number
        // while(n!=0){
        //      n /= 10;
        //     count++;
        // }
        // System.out.print(count);
               
    // Sum of digit of given number
        while(n!=0){
            int digit = n%10;
            count = count + digit;
            n = n / 10;
        }
        System.out.print(count);
    }
}