// Absolute value of a number

import java.util.*;

public class absoluteno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num = sc.nextInt();
        if (num < 0)
            System.out.println("Absolute value: " + (-num));
        else
            System.out.println("Absolute value: " + num);
    }
    
}
