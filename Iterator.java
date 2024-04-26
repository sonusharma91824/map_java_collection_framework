package map;

import java.util.HashMap;
import java.util.Optional;

public class Iterator {
    public static void main(String[] args) {
        HashMap<Integer,String> hs = new HashMap<>();
        hs.put(1,"sonu");
        hs.put(2,"khushi");
        hs.put(3,"noinu");
        hs.put(4,"khuhuji");
        hs.put(5,"khush");
        boolean seen = false;
        Integer acc = null;
        for (String s : hs.values()) {
            Integer length = s.length();
            if (!seen) {
                seen = true;
                acc = length;
            } else {
                acc = Integer.compare(acc, length);
            }
        }
    }

    }

