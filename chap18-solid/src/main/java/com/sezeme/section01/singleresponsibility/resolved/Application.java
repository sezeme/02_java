package com.sezeme.section01.singleresponsibility.resolved;

/* 단일 책임의 원칙을 적용하려면 각각의 책임을 별도의 클래스로 분리하고,
* 각 클래스는 자신의 데이터와 연산을 캡슐화하여 관리하여야 한다.
* */
public class Application {
    public static void main(String[] args) {
        
        /* 이름, 근무시간, 시급이 설정 된 객체 생성 */
        Employee employee = new Employee("홍길동", 40, 25000);

        /* 급여 계산 */
        PayCalculator payCalculator = new PayCalculator();
        payCalculator.calculatePay(employee);

        /* 데이터베이스 저장 */
        EmployeeRepository employeeRepository = new EmployeeRepository();
        employeeRepository.save(employee);

        /* 근무 시간 보고 */
        TimeReporter timeReporter = new TimeReporter();
        timeReporter.reportHours(employee);

    }
}
