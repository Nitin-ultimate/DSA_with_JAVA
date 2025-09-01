import java.util.Scanner;
//  Write a java program to print a multiplication table for a given number 'n'

public class AssignmentQ2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            int count = n*i;
            System.out.println(count);
        }
    }
}