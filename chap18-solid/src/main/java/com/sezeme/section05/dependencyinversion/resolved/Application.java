package com.sezeme.section05.dependencyinversion.resolved;

/* NotificationService 가 추상화 된 MessageSender 인터페이스에 의존하고 있으며
* 구체적인 구현(EmailSender, SMSSender) 클래스는 이 인터페이스를 구현한다.
* 다른 발송 방식이 추가 되어도 NotificationService 클래스의 코드는 영향 받지 않는다.
* */
public class Application {
    public static void main(String[] args) {

        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();

        NotificationService ns1 = new NotificationService(emailSender);
        NotificationService ns2 = new NotificationService(smsSender);

        ns1.sendNotification("이메일로 공지 발송");
        ns2.sendNotification("sms로 공지 발송");


    }
}
