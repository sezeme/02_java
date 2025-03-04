package com.sezeme.section04.interfacesegregation.resolved;

public class BasicPrinter implements PrintOnly {
    @Override
    public void print() {
        System.out.println("기본 프린터가 프린트를 합니다.");
    }
}
