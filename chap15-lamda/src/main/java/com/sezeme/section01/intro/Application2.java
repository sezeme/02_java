package com.sezeme.section01.intro;

public class Application2 {
    public static void main(String[] args) {
        /* 람다식 활용을 위한 내부 인터페이스 관리 기법 */
        OuterInterface.Sum sum = (x, y) -> x + y;
        OuterInterface.Minus minus = (x, y) -> x - y;
        OuterInterface.Multiple multiple = (x, y) -> x * y;
        OuterInterface.Divide divide = (x, y) -> x / y;

        System.out.println(sum.sumTwoNumber(10, 20));
        System.out.println(minus.minusTwoNumber(10, 20));
        System.out.println(multiple.multipleTwoNumber(10, 20));
        System.out.println(divide.divideTwoNumber(10, 20));


    }
}