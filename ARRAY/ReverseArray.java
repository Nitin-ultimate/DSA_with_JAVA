
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,23,34,45,56,67,78};
        int n = arr.length;
        for(int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        //reverse without another string

        // int temp;
        // int n = arr.length;
        // for( int i=0; i<n/2; i++) {
        //     temp =  arr[i];
        //     arr[i] = arr[n-1-i];
        //     arr[n-1-i] = temp;
        // }

        //reverse with two pointers
        int i=0, j=n-1;
        while(i<=j) {
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}