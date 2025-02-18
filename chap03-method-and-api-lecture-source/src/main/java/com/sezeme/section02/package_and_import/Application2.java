package com.sezeme.section02.package_and_import;

import com.sezeme.section01.method.Calculator;
import static com.sezeme.section01.method.Calculator.max;

public class Application2 {
    public static void main(String[] args) {
        /* 매번 풀 클래스명을 작성하기는 번거로우므로 패키지명을 생략하고 사용할 수 있도록
        import 구문을 제공하고 있다.
         import 구문은 package 선언과 class 선언 사이에 배치 된다.
         클래스명이 동일할 경우 ipmort 시 유의해서 올바른 클래스를 import 하도록 한다.
         */
        Calculator calculator = new Calculator();
        System.out.println(calculator.min(10,5));

        /* static 메소드의 경우 import static 구문을 활용해서 클래스명 생략하고 호출할 수 있다. */

        System.out.println(max(10,5));
        System.out.println(Calculator.max(10,5));
    }
}
