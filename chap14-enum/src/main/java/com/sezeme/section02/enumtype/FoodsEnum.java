package com.sezeme.section02.enumtype;

public enum FoodsEnum {
    /* 내부적으로 작성 순서대로 0부터 값이 자동으로 부여된다.
    인스턴스가 선언된 상수 개 만큼 생긴다. 불변객체이다.
    * 그럼 아까랑 똑같이 중복 가능되는거 아니야? */
    MEAL_AN_BUTTER_KIMCHI_STEW(0),
    MEAL_MINT_SEAWEED_SOUP(1),
    MEAL_BUNGEOPPANG_SUSHI(2),
    DRINK_RADISH_KIMCHI_LATTE(3),
    DRINK_WOOLUCK_SMOOTHIE(3),
    DRINK_RAW_CUTTLEFISH_SHAKE(5);

    /* 추가적으로 추가할 수 있다. 새로운 불변객체 생성!*/
    private final int value;
    private final int var = 10;
    FoodsEnum(int value) {
        this.value = value;
    }

    // 애는 FINAL 아니야??
    public void printVar() {
        System.out.println("var : " + var);
    }


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
