package com.sezeme.section02.extend.run;

import com.sezeme.section02.extend.*;

public class Application3 {
    public static void main(String[] args) {
        WildCardFarm wc = new WildCardFarm();

        wc.anyType(new RabbitFarm<>(new Rabbit()));
        wc.anyType(new RabbitFarm<>(new Bunny()));
        wc.anyType(new RabbitFarm<>(new DrunkenBunny())); // 버니이거나 버니의 후손이거나

        /* 매개변수 타입이 바니이거나 바니 후손 토끼를 가진 토끼농장만 인자로 전달 가능 */
        wc.extendType(new RabbitFarm<>(new Rabbit()));
        wc.extendType(new RabbitFarm<>(new Bunny()));
        wc.extendType(new RabbitFarm<>(new DrunkenBunny()));

        /* 매개변수 타입이 바니이거나 바니 상위 타입의 토끼를 가진 토끼농장만 인자로 전달 가능 */
        wc.superType(new RabbitFarm<>(new Rabbit()));
        wc.superType(new RabbitFarm<>(new Bunny()));
        wc.superType(new RabbitFarm<Bunny>(new Bunny()));
        wc.superType(new RabbitFarm<>(new DrunkenBunny()));
//        wc.superType(new RabbitFarm<DrunkenBunny>(new DrunkenBunny())); // 명확하게 하위 타입일 시 걸림

    }
}
