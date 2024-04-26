package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorInMap {
    public static void main(String[] args) {
        {
            Map<String, String> map = Map.of("s", "sonu", "b", "bonu", "c", "conu");
            Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> entry = it.next();
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());
            }
        }
        {

            Set<Integer> a =  Set.of(34,67,33,23,68,57);
            Iterator it = a.iterator();
            while (it.hasNext())
            {
                System.out.println(it.next());
            }
        }
    }
}
