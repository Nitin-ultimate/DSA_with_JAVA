public class SortColor {
    public static void main(String args[]) {

        // METHOD 1 (TWO PASS)
         int[] arr = {0,0,2,1,1,2,0,1,2,0,0,1};
         int n = arr.length;
        // int zeroes = 0;
        // int ones = 0;
        // for(int i=0; i<n; i++){
        //     if(arr[i]==0){
        //     zeroes++;
        //     }
        //     if(arr[i]==1){
        //     ones++;
        //     }
        // }
        // for(int i=0; i<n; i++){
        // if(i<zeroes)arr[i] = 0;
        // else if(i<ones+zeroes)arr[i] = 1;
        // else arr[i] = 2;
        // }
       

        // METHOD 2 (ONE PASS)(DUTCH FLAG ALGORITHM)

        int mid =0, high = n-1, low = 0;
        while(mid<=high){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
         for(int i=0; i<n;i++)
        System.out.print(arr[i] +" ");

    }
}
