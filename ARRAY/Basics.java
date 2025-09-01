import java.util.*;
public class Basics{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
            // initialisation with declaration of size
         int [] arr =  new int[n];
            //initialise without declaring size
        //int [] arr = {1, 2, 3, 4, 5}; // size is automatically calculated,initialise in a single line and without index
            // initialising individual elements
        arr[0] = 48;
        arr[1] = 69;  
        arr[2] = 34;
        arr[3] = 78;
        arr[4] = 12;
            // output of an array element
        System.out.println(arr[0]);
            // update array elements
        arr[0] = 100;
        arr[0] +=20;
        System.out.println(arr[0]);

             // input -> loop
        for(int i=0; i<arr.length; i++){  // also use n-1 instead of arr.length  
            arr[i] = sc.nextInt();   // also put arr.length in a variable like (int n = arr.length);
        }
             // output -> loop
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}