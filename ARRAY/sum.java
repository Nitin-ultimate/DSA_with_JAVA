
public class sum {
    public static void main(String args[])   {
        int [] arr = {81,17,95,31,100,60};
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements is: " + sum);
    }
}