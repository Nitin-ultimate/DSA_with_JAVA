import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        // String str = sc.next();  IF WE USE sc.next IT WILL ONLY TAKE ONE WORD
        String str = sc.nextLine(); // NOW IT WILL TAKE WHOLE SENTENCE
        System.out.println("hi "+str);
        System.out.println(str.charAt(3));
        int n = str.length();
        System.out.println(n);
    }
}
