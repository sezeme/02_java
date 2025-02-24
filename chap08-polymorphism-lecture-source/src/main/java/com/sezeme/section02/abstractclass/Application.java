package com.sezeme.section02.abstractclass;

public class Application {
    public static void main(String[] args) {
        /* 추상 클래스와 추상 메소드에 대해 이해할 수 있다. */

        /* 추상 클래스는 인스턴스화 불가 */
//        Product product = new Product();
        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);
        System.out.println(smartPhone instanceof Product);

        /* 다형성을 적용해서 추상 클래스를 레퍼런스 타입으로 사용할 수 있다. */
        Product product = new SmartPhone();
        /* 정적 바인딩 -> Product, 동적 바인딩 -> SmartPhone */
        product.abstMethod();

        /* 일반적인 메소드도 호출 가능 */
        product.nonStaticMethod();
        Product.staticMethod();

    }
}