package com.sezeme.section01.singleresponsibility.resolved;

public class TimeReporter {
    public void reportHours(Employee employee) {
        validateWorkingHours(employee);
        System.out.println(employee.getName() + "의 근무 시간을 보고합니다 : " + employee.getWorkingHours());
    }

    private void validateWorkingHours(Employee employee) {
        if(employee.getWorkingHours() > 52){
            System.out.println("경고 : 52시간을 초과하는 근무시간이 기록되었습니다.");
        }
    }
}
