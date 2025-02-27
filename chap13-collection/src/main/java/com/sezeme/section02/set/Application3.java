package com.sezeme.section02.set;

import java.util.Set;
import java.util.TreeSet;

public class Application3 {
    public static void main(String[] args) {
        /* TreeSet */
        TreeSet<String> tset = new TreeSet<>();

        tset.add("java");
        tset.add("mysql");
        tset.add("jdbc");
        tset.add("html");
        tset.add("css");
        tset.add("java");

        /* 자동 오름차순 정렬을 하며 이진 트리의 형태로 요소를 저장하고 이씨다.
        * String 클래스에 iplements Comparable을 통해 compareTo 메소드가
        * 오버라이딩 되어 있는 기준으로 정렬 된다.
        * 중복 저장은 허용하지 않는다.
        * 삽입, 수정, 삭제 느림, 검색 빠름. */
        System.out.println("lhset : " +tset);

        /* 로또 번호 발생기 => 중복 허용 X. 숫자 정렬 */
        Set<Integer> lotto = new TreeSet<>();
        while(lotto.size() < 6) {
            lotto.add((int)(Math.random() * 45) + 1);
        }

        System.out.println(lotto);

    }

}
