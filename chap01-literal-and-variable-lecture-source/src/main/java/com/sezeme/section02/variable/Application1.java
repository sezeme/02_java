package com.sezeme.section02.variable;


public class Application1 {
    public static void main(String[] args) {
        /* 변수를 선언하고 값을 대입하여 사용할 수 있다. */

        /* 변수 선언 */
        /* 선언 방법 : 자료형 변수명; */

        /* 정수형 */
        byte bnum;
        short snum;
        int inum;
        long lnum;

        /* 실수형 */
        float fnum;
        double dnum;

        /* 문자형 */
        char ch;

        /* 논리형 */
        boolean isTrue;

        /* 문자열은 기본 자료형이 아닌 참조 자료형임을 기억한다. */
        String str;

        /* 메소드 내부에 작성한 변수는 지역 변수(local variable)
         * 지역변수는 초기화 되지 않으면 사용할 수 없다. */
//        System.out.println(bnum);

        /* 변수에 값 대입 (처음 대입하는 것을 초기화 한다고 한다.) */
        bnum = 1;
        snum = 2;
        inum = 4;
        lnum = 8L;
        fnum = 4.0f;
        dnum = 8.0d;
        ch = 'a';
        ch = 98;
        isTrue = true;
        isTrue = false;
        str = "hello";

        /* 변수 사용 (대입 된 값을 출력 확인) */
        System.out.println(bnum);

        /* 선언과 동시에 초기화 */
        int point = 100;
        int bonus = 10;

        System.out.println("point = " + point);

        /* 대입연산자 왼쪽은 변수 공간, 대입연산자 오른쪽은 변수가 가진 값으로 해석 */
        point = point + 100;

        System.out.println("point = " + point);

    }
}