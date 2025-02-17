package com.sezeme.section01.literal;

public class Application1 {

    public static void main(String[] args){
        // 한 줄 주석
        /* 여러 줄 주석
        * 으로
        * 작성 가능하다. */

//      정수 리터럴
        System.out.println(123);
//      실수 리터럴
        System.out.println(1.23);

//      문자 리터럴
        System.out.println('a');
//        System.out.println('ab');
//        System.out.println('');
        System.out.println('1');

//        문자열 리터럴
        System.out.println("안녕하세요");		//문자열은 문자 여러 개가 나열된 형태를 말하며 쌍따옴표(double-quotation)으로 감싸주어야 한다.
        System.out.println("123");			    //정수 이지만 쌍따옴표로 감싸져있기 때문에 문자열로 보아야 한다.
        System.out.println("");				      //아무 값도 없는 빈 쌍따옴표도 문자열로 취급한다.
        System.out.println("a");			      //한 개의 문자도 쌍따옴표로 감싸면 문자열이다. (문자 a와는 다르다)


    }

}
