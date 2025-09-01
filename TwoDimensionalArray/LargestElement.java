public class LargestElement {
    public static void main(String[] args) {
        int [][] arr = {{3,14,5},{9,12,7}};
        int m = arr.length;
        int n = arr[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                // if(arr[i][j] > max){
                //     max = arr[i][j];
                // }
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.print(max);
    }
}
