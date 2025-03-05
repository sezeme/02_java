package com.sezeme.section04.interfacesegregation.problems;

/* 인터페이스 분리 원칙(Interface Segregation Principle) - 쓸데없는 규약은 싫어!
 *  - 클라이언트는 자신이 사용하지 않는 메소드에 의존하지 않아야 한다.
* */

/* OldMachine 인터페이스가 모든 기능(print, fax, scan)을 하나의 인터페이스에 정의하고 있어,
 * OldPrinter는 자신이 지원하지도 않는 fax, scan 기능도 구현해야만 한다.
* */
public class Application {
    public static void main(String[] args) {

        BadOldMachine oldPrinter = new BadOldPrinter();
        oldPrinter.print();
        oldPrinter.fax();       // 실제로는 지원하지 않는 기능1
        oldPrinter.scan();      // 실제로는 지원하지 않는 기능2
    }
}
