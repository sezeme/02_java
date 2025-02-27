package com.sezeme.section03.grammar;

import java.util.EnumSet;

public class Application2 {
    public static void main(String[] args) {
        /* EnumSet을 활용하여 enum을 Set 자료 구조로 다룰 수 있다. */
        EnumSet<FoodsEnum> foods = EnumSet.allOf(FoodsEnum.class);
        for(FoodsEnum food : foods) {
            System.out.println(food.getName() + " : " + food.getValue());
        }

        /* 특정 상수 값만 Set에 추가 */
        EnumSet<FoodsEnum> foods2 = EnumSet.of(
                FoodsEnum.DRINK_WOOLUCK_SMOOTHIE, FoodsEnum.MEAL_BUNGEOPPANG_SUSHI
        );
        for(FoodsEnum food : foods2) {
            System.out.println(food.getName() + " : " + food.getValue());
        }

        /* 특정 상수 값만 제외하고 Set에 추가 */
        EnumSet<FoodsEnum> foods3 = EnumSet.complementOf(
                EnumSet.of(
                        FoodsEnum.DRINK_WOOLUCK_SMOOTHIE, FoodsEnum.MEAL_BUNGEOPPANG_SUSHI
                )
        );

        for(FoodsEnum food : foods3) {
            System.out.println(food.getName() + " : " + food.getValue());
        }









    }
}
