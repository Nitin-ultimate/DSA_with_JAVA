import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target element: ");
        int x = sc.nextInt();
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter eleements of array: ");
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        int flag = 0;
        int i =0;
        while(i<n) {
            if(arr[i] == x){
            flag = 1;
            break;
            }
            i++;
        }
    if(flag==1){
        System.out.println("Element found at index " +i);
    } 
    else 
    System.out.println("Element not found");
    }
}
