package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMapWithForEach {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(3,4);
        map.put(5,6);
        map.put(7,8);
        map.put(9,10);
        System.out.println(map);
        {
            for (Map.Entry<Integer, Integer> it : map.entrySet()) {
                System.out.println(it.getKey() + "," + it.getValue());
            }
            Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
            while (it.hasNext())
            {
                Map.Entry<Integer,Integer> entry = it.next();
                System.out.println(entry.getKey() +","+ entry.getValue());
            }
            map.keySet().stream().forEach(System.out::println);

        }

        int cont=0;
        for(Map.Entry<Integer,Integer> f : map.entrySet())
        {
            cont++;
            if(cont==map.size())
            {
                System.out.println(f.getKey());
            }

        }



    }
}
