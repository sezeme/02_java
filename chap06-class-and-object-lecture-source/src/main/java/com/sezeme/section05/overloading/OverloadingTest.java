package com.sezeme.section05.overloading;

public class OverloadingTest {
    /* 오버로딩 : 같은 클래스 내에서 같은 이름의 메소드를 매개변수부만 다르게 하여 정의하는 것
     * 사용 이유 : 매개 변수의 종류 별로 메소드 내용은 다르게 작성해야 하는 경우
     * 동일 기능의 메소드를 매개 변수에 따라 다른 이름을 붙이면 관리가 어려워 지기 때문
     * EX) System.out.println()
     * */

    public static void main(String[] args) {
        System.out.println();
    }

    public void test(){}

    /* 메소드 시그니처가 동일하면 컴파일 에러가 발생한다.
     * 메소드 시그니처란 메소드명과 파라미터 선언부를 의미한다.
     * 접근제한자, 반환형은 오버로딩 성립 요건에 해당하지 않는다.*/
//    public void test(){}
//    private void test(){}
//    private int test(){}

    /* 매개변수 이름은 오버로딩과 무관하다. */
    public void test(int num) {}
//    public void test(int num2) {}

    /* 매개변수의 타입, 갯수, 순서가 다르면 오버로딩이 성립한다. */
    public int test(int num1, int num2){ return num1; }
    public void test(String str, int num){}
    public void test(int num, String str){}
}
