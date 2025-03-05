package com.sezeme.section05.dependencyinversion.problems;

public class BadEmailSender {
    public void sendEmail(String message) {
        System.out.println("이메일 발송: " + message);
    }
}
