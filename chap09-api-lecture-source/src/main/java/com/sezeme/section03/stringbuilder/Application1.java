package com.sezeme.section03.stringbuilder;

public class Application1 {
    public static void main(String[] args) {
        /* StringBuilder 인스턴스 생성 */
        StringBuilder sb = new StringBuilder("java");
        /* toString이 오버라이딩 되어서 값을 출력하도록 작성 되어 있음 */
        System.out.println("sb = " + sb);
        /* Object의 hashCode() 값을 반환함 */
        System.out.println("sb.hashCode() : " + sb.hashCode());

        /* 문자열 수정 */
        sb.append("oracle");
        System.out.println("sb = " + sb);
        /* 기존의 인스턴스와 수정 후 인스턴스의 주소 값이 동일하다는 것은
         * 문자열을 수정해도 새로운 인스턴스가 생성 된 것이 아니라 기본 인스턴스가 수정 된 것 */
        System.out.println("sb.hashCode() : " + sb.hashCode());


        String s = "hello";
        System.out.println(s);
        System.out.println(System.identityHashCode(s));
        s += " world";
        System.out.println(s);
        System.out.println(System.identityHashCode(s));
    }
}