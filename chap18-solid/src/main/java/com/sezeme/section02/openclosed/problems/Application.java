package com.sezeme.section02.openclosed.problems;

/* 개방-폐쇄 원칙(Open-Closed Principle) - "기존 코드를 수정하며 확장되면 안돼"
 *  - 소프트웨어의 엔티티(클래스, 모듈, 함수 등)는 확장에 대해서는 열려 있어야 하지만, 변경에 대해서는
 *    닫혀 있어야 한다.
* */

/* 새로운 결제 수단을 추가할 때마다 직접 클래스를 수정해야 하므로 OCP를 위반한다.
* */
public class Application {
    public static void main(String[] args) {
        BadPaymentProcessor badProcessor = new BadPaymentProcessor();
        badProcessor.processPayment("credit");  // 신용카드 결제
        badProcessor.processPayment("kakao");   // 카카오페이 결제
    }
}
