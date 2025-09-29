public class InBuilt {
    public static void main(String[] args) {
        String s = "Nitin Pratap";
        System.out.println(s.indexOf('i'));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));

        String a ="abc"; 
        String b ="abcggg";
        System.out.println(a.compareTo(b));
        
        System.out.println(s.contains("tin "));
        System.out.println(s.startsWith("nit"));

        // s.toLowerCase(); -> nothing will happen.
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase()); // this will not change the original string s.

        // a.concat(b); -> nothimg will happen.
        System.out.println(a.concat(b)); // Directly print or store in another string.
    }
}
