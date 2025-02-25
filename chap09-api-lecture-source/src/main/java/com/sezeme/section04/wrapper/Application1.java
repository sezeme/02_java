package com.sezeme.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /* Wrapper 클래스 사용법을 이해할 수 있다. */
        int num = 128;
        /* Wrapper 클래스의 생성자는 1.9 버전부터 Deprecated 되었다. */
//        Integer num1 = new Integer(num);

        /* Boxing : int -> Integer */
        Integer num1 = Integer.valueOf(num);
        /* Auto Boxing */
        Integer num2 = num;

        /* UnBoxing : Integer -> int */
        int num3 = num1.intValue();
        /* Auto UnBoxing */
        int num4 = num1;

        /* Integer.valueOf() 메소드가 byte 범위의 숫자는 캐싱 처리 하고 있어
         num1 == num2 가 true가 나올 수 있다. */
        System.out.println(num1 == num2);   // Integer, Integer 주소 값 비교
        System.out.println(num2 == num3);   // Integer, int 값 비교
        System.out.println(num3 == num4);   // int, int 값 비교

        /* 인스턴스의 값 비교는 항상 equals() 메소드를 활용한다. */
        System.out.println(num1.equals(num2));

    }
}
