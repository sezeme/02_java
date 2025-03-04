package com.sezeme.section02.openclosed.resolved;

/* 카카오페이 결제라는 결제 방식의 구체적인 구현체 클래스 */
public class KakaoPayment implements Payment {
    @Override
    public void process() {
        System.out.println("카카오페이로 결제합니다.");
    }
}
