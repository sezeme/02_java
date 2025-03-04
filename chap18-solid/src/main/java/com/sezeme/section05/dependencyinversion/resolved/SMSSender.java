package com.sezeme.section05.dependencyinversion.resolved;

public class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {

        System.out.println("SMS로 알림을 발송 : " + message);
    }
}
