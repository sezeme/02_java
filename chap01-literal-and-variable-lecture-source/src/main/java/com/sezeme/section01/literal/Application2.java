package com.sezeme.section01.literal;

public class Application2 {
    public static void main(String[] args) {

        /* 값을 연산하여 출력할 수 있다.
         * 이 때, 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다.
         * */

        /* 1. 숫자와 숫자의 연산 */
        System.out.println("===== 정수와 정수 =====");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123 * 10);
        System.out.println(123 / 10);
        System.out.println(123 % 10);

        System.out.println("===== 실수와 실수 =====");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);            //약간의 오차가 생긴다

        System.out.println("===== 정수와 실수 =====");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);

        /* 2. 문자와 문자의 연산 */
        System.out.println("===== 문자와 문자 =====");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');

        System.out.println("===== 문자와 정수 =====");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("===== 문자와 실수 =====");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);

        /* 3. 문자열 리터럴의 연산 */
        System.out.println("===== 문자열과 문자열 ======");
        System.out.println("hello" + "world");
//        System.out.println("hello" - "world");			//에러 발생
//        System.out.println("hello" * "world");			//에러 발생
//        System.out.println("hello" / "world");			//에러 발생
//        System.out.println("hello" % "world");			//에러 발생

        System.out.println("===== 문자열과 다른 리터럴 =====");
        System.out.println("helloworld" + 123);
        System.out.println("helloworld" + 123.456);
        System.out.println("helloworld" + 'a');
        System.out.println("helloworld" + true);
        System.out.println("123" + "456");

        /* 4. 논리 값의 연산 */
        /* 내부적으로는 숫자로 처리 되지만 연산자 사용은 불가능 하다. */
//        System.out.println(true + false);				//에러 발생
//        System.out.println(true - false);				//에러 발생
//        System.out.println(true * false);				//에러 발생
//        System.out.println(true / false);				//에러 발생
//        System.out.println(true % false);				//에러 발생
//
//        System.out.println(true + 1);				//에러 발생
//        System.out.println(true - 1);				//에러 발생
//        System.out.println(true * 1);				//에러 발생
//        System.out.println(true / 2);				//에러 발생
//        System.out.println(true % 2);				//에러 발생













    }
}