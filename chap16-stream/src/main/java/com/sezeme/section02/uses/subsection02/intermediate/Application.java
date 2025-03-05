package com.sezeme.section02.uses.subsection02.intermediate;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        /* 스트림의 중간 연산, 중계 연산 중 하나인 filter에 대해 이해하고 사용할 수 있다. */
        /* filter : 스트림에서 특정 데이터만 걸러내는 메소드로 매개변수로 Predicate 타입이
        * 선언 되어 있다. (매개변수를 받아 boolean 타입을 반환 */
        IntStream intStream = IntStream.range(0,10);
        intStream.filter(i -> i%2 == 0).forEach(System.out::println);
    }
}
