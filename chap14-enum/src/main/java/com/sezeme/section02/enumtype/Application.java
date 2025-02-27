package com.sezeme.section02.enumtype;

public class Application {
    public static void main(String[] args) {
        /* 열거형을 이용하여 상수 열거 패턴의 단점을 해결하는 것을 이해한다. */

        /* 1. 싱글톤 방식으로 구현되기 때문에 인스턴스의 생성이나 확장이 되지 않는다.
        * 2. 컴파일 수준의 타입 안정성을 높여준다.
        * FoodEnum 객체가 상수 개 만큼 하나씩만 만들어짐. 불변임!
        * 타입적으로 객체가 만들어지기 때문에 타입적으로도, 주소적으로도 같아야 같은 것.*/
        boolean isTrue = enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println("isTrue : " + isTrue);
//        enumTest(0,3);

        /* 3. 상수 이름을 문자열로 출력할 수 있다. */
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(FoodsEnum.MEAL_BUNGEOPPANG_SUSHI);
        System.out.println(FoodsEnum.MEAL_MINT_SEAWEED_SOUP);

        /* 4. 필요하다면 필드나 메소드를 추가할 수도 있다.
        * 단, 근본적으로 불변 객체이기 때문에 모든 필드는 final로 선언되어야 한다.
        * 클래스이기 때문에 toString 메소드를 오버라이딩 해서 변경할 수도 있다. */

        /* 5. 열거 타입 내에 선언 된 상수들을 순회할 수 있다. */
        for(FoodsEnum food : FoodsEnum.values()) {
            System.out.println("food : " + food);
        }














    }

    private static boolean enumTest(FoodsEnum foodsEnum1, Object foodsEnum2) {
        return foodsEnum1 == foodsEnum2;
    }
}
