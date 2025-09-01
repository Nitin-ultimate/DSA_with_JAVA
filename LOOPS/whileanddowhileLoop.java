import java.util.Scanner;
public class whileanddowhileLoop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        // for(int i=0; i<=n; i++) {
        //     System.out.println("Hello World");
        // }

        // int i = 0;
        // while(i<n) {
        //     System.out.println("Hello World");
        //     i++;
        // }

        int i = 0;
        do{
            System.out.println("Hello World");
            i++;
        } while(i<n);
        //do while is used to execute atleast one iteration if initialised i is greater than the condition
        // do while loop is used to execute the loop at least once even if the condition is false.
        
    }
}