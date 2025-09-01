import java.util.*;
public class twoDBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int [][] grid = new int[3][3];
        int m = grid.length; //no. of rows
        int n = grid[0].length; // no. of columns, columns in 0th row.
        // grid[0][0] = 2;
        // grid[0][1] = 6;
        // grid[0][2] = 9;
        // grid[1][0] = 4;
        // grid[1][1] = 56;

        // INPUT OF 2D ARRAY
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j] = sc.nextInt();
            }
        }
                // OUTPUT USING NESTED LOOPS
        for(int i=0;i<m;i++){ //rowa
            for(int j=0;j<n;j++){ //columns
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
