package map;

import java.util.HashMap;

public class FindLargestStringInMap {
    public static void main(String[] args) {


        HashMap<Integer, String> hs = new HashMap<>();
        hs.put(1, "sonu");
        hs.put(2, "khushi");
        hs.put(3, "noinu");
        hs.put(4, "khuhuji");
        hs.put(5, "khush");
        
        String s1 = hs.values().stream().max((st1,st2)->Integer.compare(st1.length(),st2.length())).orElse("something wrong");
        System.out.println(s1);

        String s2= hs.values().stream().reduce((st1,st2)->st1.length()>st2.length()?st1:st2).orElse("something else");
        System.out.println(s2);

        // hs.values().stream().map( );
    }
}