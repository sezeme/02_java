package com.sezeme.section03.behavior.subsection03.chainofresponsibility;

// 핸들러(Handler) 추상 클래스, 필드로 자기자신을 가지고있다. 포인터개념.
abstract class Handler {
    protected Handler next; // 다음 핸들러를 가리키는 참조

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(int level);
}

// 저레벨 요청을 처리하는 핸들러
class LowLevelHandler extends Handler {
    public void handleRequest(int level) {
        if (level == 1) {
            System.out.println("LowLevelHandler: 요청을 처리했습니다.");
        } else if (next != null) {
            System.out.println("LowLevelHandler: 다음 핸들러로 요청 전달");
            next.handleRequest(level);
        } else {
            System.out.println("LowLevelHandler: 요청을 처리할 핸들러 없음.");
        }
    }
}

// 중간 레벨 요청을 처리하는 핸들러
class MidLevelHandler extends Handler {
    public void handleRequest(int level) {
        if (level == 2) {
            System.out.println("MidLevelHandler: 요청을 처리했습니다.");
        } else if (next != null) {
            System.out.println("MidLevelHandler: 다음 핸들러로 요청 전달");
            next.handleRequest(level);
        } else {
            System.out.println("MidLevelHandler: 요청을 처리할 핸들러 없음.");
        }
    }
}

// 고레벨 요청을 처리하는 핸들러
class HighLevelHandler extends Handler {
    public void handleRequest(int level) {
        if (level >= 3) {
            System.out.println("HighLevelHandler: 요청을 처리했습니다.");
        } else if (next != null) {
            System.out.println("HighLevelHandler: 다음 핸들러로 요청 전달");
            next.handleRequest(level);
        } else {
            System.out.println("HighLevelHandler: 요청을 처리할 핸들러 없음.");
        }
    }
}

// 클라이언트 코드 (책임 연쇄 패턴 테스트)
public class ChainOfResponsibilityExample {
    public static void main(String[] args) {
        // 핸들러 체인 설정
        Handler low = new LowLevelHandler();
        Handler mid = new MidLevelHandler();
        Handler high = new HighLevelHandler();

        low.setNext(mid); // low -> mid
        mid.setNext(high); // mid -> high

        // 요청 테스트
        System.out.println("요청 Level 1:");
        low.handleRequest(1); // LowLevelHandler가 처리

        System.out.println("\n요청 Level 2:");
        low.handleRequest(2); // MidLevelHandler가 처리

        System.out.println("\n요청 Level 3:");
        low.handleRequest(3); // HighLevelHandler가 처리

        System.out.println("\n요청 Level 4:");
        low.handleRequest(4); // HighLevelHandler가 처리
    }
}

