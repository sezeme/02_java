package com.sezeme.section02.uses.subsection03.terminal;

import javax.swing.text.html.Option;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림의 최종 연산 중 하나인 reduce에 대해 이해하고 사용할 수 있다.
        * 이전 연산에서 반환된 값이 다음 연산의 첫 번째 인자로 전달된다. */
        OptionalInt reduceParam =
                IntStream.rangeClosed(1,10)
                        .reduce((a, b) -> {
                            System.out.println("a : " + a + ",b : " + b);
//                            return Integer.sum(a, b);
                            return Integer.min(a, b);
                        });
        System.out.println("reduceParam : " + reduceParam);













    }
}
