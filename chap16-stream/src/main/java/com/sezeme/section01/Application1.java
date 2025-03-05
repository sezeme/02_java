package com.sezeme.section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(
                Arrays.asList("hello", "java", "stream")
        );

        /* 특정 요소를 착기 위해 istreator or */



        /* 위의 동작은 Stream을 활용하여 수행할 수 있다. */
        list.stream().filter("stream"::equals)
                .forEach(str -> System.out.println("걸러진 값 : " + str));
    }
}
