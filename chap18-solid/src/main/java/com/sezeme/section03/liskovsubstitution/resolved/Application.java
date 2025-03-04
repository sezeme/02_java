package com.sezeme.section03.liskovsubstitution.resolved;

/* Rectangle과 Square는 다른 부분이 많으니 별도의 타입으로 정의 하되,
* 공통적인 부분만 인터페이스를 통해 필요한 동작만 추상화하도록 한다. */
public class Application {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 10);
        System.out.println("직사각형의 넓이 : " + rectangle.getArea());

        Shape square = new Square(5);
        System.out.println("정사각형의 넓이 : " + square.getArea());
    }
}
