import java.util.Scanner;
// Write a java program to calculate the sum of natural numbers up to a given positive integer 'n'
public class AssignmentQ1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i =0; i<=n; i++){
            sum += i;
        }
        System.out.print(sum);
    }
}