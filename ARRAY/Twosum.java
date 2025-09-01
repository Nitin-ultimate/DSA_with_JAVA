public  class Twosum {
    public static void main (String[] args) {
        int[] arr = {1,5,8,4,6,3,7,2};
        int x = 9;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] + arr[j] == x) {
                    System.out.println(arr[i]+" "+arr[j]);
                    break;
                }
            }
        }
    }
}