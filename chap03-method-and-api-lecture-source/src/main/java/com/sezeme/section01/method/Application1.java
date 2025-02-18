package com.sezeme.section01.method;

public class Application1 {
    public static void main(String[] args) {
        /* 메소드의 호출 흐름에 대해 이해할 수 있다. */
        System.out.println("main 호출");

        /* 별도로 작성한 메소드를 호출한다. */
        Application1 application1 = new Application1();
        application1.methodA();
        application1.methodB();
        application1.methodC();
        application1.methodA(); // 재사용

        System.out.println("main 종료");
    }

    /* 별도의 메소드를 정의한다.
     * 접근제한자 반환형 메소드명 (매개변수) {} */
    public void methodA () {
        System.out.println("methodA 호출");
        System.out.println("methodA 종료");
    }

    public void methodB () {
        System.out.println("methodB 호출");
        System.out.println("methodB 종료");
    }

    public void methodC () {
        System.out.println("methodC 호출");
        System.out.println("methodC 종료");
    }
}