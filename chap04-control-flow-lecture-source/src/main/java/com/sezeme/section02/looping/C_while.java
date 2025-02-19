package com.sezeme.section02.looping;

import java.util.Scanner;

public class C_while {
    public void testSimpleWhileStatement() {
        /* while 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        // 초기식
        int i = 0;

        while(i < 10) {   // 조건식
            System.out.println("출력 : " + i);
            // 증감식
            i++;
        }
    }

    public void testWhileExample() {
        /* 키보드로 문자열을 입력 받고 반복적으로 출력한다. (횟수 제한X)
         * 단, "exit"가 입력 되면 반복을 종료한다.
         * */
        Scanner sc = new Scanner(System.in);
        String input = "";

        while(!input.equals("exit")) {
            System.out.print("문자열 입력 : ");
            input =  sc.nextLine();
            System.out.println("입력 받은 값 : " + input);
        }
    }

    public void testSimpleDoWhileStatement() {
        /* do while 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */

        do {
            System.out.println("조건이 false여도 최초 한 번은 무조건 동작함");
        } while(false);

    }




















}