package com.sezeme.section04.overflow;

public class Application1 {
    public static void main(String[] args) {
        /* 오버 플로우에 대해 이해할 수 있다. */
        byte num1 = 127;
        System.out.println("num1 = " + num1);

        num1++; // 증감연산자 : 변수가 가지고 있는 값을 1 증가 시킴
        System.out.println("num1 = " + num1);

        /* 언더 플로우 */
        byte num2 = -128;
        System.out.println("num2 = " + num2);

        num2--;
        System.out.println("num2 = " + num2);

        /* 오버플로우나 언더플로우는 컴파일 에러를 발생 시키지는 않는다.
         * 최소~최대 값의 범위를 고려하여 자료형을 선정해야 이러한 오류가 발생하지 않는다. */
        int firstNum = 1000000;
        int secondNum = 700000;
        int multiNum = firstNum * secondNum;
        System.out.println("multiNum = " + multiNum);

        long multiNum2 = (long)firstNum * secondNum;
        System.out.println("multiNum2 = " + multiNum2);














    }
}