public class MultiplicationOfMatrices {
    public static void main(String[] args) {
        int [][] a = {{1,2,1},{4,3,5}};
        int [][] b = {{1,2,0,1},{4,0,3,5},{6,5,4,7}};
        if(a[0].length != b.length) System.out.println("Multiplication not possible");
        
        else {
            int [][] c = new int[a.length][b[0].length];
            for(int i=0; i<c.length; i++){
                for(int j=0; j<c[0].length; j++){
                    for(int k=0; k<b.length; k++){
                        c[i][j] += a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
