package com.sezeme.section04.comparison;

public class Application1 {
    public static void main(String[] args) {
        /* 비교 연산자를 사용할 수 있다. */

        /* 정수 값 비교 */
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("inum1과 inum2가 같은지 비교 : " + (inum1 == inum2));
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
        System.out.println("inum1이 inum2보다 큰지 비교 : " + (inum1 > inum2));
        System.out.println("inum1이 inum2보다 크거나 같은지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1이 inum2보다 작은지 비교 : " + (inum1 < inum2));
        System.out.println("inum1이 inum2보다 작은거나 같은지 비교 : " + (inum1 <= inum2));

        /* 실수 값 비교 */
        double dnum1 = 10.0;
        double dnum2 = 20.0;

        System.out.println("dnum1과 dnum2가 같은지 비교 : " + (dnum1 == dnum2));
        System.out.println("dnum1과 dnum2가 같지 않은지 비교 : " + (dnum1 != dnum2));
        System.out.println("dnum1이 dnum2보다 큰지 비교 : " + (dnum1 > dnum2));
        System.out.println("dnum1이 dnum2보다 크거나 같은지 비교 : " + (dnum1 >= dnum2));
        System.out.println("dnum1이 dnum2보다 작은지 비교 : " + (dnum1 < dnum2));
        System.out.println("dnum1이 dnum2보다 작은거나 같은지 비교 : " + (dnum1 <= dnum2));

        /* 문자 값 비교 */
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("ch1과 ch2가 같은지 비교 : " + (ch1 == ch2));
        System.out.println("ch1과 ch2가 같지 않은지 비교 : " + (ch1 != ch2));
        System.out.println("ch1이 ch2보다 큰지 비교 : " + (ch1 > ch2));
        System.out.println("ch1이 ch2보다 크거나 같은지 비교 : " + (ch1 >= ch2));
        System.out.println("ch1이 ch2보다 작은지 비교 : " + (ch1 < ch2));
        System.out.println("ch1이 ch2보다 작은거나 같은지 비교 : " + (ch1 <= ch2));

        /* 논리 값 비교 */
        /* ==과 !=은 비교 가능하지만 대소비교는 불가능하다. */
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("============== 논리값 비교 ===============");
        System.out.println("bool1과 bool2가 같은지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같지 않은지 비교 : " + (bool1 != bool2));
//        System.out.println("bool1이 bool2보다 큰지 비교 : " + (bool1 > bool2));
//        System.out.println("bool1이 bool2보다 크거나 같은지 비교 : " + (bool1 >= bool2));
//        System.out.println("bool1이 bool2보다 작은지 비교 : " + (bool1 < bool2));
//        System.out.println("bool1이 bool2보다 작은거나 같은지 비교 : " + (bool1 <= bool2));

        /* 문자열 비교 */
        /* 문자열도 ==과 !=은 비교 가능하지만 대소 비교는 불가능하다. */
        String str1 = "java";
        String str2 = "java";

        System.out.println("============== 문자값 비교 ===============");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == str2));
        System.out.println("str1과 str2가 같지 않은지 비교 : " + (str1 != str2));
        System.out.println("str1과 str2가 같은지 비교 : " + (str1.equals(str2)));
        System.out.println("str1과 str2가 같지 않은지 비교 : " + (!str1.equals(str2)));
//        System.out.println("str1이 str2보다 큰지 비교 : " + (str1 > str2));
//        System.out.println("str1이 str2보다 크거나 같은지 비교 : " + (str1 >= str2));
//        System.out.println("str1이 str2보다 작은지 비교 : " + (str1 < str2));
//        System.out.println("str1이 str2보다 작은거나 같은지 비교 : " + (str1 <= str2));

    }
}