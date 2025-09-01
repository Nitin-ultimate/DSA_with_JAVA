
public class ArraytoMethods {
    public static void main (String [] args) {
        int [] arr = {10,20,30,40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
    public static void change(int[] x) { //pass by reference arr and x are same they are just references
        x[0] = 90;
    }
}