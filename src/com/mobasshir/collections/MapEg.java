package com.mobasshir.collections;

import java.util.HashMap;
import java.util.Map;

public class MapEg {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Mobasshir", 1);
        map.put("Btech", 2);
        System.out.println(map);
        map.putIfAbsent("Mobasshir", 2);
        System.out.println(map);
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        for(String key: map.keySet()) {
            System.out.println(key);
        }
        for (Integer i : map.values()) {
            System.out.println(i);
        }
        System.out.println(map.get("Mobasshir"));
        System.out.println(map.getOrDefault("Mi", 0));
        System.out.println(map.containsKey("Btech"));
        System.out.println(map.containsValue(22));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map);
    }
}
