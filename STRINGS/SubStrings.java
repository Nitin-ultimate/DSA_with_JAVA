public class SubStrings {
    public static void main(String[] args) {
        String s = "abcd";
        int n = s.length();
        System.out.println(s.substring(1));
        System.out.println(s.substring(1,3));

            // PRINT ALL SUBSTRINGS
        
        for(int i=0; i<n; i++){
            for(int j=i+1; j<=n; j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }
}
