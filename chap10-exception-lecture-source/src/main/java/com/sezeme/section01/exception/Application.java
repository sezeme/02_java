package com.sezeme.section01.exception;

public class Application {
    public static void main(String[] args) throws Exception {
        ExceptionTest exceptionTest = new ExceptionTest();
        /* 예외 처리가 강제화 된 메소드를 호출하는 경우 반드시 예외 처리가 필요하다.
         * 단, 여기서는 throws로 다시 책임을 메소드 호출부로 위임했다.
         * main 메소드에서도 throws를 사용하게 되면 프로세스는 비정상 종료되게 된다.
         * */
        exceptionTest.checkEnoughMoney(10000, 50000);
        exceptionTest.checkEnoughMoney(50000, 10000);
    }
}
