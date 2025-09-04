import java.util.*;
public class TwoDArrayList {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
         a.add(10); a.add(20);
        List<Integer> b = new ArrayList<>(); 
        b.add(40); b.add(50); b.add(60);
        List<Integer> c = new ArrayList<>(); 
        List<Integer> d = new ArrayList<>();
        d.add(12); d.add(24);
        List<List<Integer>> l = new ArrayList<>();
        l.add(a); l.add(b); l.add(c); l.add(d);

                // METHOD 1 - DIRECT METHOD

        for(int i=0; i<l.size(); i++){
            System.out.print(l.get(i)+" ");
        }

                // METHOD 2 - BY GIVING INDEX

        System.out.println(l.get(1).get(2));

                // MEHTOD 3 - USING ANOTHER 1D ARRAYLIST

        for(int i=0; i<l.size(); i++){
            List<Integer> v = l.get(i);
            for(int j=0; j<v.size(); j++){
                System.out.print(v.get(j)+" ");
            }
            System.out.println();
        }

                //  WITHOUT USING ANOTHER ARRAYLIST

        for(int i=0; i<l.size(); i++){
            for(int j=0; j<l.get(i).size(); j++){
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
