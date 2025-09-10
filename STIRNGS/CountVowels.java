import java.util.*;

public class CountVowels {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence : ");
        String str = sc.nextLine();
        int n = str.length();
        for(int i=0; i<n; i++){
            char c = str.charAt(i);
            if(isVowel(c)==true) count++;
        }
        System.out.println(count);
    }
    public static boolean isVowel(char ch){
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
    }
}