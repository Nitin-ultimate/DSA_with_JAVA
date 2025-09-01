
import java.util.Arrays;
public class BuiltinMethods {
    public static void main (String [] args) {
        int [] arr = {10,12,34,2,-12};
        // for each loop, we use this when we dont need indexing
        for(int ele : arr){ // read as for each element in arr
            System.out.print(ele+" ");
        }

        //for sorted array
        Arrays.sort(arr);
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
