package com.sezeme.section02.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Application1 {
    public static void main(String[] args) {
        /* HashSet */
        HashSet<String> hset = new HashSet<>();
        /* 다형성을 적용하여 상위 인터페이스 타입을 사용할 수 있다. */
        Set<String> set = new HashSet<>();
        Collection<String> cset = new HashSet<>();

        hset.add(new String("java"));
        hset.add(new String("mysql"));
        hset.add(new String("jdbc"));
        hset.add(new String("html"));
        hset.add(new String("css"));
        hset.add(new String("java"));

        /* (1) 저장 순서가 유지되지 않음. hash 연산을 통해 저장 관리 되고 있음.
         * (2) 중복 값이 저장 되지 않음. 동일 객체 뿐만 아니라 동등 객체도 저장 되지 않음.
         * 이 때 재정의 된 hashCode와 equals 메소드가 활용 됨.*/
        System.out.println("hset : " + hset);

        /* 재정의 된 equals를 통해 포함 여부를 확인하고 있으므로 동등 객체가 있음을 확인 할 수 있음 */
        System.out.println(hset.contains(new String("html")));

        /* Set의 데이터를 순회하는 방법 */
        /* 1. 배열로 변경 */
        Object[] arr = hset.toArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(i + " : " + arr[i]);
        }

        /* 2. Iterable의 iterator 메소드 (반복자) */
        Iterator<String> iter = hset.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
            /* Iterator의 remove를 활용하면 순회하면서 제거할 수 있다. */
            iter.remove();
        }

        /* 3. 향상된 for문 */
        for(String str : hset) {
            System.out.println(str);
            /* 반복 순회 도중 remove 메소드를 사용하면
            java.util.ConcurrentModificationException 이 발생함. */
//            hset.remove(str);
        }





    }
}
