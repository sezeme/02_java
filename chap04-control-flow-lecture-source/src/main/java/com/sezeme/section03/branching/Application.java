package com.sezeme.section03.branching;

public class Application {
    public static void main(String[] args) {
        A_break a_break = new A_break();
//        a_break.testSimpleBreakStatement();
//        a_break.testSimpleBreakStatement2();
//        a_break.testJumpBreak();

        B_continue b_continue = new B_continue();
//        b_continue.testSimpleContinueStatement();
//        b_continue.testSimpleContinueStatement2();
        b_continue.testJumpContinue();
    }
}