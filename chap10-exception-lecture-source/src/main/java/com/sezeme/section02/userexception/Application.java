package com.sezeme.section02.userexception;

import com.sezeme.section02.userexception.exception.MoneyNegativeException;
import com.sezeme.section02.userexception.exception.NotEnoughMoneyException;
import com.sezeme.section02.userexception.exception.PriceNegativeException;

public class Application {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            // 정상 수행
            exceptionTest.checkEnoughMoney(30000, 50000);
            // 상품 가격이 음수
//            exceptionTest.checkEnoughMoney(-30000, 50000);
            // 가진 돈이 음수
//            exceptionTest.checkEnoughMoney(30000, -50000);
            // 상품 가격보다 가진 돈이 적은 경우
            exceptionTest.checkEnoughMoney(50000, 30000);
        } catch (PriceNegativeException | MoneyNegativeException | NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
