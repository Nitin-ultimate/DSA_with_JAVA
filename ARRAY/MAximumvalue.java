import java.util.*;
public class MAximumvalue {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter elements of array: ");
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];  //can also use (int max = integer.MIN_VALUE) its value is -2147483648  
        for(int i=1; i<n; i++){
            if(arr[i]>max) {
                max = arr[i];
            }
            // instead of this if we can also use (max = Math.max(max.arr[i]);)
        }
        //second maximum value in an array
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] != max) {
                smax = Math.max(smax,arr[i]);
            }
        }
        System.out.println("Maximum number is "+max);
        System.out.println("Second Maximum number is "+smax);
    }
}