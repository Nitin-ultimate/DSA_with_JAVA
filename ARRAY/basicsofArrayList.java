import java.util.ArrayList;
public class basicsofArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6); 
        // 6 is not size of arraylist like array its the capacity which can change
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);

        // System.out.println(arr.size());    
        System.out.println(arr);  // print arraylist {method 1}
            // for(int i=0; i<=5; i++) {
            //     // In arraylist you can use arr.size() for size 
            //     System.out.print(arr.get(i)+" "); // arr[i] {method 2}
            // }
        arr.set(2,300); //modify any index
        System.out.println(arr);
        arr.add(90); //push back or add in last of array
            //System.out.println(arr.size());
        System.out.println(arr);   

        arr.remove(3); //index 3 will be removed from arraylist 
        System.out.println(arr);
    }
}