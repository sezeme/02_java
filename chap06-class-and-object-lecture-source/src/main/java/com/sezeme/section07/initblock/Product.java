package com.sezeme.section07.initblock;

public class Product {
    /* 1. JVM 기본 값
     * 2. 명시적 초기화 */
    private String name = "갤럭시";
    private int price = 1000000;
    private static String brand = "삼송";

    /* 3. 초기화 블록 */
    /* 인스턴스 초기화 블록 */
    {
        name = "사이언";
        price = 800000;

        brand = "사과";
        System.out.println("인스턴스 초기화 블럭 동작함");
    }
    /* static 초기화 블록 */
    static {
        brand = "헬지";

//        name = "아이뽕";
//        price = 1500000;
        System.out.println("static 초기화 블럭 동작함");
    }

    /* 4. 생성자 초기화 */
    public Product() {
        System.out.println("기본 생성자 동작함");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 생성자 동작함");
    }

    public String getInformation () {
        return this.name + " " + this.price + " " + Product.brand;
    }
}