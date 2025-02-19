package com.sezeme.section01.conditional;

public class Application {
    public static void main(String[] args) {
        A_if a_if = new A_if();
//        a_if.testSimpleIfStatement();
//        a_if.testNestedIfStatement();

        B_ifElse b_ifElse = new B_ifElse();
//        b_ifElse.testSimpleIfElseStatement();

        C_ifElseIf c_ifElseIf = new C_ifElseIf();
//        c_ifElseIf.testIfElseIfStatement();
//        c_ifElseIf.testNestedIfElseIfStatement();
//        c_ifElseIf.improveIfElseIfStatement();

        D_switch d_switch = new D_switch();
//        d_switch.testSimpleSwitchStatement();
        d_switch.improveSwitchStatement();
    }
}