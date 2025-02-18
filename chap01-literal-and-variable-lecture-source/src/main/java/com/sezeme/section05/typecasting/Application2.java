package com.sezeme.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /* 강제 형변환의 규칙
        * 데이터 손실 가능성을 감안하고 강제 형변환을 해야함 */

        /* 정수끼리의 강제 형변환 */
        long lnum = 8;
        int inum = (int) lnum;  // 컴파일러가 데이터 손실 가능성을 컴파일 에러로 알림 -> 강제 형변환
        short snum = (short) inum;
        byte bnum = (byte) snum;

        /* 실수끼리의 강제 형변환 */
        double dnum = 8.0;
        float fnum = (float) dnum;

        /* 문자형을 int 미만의 자료형으로 형변환 할 경우 강제 형변환이 필요 */
        char ch = 'a';
        byte bnum2 = (byte) ch;
        short snum2 = (short) ch;

        /* 논리형은 강제 형변환의 규칙에서도 제외 된다. */
        boolean isTrue = true;
//        byte b = (byte) isTrue;

    }
}