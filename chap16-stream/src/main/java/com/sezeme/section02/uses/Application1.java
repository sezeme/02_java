package com.sezeme.section02.uses;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class Application1 {
    public static void main(String[] args) {
        /* OptionalInt : 결과 없음을 나타내는 명확한 요구가 있는 메소드의 반환 형식으로 사용 */
//        OptionalInt max = IntStream.rangeClosed(1,10).max();
//        OptionalInt min = IntStream.rangeClosed(1,10).min();
//
//        System.out.println("max : " + max);
//        System.out.println("max.getAsInt() : " + max.getAsInt());
//        System.out.println("min : " + min);
//        System.out.println("min.getAsInt() : " + min.getAsInt());
//
//        /* 중간 연산 이후 최종 연산 calculating */
//        int oddSum = IntStream.rangeClosed(1, 100)
//                .filter(i -> i % 2 == 0)
//                .sum();
//        System.out.println("oddSum : " + oddSum);
//
//        List<Integer> list = new ArrayList<>();
//        list.stream().mapToInt(i -> i).toArray();
//
//        TreeSet<Integer> tset = new TreeSet<>();
//        tset.toArray();









    }
}
