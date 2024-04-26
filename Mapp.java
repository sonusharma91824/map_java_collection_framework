package map;

import java.util.*;
import java.util.Set;


public class Mapp {
    public static void main(String[] args) {
        HashMap mp = new HashMap();
        mp.put(4, 6);
        mp.put(2, 6);
        mp.put(8, 2);

        {
            System.out.println(mp);   //{2=6, 4=6, 8=2}
        }


        HashMap mp1 = new HashMap();
        mp1.put(8, 4);
        mp1.put(0, 1);
        mp1.put(3, 7);
        mp1.put(4, 9);

        {
            System.out.println(mp1); // {0=1, 3=7, 4=9, 8=4}     }

            {
                System.out.println(mp.containsKey(3));
            }

            {
                System.out.println(mp.containsValue(4));
            }
            {
                mp.putAll(mp1);
                System.out.println(mp); // {0=1, 2=6, 3=7, 4=9, 8=4}
            }
            {
                mp.keySet();
                System.out.println(mp);
            }
            {
                mp.values();
                System.out.println(mp);
            }

            {
                System.out.println(mp.get(4));
                System.out.println(mp);
            }
            {
                System.out.println(mp.remove(4, 9));
                System.out.println(mp);
            }
            {
                Set s = mp.keySet();
                System.out.println(s);
            }
            {
                Collection c = mp.values();
                System.out.println(c);
            }
            {
                Set s1= mp.entrySet();
                System.out.println(s1);
            }
            {
                //Iterator it = mp.entrySet().iterator();


            }
        }
    }
}

