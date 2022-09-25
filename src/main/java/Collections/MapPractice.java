package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public Object findValueOf(Map map, Object key) {
        return map.get(key);
    }

    public Object[] findKeysOf(Map map, Object value) {
        Object[] keySet = map.keySet().toArray();
        ArrayList<Object> res = new ArrayList<>();

        for(int i = 0; i < keySet.length; i ++){
            if (map.get(keySet[i]) == value){
                res.add(keySet[i]);
            }
        }

        return res.toArray();
    }

    public Map<Integer, Integer> fibonacciTree(int size) {
        Map<Integer, Integer> res = new HashMap<>();

        if ( size == 0 ) return res;

        res.put(1, 1);
        if ( size == 1 ) return res;

        res.put(2, 1);
        if ( size == 2 ) return res;

        for(int i = 3; i <= size; i++){
            res.put(i, res.get(i - 2) + res.get(i - 1));
        }

        return res;
    }

    public Map<Integer, Integer> crazySpiral(Integer first, Integer second, Integer size) {
        Map<Integer, Integer> res = new HashMap<>();
        if ( size == 0 ) return res;

        res.put(1, first);
        if ( size == 1 ) return res;

        res.put(2, second);
        if ( size == 2 )  return res;

        for (int i = 3; i <= size; i++){
            res.put(i, res.get(i - 2) + res.get(i - 1));
        }

        return res;
    }
}
