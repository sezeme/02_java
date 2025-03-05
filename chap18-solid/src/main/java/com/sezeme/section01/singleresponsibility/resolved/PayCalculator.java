package com.sezeme.section01.singleresponsibility.resolved;

public class PayCalculator {
    public void calculatePay(Employee emp) {
        int pay = emp.getWorkingHours() * emp.getPayRate();
        System.out.println(emp.getName() + "의 급여는 " + pay + "원입니다.");
    }
}
