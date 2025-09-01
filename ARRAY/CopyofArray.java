
import java.util.Arrays;
public class CopyofArray{
    public static void main (String [] args) {
        int [] arr = {10,12,34,2,-12};
        for(int ele : arr){ 
            System.out.print(ele+" ");
        }
        System.out.println();

        // shallow copy
        int [] nums = arr;
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }  // output of this for loop- 10,12,34,2,-12
        System.out.println();
        nums[0] = 90;
        System.out.println(arr[0]); // output- 90 but arr[0] is 10
        // this is called shallow copy because here its not copying
        // arr elements into nums but giving arr also name of nums 
        //so when we print arr[0] its same as nums[0] which is upgraded to 90

        //deep copy
        int [] brr = Arrays.copyOf(arr,arr.length);
        brr[0] = 700;
        System.out.println(arr[0]);
        System.out.println(brr[0]);

        // another way of deep copy without builtin method
        int [] crr =  new int[arr.length];
        for(int i=0; i<arr.length; i++) {
            crr[i] = arr[i];
        }
    }
}