package com.sezeme.section01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림의 병렬 처리에 대해 이해할 수 있다. */
        List<String> list = new ArrayList<>(
                Arrays.asList("java","mariadb","html","css","mybatis")
        );

        System.out.println("for each ===========");
        for(String s : list) {
            print(s);
        }

        System.out.println("normal stream ===========");
        list.stream().forEach(Application2::print);

        System.out.println("parallel stream ============");
        list.parallelStream().forEach(Application2::print);
        list.parallelStream().forEach(Application2::print);




    }

    private static void print(String str) {
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
