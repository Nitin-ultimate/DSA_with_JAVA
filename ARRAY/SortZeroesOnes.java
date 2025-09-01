
public class SortZeroesOnes{
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,0,1,0,0,0,1,1};
        int n = arr.length;

    //Method 1
        // int zeroes = 0;
        // for(int i=0; i<n; i++) {
        //     if(arr[i]==0) {
        //         zeroes++;
        //     }
        // }    
        // int ones = n-zeroes;
        // for(int i=0; i<zeroes; i++) {
        //     arr[i] =0;
        // }
        // for(int i=zeroes; i<n; i++) {
        //     arr[i] =1;
        // }
        // for(int ele : arr) {
        //     System.out.print(ele+" ");
        // }

    // Method 2
        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]==0) 
                i++;
            if(arr[j]==1)
                j--;
            if(i<j && arr[i]==1 && arr[j]==0){
                // int temp=arr[i];
                // arr[i]=arr[j];
                // arr[j]=temp;
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for(int ele : arr) {
            System.out.print(ele+" ");
        }
    } 
}