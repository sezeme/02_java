package com.sezeme.section03.grammar;

public enum FoodsEnum {
    /* 내부적으로 작성 순서대로 0부터 값이 자동으로 부여된다.
    * 생성자를 만들면 해당하는 값을 미리 매개변수로 넣어저야함.FoodsEnum */
    MEAL_AN_BUTTER_KIMCHI_STEW(0, "앙버터김치찜"),
    MEAL_MINT_SEAWEED_SOUP(1, "민트미역국"),
    MEAL_BUNGEOPPANG_SUSHI(2, "붕어빵초밥"),
    DRINK_RADISH_KIMCHI_LATTE(3, "열무김치라떼"),
    DRINK_WOOLUCK_SMOOTHIE(4, "우럭스무디"),
    DRINK_RAW_CUTTLEFISH_SHAKE(5, "생갈치쉐이크");

    /* 추가적으로 추가할 수 있다. 새로운 불변객체 생성!*/

    private final int value;
    private final String name;
    FoodsEnum(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
