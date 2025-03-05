package com.sezeme.section02.openclosed.resolved;

/* 신용 카드 결제라는 결제 방식의 구체적인 구현체 클래스 */
public class CreditPayment implements Payment {
    @Override
    public void process() {
        System.out.println("신용카드로 결제합니다.");
    }
}
