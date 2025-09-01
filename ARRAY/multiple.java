import java.util.Scanner;
public class multiple {
    public static void main (String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter no. of terms in array: ");
            int n = sc.nextInt();
            int [] arr = new int[n];
            int mltp = 1;
            System.out.print("Enter array: ");
            for(int i=0; i<=n-1; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0; i<=n-1; i++){
                mltp = mltp*arr[i];
            }
            System.out.print("multiple of array is " +mltp);
        }
        
    }
}