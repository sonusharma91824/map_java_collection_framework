package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTask {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        map.put(4,4);
        map.put(5,5);
        {
            for (HashMap.Entry<Integer, Integer> it : map.entrySet()) {
                //   System.out.println(map.keySet()+","+map.values());
                System.out.println(it.getKey());
            }
        }
        {
            Iterator<Map.Entry<Integer,Integer>> it1 = map.entrySet().iterator();
            {
                while (it1.hasNext()) {
                    System.out.println(it1.next());

                }
            }
        }
        {
             map.entrySet().stream().forEach(entry-> System.out.println(entry.getKey()+"="+entry.getValue()));
        }

    }}




