public class AddTwoMatrices {
    public static void main(String[] args) {
        int [][] arr = {{3,14,5},{9,12,9}};
        int [][] brr = {{3,14,5},{9,12,9}};
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
            arr[i][j]+=brr[i][j];
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
