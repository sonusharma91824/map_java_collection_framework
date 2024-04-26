package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.HashMap.*;

public class HasgMap1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ranu");
        map.put(2, "sonush");

        Iterator<Entry<Integer, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

     //   for(Map.Entry<Integer, String> yu = map.entrySet()) {


            System.out.println(map.keySet() + "," + map.values());
        }


    }

