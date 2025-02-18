package com.sezeme.section03.math;

import java.util.Random;

public class Application2 {
    public static void main(String[] args) {
        /* 사용자 범위의 난수 발생 시키기 */

        /* 1. Math.random() */
        /* 0~9 범위의 랜덤 값 */
        int random1 = (int) (Math.random() * 10);
        /* 1~10 범위의 랜덤 값 */
        int random2 = (int) (Math.random() * 10) + 1;
        System.out.println("random1 : " + random1);
        System.out.println("random2 : " + random2);

        /* 2. Random 클래스 */
        Random random = new Random();
        /* 0~9 범위의 랜덤 값 */
        int random3 = random.nextInt(10);
        /* 1~10 범위의 랜덤 값 */
        int random4 = random.nextInt(10) + 1;
        System.out.println("random3 : " + random3);
        System.out.println("random4 : " + random4);
    }
}