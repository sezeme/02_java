package com.sezeme.section03.behavior.subsection01.observer;

import java.util.ArrayList;
import java.util.List;

// 옵서버 인터페이스 (구독자)
interface Observer {
    void update(String message);
}

// 구독자(Subscriber) 클래스 - 알림을 받는 객체
class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "이(가) 알림을 받음: " + message);
    }
}

// 발행자(Publisher) 클래스 - 구독자들에게 메시지를 전달하는 객체
class Publisher {
    private List<Observer> observers = new ArrayList<>();

    // 옵서버(구독자) 등록
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    // 옵서버(구독자) 해지
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    // 옵서버들에게 메시지 전달
    public void notifyObservers(String message) {
        System.out.println("모든 구독자에게 알림 전송: " + message);
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// 클라이언트 코드 (옵서버 패턴 테스트)
public class ObserverPatternExample {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Observer user1 = new Subscriber("사용자1");
        Observer user2 = new Subscriber("사용자2");
        Observer user3 = new Subscriber("사용자3");

        // 구독자 등록
        publisher.subscribe(user1);
        publisher.subscribe(user2);

        // 첫 번째 알림 전송
        publisher.notifyObservers("새로운 업데이트가 도착했습니다!");

        System.out.println("----------------------");

        // 구독 취소 후 두 번째 알림 전송
        publisher.unsubscribe(user1);
        publisher.notifyObservers("중요한 보안 패치가 적용되었습니다!");
    }
}