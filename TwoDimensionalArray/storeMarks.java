import java.util.*;
public class storeMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Students : ");
        int m = sc.nextInt();
        System.out.print("Enter number of credentials : ");
        int n = sc.nextInt();
        int [][] sheet = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                sheet[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(sheet[i][j]+" ");
            }
            System.out.println();
        }
    }
}
