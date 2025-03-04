package com.sezeme.section05.dependencyinversion.resolved;

public class NotificationService {

    /* 구체적인 구현체가 아닌 추상화 된 인터페이스에 의존 */
    private final MessageSender messageSender;

    /* 의존 관계에 있는 객체를 생성자로 전달 (의존성 주입)
    * 하위 구현체는 매번 다를 수 있다. */
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        messageSender.sendMessage(message);
    }

}
