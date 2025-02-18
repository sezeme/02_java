package com.sezeme.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /* 논리 연산자를 활용할 수 있다. */

        /* 1. 1부터 100 사이의 값인지 확인 */
        int num = 150;
        System.out.println("1~100 사이의 값인지 확인 : " + (num >= 1 && num <= 100));

        /* 2. 특정 문자가 대문자인지 확인 */
        char ch = 'x';
        System.out.println("대문자인지 확인 : " + (ch >= 'A' && ch <= 'Z'));

        /* 3. 대소문자 상관 없이 y 인지 확인 */
        char ch2 = 'n';
        System.out.println("y인지 확인 : " + (ch2 == 'y' || ch2 == 'Y'));

        /* 4. 대소문자 상관 없이 영문자가 맞는지 확인 */
        char ch3 = 'x';
        System.out.println("영문자인지 확인 : "
                + ((ch3 >= 'A' && ch3 <= 'Z') || (ch3 >= 'a' && ch3 <= 'z')));

    }
}