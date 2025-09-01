import java.util.Scanner;
public class Break {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //composite numbers: Which have more than 2 factors
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int flag = 0;
        for(int i=2; i<=n-1; i++) {
            if(n%i==0) {
                System.out.println("Composite number");
                flag = 1;
                break; // break statement will terminate the loop and exit from it
                //other it will print composite number for all factors of n
            }
    }
    if(n==1) {
        System.out.println("Neither prime nor composite number");
    }
    else if(flag == 0) {
        System.out.println("Prime number");
    }
}
}