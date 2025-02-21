package com.sezeme.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        /* static 키워드에 대해 이해할 수 있다. */
        StaticFieldTest f1 = new StaticFieldTest();
        f1.increaseNonStaticCount();
        f1.increaseStaticCount();

        StaticFieldTest f2 = new StaticFieldTest();
        f2.increaseNonStaticCount();
        f2.increaseStaticCount();

        System.out.println(f2.getNonStaticCount());
        System.out.println(StaticFieldTest.getStaticCount());
    }
}