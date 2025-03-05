package com.sezeme.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림 중계 연산 중 하나인 map에 대해 이해할 수 있다. */
        IntStream intStream = IntStream.range(0,9);
        intStream.filter(i -> i % 2 == 0).map(i -> i * 5).forEach(System.out::println);
    }
}
