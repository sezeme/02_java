package com.sezeme.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        /* 상수에 대해 이해하고 사용할 수 있다. */

        /* 상수 선언 */
        final int AGE;
        AGE = 18;               // 초기화
//        AGE = 19;             // 초기화 된 이후 재대입 불가

        /* 상수 명명 규칙
         * 소문자로 작성해도 오류는 없지만 변수와의 구분을 위해 대문자 사용 */
        final int age;

        /* 합성어의 경우 언더스코어 활용 */
        final int MAX_AGE = 100;
        final int MIN_AGE = 0;

    }
}