import java.util.*;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[3][3];
        // int [][] brr = new int[3][3];
        System.out.print("Enter the matrix : ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         brr[i][j] = arr[j][i];
        //     }
        // }

        // // COLUMN WISE PRINTING
        // for(int i=0; i<3; i++){
        //     for(int j=0; j<3; j++){
        //         System.out.print(brr[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        for(int j=0; j<3; j++){
        for(int i=0; i<3; i++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
        }
    }
}
