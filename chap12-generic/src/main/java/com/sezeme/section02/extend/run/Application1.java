package com.sezeme.section02.extend.run;

import com.sezeme.section02.extend.*;

public class Application1 {
    public static void main(String[] args) {
        /* 1. extends 키워드를 이용하여 특정 타입만 사용하도록 제네릭 범위를 제한할 수 있다. */

        /* Rabbit의 상위 타입이거나 관련 없는 타입을 통해 인스턴스를 생성하는 것은 불가능한다. */
//        RabbitFarm<Animal> farm1 = new RabbitFarm<>();
//        RabbitFarm<Mammal> farm2 = new RabbitFarm<>();
//        RabbitFarm<Snake> farm3 = new RabbitFarm<>();

        /* Rabbit 타입이거나 후손 타입으로 인스턴스를 생성할 수 있다. */
        RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

        farm1.setRabbit(new Rabbit());
        farm1.getRabbit().cry();

        farm2.setRabbit(new Bunny());
        farm2.getRabbit().cry();

        farm3.setRabbit(new DrunkenBunny());
        farm3.getRabbit().cry();
    }
}
