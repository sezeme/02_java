package com.sezeme.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {
        /* 인터페이스에 대해 이해하고 활용할 수 있다. */

        /* 인터페이스는 인스턴스화 불가 */
//        InterProduct interProduct = new InterProduct();

        /* 다형성을 이용하여 레퍼런스 타입으로 사용 */
        InterProduct interProduct = new Product();

        /* 오버라이딩 된 메소드 호출 */
        interProduct.abstMethod();
        interProduct.nonStaticMethod();
        interProduct.defaultMethod();       // default라서 선택적으로 오버라이딩

        /* static 메소드 호출 */
        InterProduct.staticMethod();

        /* 상수 필드 확인 */
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);




    }
}