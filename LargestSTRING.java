package map;

import java.util.HashMap;
import java.util.Map;

public class LargestSTRING {
    public static void main(String[] args) {
        // Sample HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "apple");
        hashMap.put(2, "banana");
        hashMap.put(3, "orange");
        hashMap.put(4, "grapefruit");
        hashMap.put(5, "watermelon");

        // Finding the largest string using Stream API
        String largestString = hashMap.values()
                .stream()
                .max((str1, str2) -> Integer.compare(str1.length(), str2.length()))
                .orElse(null);

        System.out.println("Largest string: " + largestString);
    }
}
