package com.sezeme.section04.interfacesegregation.problems;

public class BadOldPrinter implements BadOldMachine {
    @Override
    public void print() {
        System.out.println("문서를 힘겹게 인쇄합니다.");
    }

    @Override
    public void fax() {

        // fax 기능은 지원조차 되지 않아 구현 안함
    }

    @Override
    public void scan() {

        // scan 기능을 지원조차 되지 않아 구현 안함
    }
}
