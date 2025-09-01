import java.util.Scanner;
public class threedigitno {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER: ");
        int num = sc.nextInt();
        // if (num > 99 && num < 1000)
        //     System.out.println("THREE DIGIT NUMBER");
        // else
        //     System.out.println("NOT A THREE DIGIT NUMBER"); 
        if(num>9999 && num<100000)
            System.out.println("FIVE DIGIT NUMBER");
        else
            System.out.println("NOT A FIVE DIGIT NUMBER");
    }
}