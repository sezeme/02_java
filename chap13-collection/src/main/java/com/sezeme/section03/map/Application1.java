package com.sezeme.section03.map;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* HashMap */
        HashMap map = new HashMap();

        /* 키와 값을 쌍으로 저장한다. */
        map.put("one", new Date());
        map.put(12, "red apple");
        map.put(33, 123);

        /* 순서는 따로 저장 되어있지 않다. */
        System.out.println(map);

        map.put(12, "yellow banana");
        map.put(9, "yellow banana");

        /* key 값은 중복 저장이 불가능하다. 다시 저장하면 새로운 value로 덮어쓰기 된다.
        * value 값은 중복 저장이 가능하다. */
        System.out.println(map);

        /* value는 key를 통해 가져온다. */
        System.out.println("key 9의 value : " + map.get(9));

        /* remove 시켜본다. */
        map.remove(9);
        System.out.println("map : " + map);

        /* 문자열 타입을 키, 값으로 하는 HashMap */
        HashMap<String, String> hmap = new HashMap<>();
//        hmap.put(11,22);
        hmap.put("one", "java");
        hmap.put("two", "mysql");
        hmap.put("three", "jdbc");
        hmap.put("four", "html");

        /* Map 타입의 순화 방법 */
        /* 1. keySet() :  key 순회 */
        Iterator<String> keyIter = hmap.keySet().iterator();
        while(keyIter.hasNext()) {
            String key = keyIter.next();
            String value = hmap.get(key);
            System.out.println(key + " = " + value);
        }

        for(String key : hmap.keySet()) {
            String value = hmap.get(key);
            System.out.println(key + " = " + value);
        }

        /* 2. Values() */
        Collection<String> values = hmap.values();
        Iterator<String> valueIter = values.iterator();
        while (valueIter.hasNext()) {
            System.out.println("value : " + valueIter.next());
        }

        for (String value : hmap.values()) {
            System.out.println("value : " + value);
        }


        /* 3. entrySet() */
        Set<Map.Entry<String, String>> set = hmap.entrySet();
        Iterator<Map.Entry<String, String >> setIter = set.iterator();
        while (setIter.hasNext()) {
            Map.Entry<String, String> entry = setIter.next();
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        for(Map.Entry<String, String> entry : hmap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }







    }
}
