package com.sezeme.section01.exception;

public class ExceptionTest {
    public void checkEnoughMoney(int price, int money) throws Exception {
        System.out.println("가지고 계신 돈은 " + money + "원 입니다.");

        if(money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다");
        } else {
            /* 강제로 예외를 발생시킨다. 예외가 발생 되면 예외 처리가 필요해진다.
             * 첫 번째 예외 처리 방법은 메소드 시그니처에 throws 구문을 작성하는 것이다.
             * => 예외에 대한 책임을 메소드 호출부로 위임하여 예외처리를 강제화 한다.
             * */
            throw new Exception();
        }

        System.out.println("즐거운 쇼핑 하세요~");
    }
}
