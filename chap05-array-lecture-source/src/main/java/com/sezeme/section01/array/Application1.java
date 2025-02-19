package com.sezeme.section01.array;

public class Application1 {
    public static void main(String[] args) {
        /* 배열의 선언 및 할당 */
        int[] arr = new int[5];

        /* 하나의 이름으로 관리되는 연속 된 메모리 공간이며, 해당 공간에 접근 시에는 인덱스를 사용한다. */
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        /* 인덱스를 반복문으로 처리할 수 있다. */
        for(int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
            System.out.println(arr[i]);
        }

        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("sum : " + sum);

        /* 향상 된 for 문
         * for(한 번의 반복문에서 사용 될 변수 : 반복을 수행할 배열) { }
         * 배열 인덱스에 담긴 값을 꺼내 int i 라는 변수로 옮겨 담아서 사용하는 맥락이므로
         * i 변수에 값을 대입하더라도 배열 인덱스의 값은 변경 되지 않는다.
         * 따라서 배열 인덱스의 값을 변경하고자 할 때는 사용할 수 없다.
         * */
        for(int i : arr) {
            System.out.println("i : " + i);
            i = 0;
        }

        for(int i : arr) {
            System.out.println("i : " + i);
        }





    }
}