package com.sezeme.section01.intenum;

public class Application {
    public static void main(String[] args) {
        /* 정수 열거 패턴의 단점을 이해할 수 있다. */

        /* 1. 타입 안정성 보장 방법이 없어 디버깅이 어렵다. */
        int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEW;
        food = Foods.DRINK_RADISH_KIMCHI_LATTE;

        /* 두가지가 모두 상수 0이라는 값을 가지기 때문에 구분이 불가능하다.
        * 값이 변경되었지만 if문의 조건은 충족하여 출력이 된다. */
        if(food == Foods.MEAL_AN_BUTTER_KIMCHI_STEW) {
            System.out.println("식사 - 앙버터김치찜");
        }

        /* 2. 정수형 상수는 문자열로 출력하기 어렵다. */
        System.out.println(Foods.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(Foods.MEAL_BUNGEOPPANG_SUSHI);
        System.out.println(Foods.MEAL_MINT_SEAWEED_SOUP);

        /* 3. 정수 열거 그룹에 속한 모든 상수를 순회하는 방법도 쉽지 않다. */
        /* 4. 정수 열거 패턴으로 상수가 선언 된 경우 변경이 발새하면 재컴파일이 필요하다. */





    }
}
