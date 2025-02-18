package com.sezeme.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        /* and, or 연산의 특징 */

        /* 1. A && B 상황에서 A가 false이면 B를 실행하지 않는다.
         * => false가 나올 확률이 높은 조건을 앞에 배치하면 연산 횟수를 줄일 수 있다.
         * */
        int num1 = 10;
        int result1 = (false && ++num1 > 0) ? num1 : num1;
        System.out.println("&& 실행 확인 : " + num1);

        /* 2. A || B 상황에서 A의 결과가 true이면 B를 실행하지 않는다.
         * => true가 나올 확률이 높은 조건을 앞에 배치하면 연산 횟수를 줄일 수 있다.
         * */
        int num2 = 10;
        int result2 = (true || ++num2 > 0) ? num2 : num2;
        System.out.println("|| 실행 확인 : " + num2);

    }
}