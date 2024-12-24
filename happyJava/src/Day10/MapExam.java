package Day10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"kang");
        map.put(2,"kim");
        map.put(3,"hong");

        System.out.println(map);
        String value = map.get(3);
        System.out.println(value);

        Set<Integer> keys = map.keySet();

        Iterator<Integer> iter = keys.iterator();

        while(iter.hasNext()){
            Integer key = iter.next();
            String val = map.get(key);
            System.out.println(key+"::"+val);
        }
    }
}
