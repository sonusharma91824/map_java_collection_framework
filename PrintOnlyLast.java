package map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PrintOnlyLast {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "sonu");
        hashMap.put(2, "khushi");
        hashMap.put(3, "madhav");
        hashMap.put(4, "divya");
        hashMap.put(5, "varun");
int count=0;
        for (Map.Entry<Integer,String > entry:hashMap.entrySet())
        {
            count++;
            if(count%2!=0)
            {
                System.out.println(entry.getKey()+"  ,  "+entry.getValue());
            }
        }

    }}

