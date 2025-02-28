package com.sezeme.section03.references;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Application1 {
    public static void main(String[] args) {
        /* 메소드 참조에 대해 이해하고 사용할 수 있다.
        *
        * 람다식이 작성되는 자리에!!
        * 함수형 인터페이스의 형태와 일치했을 경우 메소드 참조의 형태로 할 수 있음.
        * 클래스이름::메소드이름
        * 참조변수이름::메소드이름
        * */
        BiFunction<String, String, Boolean> biFunction;
        String str1 = "METHOD";
        String str2 = "METHO";

        /* 람다식 사용 버전 */
        biFunction = (x, y) -> x.equals(y);
        boolean result = biFunction.apply(str1, str2);
        System.out.println("result : " + result);

        /* 메서드 참조 버전 */
        biFunction = String::equals;
        result = biFunction.apply(str1, str2);
        System.out.println("result : "  + result);

        /* 람다식 버전 */
        Predicate<String> isEqualsToSample;
        String sample = "hello world";
        isEqualsToSample = s -> s.equals(sample);
        result = isEqualsToSample.test("hello world");
        System.out.println("result : " + result);

        /* 메소드 참조 버전 */
        isEqualsToSample = sample::equals;
        result = isEqualsToSample.test("hello world");
        System.out.println("result : " + result);



    }
}
