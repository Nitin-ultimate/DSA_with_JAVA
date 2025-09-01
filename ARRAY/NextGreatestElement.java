public class NextGreatestElement {
    public static void main(String[] args) {
        int [] a = {12,8,41,39,2,49,16,28,21};
        int n = a.length;
        int [] b = new int[n];
        b[n-1] = -1;
        // NESTED LOOP APROACH

        // for(int i=0; i<n-1;i++) {
        //     int max = Integer.MIN_VALUE;
        //     for(int j=i+1; j<n;j++){
        //         max = Math.max(max,a[j]);
        //     }
        //     b[i] = max;
        // }

        // method 2 (start from last)
        int nge = a[n-1];
        for(int i=n-2;i>=0;i--){
            b[i] = nge;
            nge = Math.max(nge,a[i]);
        }
        for(int ele : b){
            System.out.print(ele +" ");
        }
    }
}
