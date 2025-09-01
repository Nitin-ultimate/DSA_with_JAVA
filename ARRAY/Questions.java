
public class Questions{
    public static void main(String args[]) {
        // int[] a =  {31,56,78,67,89,76,4,32};
        // for(int i =0; i<a.length; i++) {   
        //     if (a[i]<35) {
        //     System.out.println(i + " ");
        //     }
        // }

        int [] a = {4,5,6,0,0,0};
        int [] b = {1,2,3};
        int m = 3, n = 3, i=0,j=0;
        while(i<m && j<n){
            if(a[i]<=b[j]){
                i++;
            }
            else if(b[j]<=a[i]){
                int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                j++;
            }
        }
        if(i==m){
            int temp=a[i];
                a[i]=b[j];
                b[j]=temp;
                j++;
                if(a[i]<b[j]){
                    i++;
                }
                else {
                    temp=a[i];
                    a[i]=b[j];
                    b[j]=temp;
                    j++;
                }
        }
        else if(j==n) ;
    }
}