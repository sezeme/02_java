package com.sezeme.section05.dependencyinversion.problems;

public class BadNotificationService {
    
    /* 구현 클래스에 직접 의존 */
    /* 메시지 전송 방식이 추가되면 필드 및 메소드 안의 코드도 수정
     * 심지어 각 메시지 전송 방식에 따른 클래스들의 메시지 전송 메소드도
     * 메소드명이 규약으로 통일되어 있지 않다.
    * */
    private BadEmailSender emailSender = new BadEmailSender();
    private BadSMSSender smsSender = new BadSMSSender();

    public void sendNotification(int separate, String message) {
        if (separate == 1) emailSender.sendEmail(message);
        else if (separate == 2) smsSender.sendSMS(message);
    }
}
