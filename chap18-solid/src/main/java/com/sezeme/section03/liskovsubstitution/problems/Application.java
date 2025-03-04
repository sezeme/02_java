package com.sezeme.section03.liskovsubstitution.problems;

/* 설명.
 *  리스코프 치환 원칙(Liskov Substitution Principle) - 따로 할껀 따로 하고 같이 할껀 같이 해서 서로 문제 되지 않게!
 *  - 상위 타입의 객체를 하위 타입의 객체로 치환해도 프로그램의 정확성이 깨지지 않아야 한다.
 *  - 하위 타입은 상위 타입의 규칙(규약)을 지켜야 한다.
* */

/* 자식 클래스의 객체가 부모 클래스에서 예상하지 못한 동작이 발생되면 LSP를 위반한 것이다.
 *  정사각형의 특성(가로=세로)으로 인해 Rectangle의 규약을 위반하게 된다.
 *  Rectangle의 사용자는 setWidth와 setHeight가 독립적으로 동작할 것이라 기대하지만,
 *  Square에서는 이 기대가 깨진다.
* */
public class Application {
    public static void main(String[] args) {
        System.out.println("직사각형 테스트");
        BadRectangle badRectangle = new BadRectangle();
        testRectangle(badRectangle);

        System.out.println("정사각형 테스트");
        BadRectangle badSquare = new BadSquare();
        testRectangle(badSquare);
    }

    /* Rectangle의 규칙(규약)은 따르지만 자식 클래스인 Square는 문제가 될 수 있는 메소드 */
    private static void testRectangle(BadRectangle badRectangle) {
        badRectangle.setWidth(5);
        badRectangle.setHeight(10);

        System.out.println("기대하는 넓이: 50");
        System.out.println("실제 넓이: " + badRectangle.getArea());
        System.out.println("width와 height가 독립적으로 각각 대입되어 동작 되었는지 확인: "
                            + (badRectangle.getArea() == 50? "성공": "실패"));
    }
}
