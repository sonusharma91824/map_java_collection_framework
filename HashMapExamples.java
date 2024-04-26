package map;

import java.util.*;

public class HashMapExamples {
    public static void main(String[] args) {
        HashMap<Integer,String> hs = new HashMap<>();
        hs.put(1,"a");
        hs.put(2,"b");
        hs.put(3,"c");
        hs.put(4,"d");
        hs.put(5,"e");
        hs.put(6,"f");

         System.out.println(hs);

        Set s = hs.keySet();
        System.out.println(s);

        Collection c = hs.values();
        System.out.println(c);


        for(Map.Entry<Integer, String> obj : hs.entrySet()){
            System.out.println(obj.getKey() + "," + obj.getValue());

        }


        }


    }

