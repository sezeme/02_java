package com.sezeme.section01.method;

public class Application5 {

    public static void main(String[] args) {

        /* non-static 메소드 호출 */
        Application5 application5 = new Application5();
        System.out.println(application5.plus(10,20));

        /* static 메소드 호출 */
        System.out.println(Application5.plus(10,20));

        /* 동일 클래스 내에서 static 메소드 호출 시에는 클래스명 생략도 가능하다. */
        System.out.println(plus(10,20));
    }

    public static int plus(int a, int b){
        return a+b;
    }
    public static int minus(int a, int b){
        return a-b;
    }
}
