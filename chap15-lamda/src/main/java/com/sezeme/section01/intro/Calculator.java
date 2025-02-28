package com.sezeme.section01.intro;

/* 함수형 인터페이스 : 내부에 하나의 추상 메소드가 선언 된 인터페이스로
 * 람다식의 타깃이 될 수 있다. */
@FunctionalInterface
public interface Calculator {

    int sumTwoNumber(int a, int b);

//    int minusTwoNumber(int a, int b);
}