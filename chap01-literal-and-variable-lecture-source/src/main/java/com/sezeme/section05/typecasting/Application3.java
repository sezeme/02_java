package com.sezeme.section05.typecasting;

public class Application3 {
    public static void main(String[] args){
        /* int 미만의 자료형에서 주의할 점
         *  연산 결과가 무조건 int 타입으로 연산된다.*/
        byte byteNum1 = 1;
        byte byteNum2 = 2;
        int result = byteNum1 + byteNum2;

        short shortNum1 = 1;
        short shortNum2 = 2;
        int result2 = shortNum1 + shortNum2;
    }
}
