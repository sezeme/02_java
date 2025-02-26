package com.sezeme.section02.extend.run;

import com.sezeme.section02.extend.Bunny;
import com.sezeme.section02.extend.MethodFarm;
import com.sezeme.section02.extend.Rabbit;
import com.sezeme.section02.extend.Snake;

public class Application2 {
    public static void main(String[] args) {
        /* 메소드 매개변수 제네릭 제약을 사요할 수 있다. */
        MethodFarm methodFarm = new MethodFarm();

        /*별도의 제약 없이 인자를 전달할 수 있다.*/
        methodFarm.animalType(new String("str"), new Bunny());
        methodFarm.animalType(new Snake(), new Snake());

        /* extends Mammal 의 제약이 적용된다. */
//        methodFarm.mammalType(new Snake());
        methodFarm.mammalType(new Rabbit());

        /* extends Reptile 의 제약이 적용된다. */
        methodFarm.reptileType(new Snake());
//        methodFarm.reptileType(new Rabbit());
    }
}
