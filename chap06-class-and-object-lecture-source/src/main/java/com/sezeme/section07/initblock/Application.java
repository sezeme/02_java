package com.sezeme.section07.initblock;

public class Application {
    public static void main(String[] args) {
        /* 초기화 블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할 수 있다. */
        Product product = new Product();
        System.out.println(product.getInformation());

        Product product2 = new Product("대륙폰", 500000, "샤우미");
        System.out.println(product2.getInformation());
    }
}