package com.sezeme.section3.copy;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 얕은 복사에 대해 이해할 수 있다. */

        /* 원본 배열 */
        int[] origin = {1, 2, 3, 4, 5};

        /* 얕은 복사 */
        int[] copy = origin;

        /* hashCode 확인 */
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

        origin[2] = 100;

        System.out.println(Arrays.toString(origin));
        System.out.println(Arrays.toString(copy));

    }
}