package com.sezeme.section03.interfaceimplements;

/* 인터페이스는 인터페이스를 상속할 수 있다. 이 때는 extends라는 키워드를 사용한다.
 * 클래스 extends 클래스 -> 단일 상속
 * 클래스 implements 인터페이스1, 인터페이스2, ... -> 다중 상속
 * 인터페이스 extends 인터페이스1, 인터페이스2, ... -> 다중 상속
 *  */
public class Product extends Object implements InterProduct, java.io.Serializable {
    /* InterProduct의 추상 메소드는 반드시 구현해야한다. */
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드");
    }

    /* static 메소드는 오버라이딩 할 수 없다. */
//    @Override
//    public static void staticMethod() {}

    /* default 키워드가 붙은 메소드는 오버라이딩이 강제화 되지 않고 선택적으로 가능하다. */
    @Override
    public void defaultMethod() {
        System.out.println("InterProduct의 defaultMethod 오버라이딩한 메소드");
    }
}