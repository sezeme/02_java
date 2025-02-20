package com.sezeme.section2.dimensional;

public class Application2 {
    public static void main(String[] args) {
        /* 2차원 가변 배열을 선언 및 할당하여 사용할 수 있다. */

        /* 가변 배열의 경우 각 인덱스별 1차원 배열을 따로 할당해야 한다. */
        int[][] iarr = new int[3][];

        System.out.println(iarr);           // stack의 레퍼런스 배열 참조 주소값
        System.out.println(iarr[0]);        // heap의 1차원 배열 참조 주소 값 (현재는 null)
//        System.out.println(iarr[0][0]);     // 존재하지 않으므로 NullPointerException

        iarr[0] = new int[3];
        iarr[1] = new int[2];
        int[] arr = new int[5];
        iarr[2] = arr;

        /* 가변 배열도 정변 배열에서 사용한 것과 동일한 반복문으로 순회할수 있다. */
        int value = 0;
        for(int i = 0; i < iarr.length; i++) {
            for(int j = 0; j < iarr[i].length; j++) {
                iarr[i][j] = value++;
                System.out.print(iarr[i][j] + " ");
            }
            System.out.println();
        }
    }
}