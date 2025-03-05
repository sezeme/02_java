package com.sezeme.section03.behavior.subsection02.strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// 전략 인터페이스 (결제 방법을 정의)
interface PaymentStrategy {
    void pay(int amount);
}

// 신용카드 결제 전략
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("신용카드로 " + amount + "원을 결제했습니다.");
    }
}

// 페이팔 결제 전략
class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("PayPal을 사용하여 " + amount + "원을 결제했습니다.");
    }
}

// 카카오페이 결제 전략 (새로운 전략 추가 가능)
class KakaoPayPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원을 결제했습니다.");
    }
}

// 결제 프로세서 (전략을 런타임에 변경 가능)
class PaymentProcessor {
    private PaymentStrategy strategy;

    // 생성자를 통해 초기 전략 설정
    public PaymentProcessor(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // 결제 전략 변경 가능
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // 결제 처리 (선택된 전략에 따라 다르게 동작)
    public void processPayment(int amount) {
        strategy.pay(amount);
    }
}

// 클라이언트 코드 (전략 패턴 테스트)
public class StrategyPatternExample {
    public static void main(String[] args) {
        // 신용카드 결제
        PaymentProcessor processor = new PaymentProcessor(new CreditCardPayment());
        processor.processPayment(10000);

        System.out.println("----------------------");

        // 페이팔 결제 (전략 변경)
        processor.setStrategy(new PayPalPayment());
        processor.processPayment(20000);

        System.out.println("----------------------");

        // 카카오페이 결제 (새로운 전략 추가 가능)
        processor.setStrategy(new KakaoPayPayment());
        processor.processPayment(30000);

        /* Java API 예시
        * Comparator를 활용한 sort 메소드 동작 */
        List<String> names = Arrays.asList("유관순", "홍길동", "강감찬");
        //오름차순 정렬
        names.sort(Comparator.naturalOrder());
        System.out.println("names : " + names);
        //오름차순 정렬
        names.sort(Comparator.reverseOrder());
        System.out.println("names : " + names);
    }
}