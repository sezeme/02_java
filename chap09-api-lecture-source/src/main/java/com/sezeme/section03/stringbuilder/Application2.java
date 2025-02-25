package com.sezeme.section03.stringbuilder;

public class Application2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        /* 용량(현재의 버퍼 크기)를 정수형으로 반환하며 문자열 길이 +16이 기본값 */
        System.out.println("sb.capacity() = " + sb.capacity());

        for(int i = 0; i < 50; i++) {
            /* 인자로 전달 된 값을 문자열로 변환 후 기존 문자열의 마지막에 추가한다. */
            sb.append(i);
            System.out.println("sb : " + sb);
            /* 용량이 부족해지면 2n + 2 씩 증가함 */
            System.out.println("sb.capacity() : " + sb.capacity());
            /* 처음부터 끝까지 동일한 인스턴스 주소 값을 가짐 */
            System.out.println("sb.hashCode() : " + sb.hashCode());
        }

        /* 문자열 가공에 사용 될 수 있는 추가 메소드 */
        StringBuilder sb2 = new StringBuilder("javaoracle");
        System.out.println("sb2 : " + sb2);

        System.out.println("delete : " + sb2.delete(2, 5));
        System.out.println("deleteCharAt : " + sb2.deleteCharAt(0));
        System.out.println("sb2 : " + sb2);

        System.out.println("insert : " + sb2.insert(1, "vao"));
        System.out.println("insert : " + sb2.insert(0, "j"));
        System.out.println("insert : " + sb2.insert(sb2.length(), "jdbc"));

        System.out.println("reverse : " + sb2.reverse());

    }
}