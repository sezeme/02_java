package com.sezeme.section03.math;

public class Application1 {
    public static void main(String[] args) {
        /* Math 클래스에서 제공하는 static 메소드를 호출 할 수 있다. */
        /* import java.lang.*; 구문을 컴파일러가 자동으로 추가한다.
         * lang 패키지 하위에 있는 기능들이 기본적으로 많이 사용 되는 기능이기 때문이다. */

        /* 1. 절대값 */
        System.out.println(Math.abs(-7));

        /* 2. 최소값, 최대값 */
        System.out.println(Math.min(10, 5));
        System.out.println(Math.max(10, 5));

        /* 3. 난수 출력 */
        System.out.println(Math.random());
    }
}
