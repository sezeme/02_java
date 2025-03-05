package com.sezeme.section03.behavior.subsection07.mediator;

import java.util.ArrayList;
import java.util.List;

// 1. 중재자 인터페이스 (객체 간 메시지 전달 역할)
interface Mediator {
    void sendMessage(String message, Colleague sender);
    void addColleague(Colleague colleague);
}

// 2. 구체적인 중재자 클래스 (채팅방 역할)
class ChatMediator implements Mediator {
    private List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague sender) {
        for (Colleague colleague : colleagues) {
            if (colleague != sender) { // 보낸 사람 제외
                colleague.receive(message);
            }
        }
    }
}

// 3. 구성원(Colleague) 클래스 (사용자 역할)
class Colleague {
    private Mediator mediator;
    private String name;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
        mediator.addColleague(this); // 중재자에 등록
    }

    public void send(String message) {
        System.out.println(name + " 메시지를 보냄: " + message);
        mediator.sendMessage(message, this);
    }

    public void receive(String message) {
        System.out.println(name + " 메시지를 받음: " + message);
    }
}

// 4. 클라이언트 코드 (중재자 패턴 테스트)
public class MediatorPatternExample {
    public static void main(String[] args) {
        Mediator chatRoom = new ChatMediator();

        Colleague user1 = new Colleague("유관순", chatRoom);
        Colleague user2 = new Colleague("홍길동", chatRoom);
        Colleague user3 = new Colleague("신사임당", chatRoom);

        user1.send("안녕, 모두들!");
        System.out.println("----------------------");
        user2.send("안녕, 유관순!");
    }
}