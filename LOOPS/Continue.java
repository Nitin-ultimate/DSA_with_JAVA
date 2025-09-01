import java.util.Scanner;
public class Continue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                continue;
                //continue statement will skip the current iteration and continue to the next iteration
                //if we put continue in the last line of loop then it will not affect the loop
            }
            System.out.println(i);// when i%2 = 0 then it will not print the number
        }
    }
}