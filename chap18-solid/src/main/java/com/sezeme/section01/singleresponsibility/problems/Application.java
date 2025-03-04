package com.sezeme.section01.singleresponsibility.problems;

/* 단일 책임의 원칙(Single Responsibility Principle) - "책임이 너무 많거나 노출되면 안돼"
 *  - 한 클래스는 하나의 책임만 가져야 한다.
 *  - 클래스가 변경되어야 하는 이유는 오직 하나여야 한다.
 *  - 캡슐화를 통해 클래스의 책임을 명확히 하고 구현 세부사항을 숨긴다.
* */

/* 하나의 클래스(BadEmployee)가 너무 많은 책임을 가진 경우
 *  1. 직원의 급여 계산
 *  2. 데이터베이스 저장
 *  3. 근무시간 보고
 * */
public class Application {
    public static void main(String[] args) {
        BadEmployee badEmp = new BadEmployee();
        badEmp.calculatePay();
        badEmp.saveEmployee();
        badEmp.reportWorkingHours();
    }
}
