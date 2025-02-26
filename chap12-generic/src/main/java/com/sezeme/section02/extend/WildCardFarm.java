package com.sezeme.section02.extend;

public class WildCardFarm {
    /* 타입 변수가 선언 된 RabbitFarm 객체를 생성할 때 보다 유연하게 wildcard를 활용해본다. */
    public void anyType(RabbitFarm<?> farm) {
        farm.getRabbit().cry();
    }

    /* 하한이나 상한을 설정 : 의미와 차이를 모르겠슴*/
    public void extendType(RabbitFarm<? super Bunny> farm) {
        farm.getRabbit().cry();
    }

    public void superType(RabbitFarm<? super Bunny> farm) {
        farm.getRabbit().cry();
    }
}
