package com.sezeme.section04.interfacesegregation.resolved;

public class AdvancedPrinter implements MultiFunctionPrinter {
    @Override
    public void fax() {
        System.out.println("최신식 프린터가 팩스를 전송합니다.");
    }

    @Override
    public void print() {
        System.out.println("최신식 프린터가 프린트합니다.");
    }

    @Override
    public void scan() {
        System.out.println("최신식 프린터가 스캔합니다.");
    }
}
