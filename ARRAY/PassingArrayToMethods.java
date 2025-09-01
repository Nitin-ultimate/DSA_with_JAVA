public class PassingArrayToMethods {
    public static void main(String[] args) {
    //     int x = 5;
    //     System.out.print(x);
    //     change(x);
    //     System.out.print(x);
    // }
    // public static void change(int x){//this int x is different from upper int x both aare different
    //     x = 10;
    //here pass by value is working
    int [] arr = {10,20,30,40,50};
    System.out.println(arr[0]);
    change(arr);
    System.out.println(arr[0]);
    }
    public static void change(int[] x){
        x[0] = 90;
        // Arrays are passed by refference
    }
}
// when yu pass an aarray as an arguent to a method, In java refference variable gets passed.