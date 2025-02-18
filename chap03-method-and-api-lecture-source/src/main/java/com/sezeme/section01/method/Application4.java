package com.sezeme.section01.method;

public class Application4 {
    public static void main(String[] args) {
        /* 메소드 리턴 값을 이해하고 활용할 수 있다. */
        Application4 application4 = new Application4();
        application4.testMethod();

        /* 메소드의 반환 값이 있을 경우 변수에 담는다. */
        String result = application4.testMethod();
        System.out.println("result : " + result);
        /* 또는 출력문에 바로 출력 할 수도 있다. */
        System.out.println(application4.testMethod());
    }

    /* String 타입의 값을 반환하는 메소드 선언 */
    public String testMethod() {
        return "hello world";
    }

    /* 반환 값이 없는 메소드 */
    public void testMethod2() {
        /* 컴파일러가 자동으로 메소드의 맨 끝에 return 구문을 추가하기 때문에
         * 명시적으로 작성할 필요가 없다.
         * 다만 필요에 의해서 작성 될 수도 있다. (조건문 사용 등)*/
        return;
        /* 명시적 return 구문 작성 시 명령문 작성 불가
         * 메소드는 종료 후 호출 했던 곳으로 돌아가게 된다. */
//        System.out.println("hello world");
    }


}