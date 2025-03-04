package com.sezeme.section05.dependencyinversion.problems;

/* 의존성 역전 원칙(Dependency Inversion Principle) - 자식에게 의존하면 자식 때문에 휘둘려!
 * - 고수준 모듈은 저수준 모듈(구체적인 행위)에 의존해서는 안된다. 둘 다 추상화에 의존해야 한다.
 * - 추상화는 세부 사항에 의존해서는 안된다. 세부 사항이 추상화에 의존해야 한다.
* */

/* BadNotificationService가 구현 클래스인 BadEmailSender에 직접 의존하고 있어
 * 다른 메시지 발송 방식을 추가하거나 변경하기 어렵다.(추가 의존성 작성 및 별도 메소드 작성)
* */
public class Application {
    public static void main(String[] args) {
        BadNotificationService badService = new BadNotificationService();
        badService.sendNotification(1, "중요 공지사항입니다.");      // 1은 email
        badService.sendNotification(2, "중요 공지사항입니다.");      // 2는 SMS

    }
}
