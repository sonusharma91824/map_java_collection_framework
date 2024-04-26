package map;

import java.util.Map;

public class HashMapFindLargestString {
    public static void main(String[] args) {
        Map<Integer, String> map = Map.of(1,"khu",2,"khushi",3,"dhav");
//        String  largestString ="";
//        int maxiLength=0;
//
//      for(String m : map.values())
//      {
//          if(m.length() > maxiLength)
//             {
//                 maxiLength = m.length();
//                 largestString= m;
//
//             }
//      }
//
//        System.out.println(largestString);
//        System.out.println(maxiLength);
//
//


        System.out.println(map.values().stream().reduce((str,str1)-> str.length() > str1.length()?str:str1).orElse("something else"));
    }
}
