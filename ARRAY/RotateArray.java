import java.util.Scanner;

public class RotateArray {
    public static void swap(int[] arr, int i,int j) { 
        while(i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = {10,20,30,40,50,60,70};
            int n = arr.length;
            int k = sc.nextInt();
            k = k%n;

    //with another array
            // int[] brr = new int[n];
            // for(int i=n-k; i<n; i++) {
            //     brr[i-(n-k)] = arr[i] ;
            // }
            // for(int i=n-k-1; i>=0; i--) {
            //     arr[i+k] = arr[i];
            // }
            // for(int i=0; i<k; i++){
            //     arr[i] = brr[i];
            // }
            // for(int ele : arr) {
            // System.out.print(ele+" ");
            // }


   // WITHOUT ANOTHER ARRAY
   
   swap(arr, 0,n-k-1);
   swap(arr, n-k,n-1);
   swap(arr, 0,n-1);
   for(int ele : arr) {//brr for upper method
            System.out.print(ele+" ");
   }
        }
    }
}