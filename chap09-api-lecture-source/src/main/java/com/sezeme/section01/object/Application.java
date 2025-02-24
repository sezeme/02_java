package com.sezeme.section01.object;

public class Application {
    public static void main(String[] args) {
        /* Object 클래스의 주요 메소드를 오버라이딩 해서 사용할 수 있다. */

        Book b1 = new Book(1, "홍길동전", "허균", 50000);
        Book b2 = new Book(2, "목민심서", "정약용", 60000);
        Book b3 = new Book(3, "삼국사기", "김부식", 70000);

        /* Object의 toString 메소드는
         * 인스턴스 생성 시 사용한 full class name + @ + 16진수 해시코드 가 문자열로 반환되는 기능
         * Book의 toString 메소드는
         * 인스턴스의 필드 값을 문자열로 반환하는 기능으로 재작성
         */
        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
        /* 레퍼런스 변수를 출력하면 자동으로 toString() 메소드를 호출한다.
         * 이 점을 이용하여 toString() 메소드를 재정의해서 사용한다.
         * */
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Book b4 = new Book(4, "혼공자", "저자", 30000);
        Book b5 = new Book(4, "혼공자", "저자", 30000);

        /* 동일 객체 : 주소가 동일한 인스턴스
         *  동등 객체 : 주소가 다르더라도 필드 값이 동일한 인스턴스
         * Object의 hashCode(), equals() 는 동일 객체에 대한 판단을 할 수 있다.
         * Book의 재작성 된 메소드는 동등 객체에 대한 판단을 할 수 있다.
         * 같은 값을 가지는 동등 객체는 같은 해시코드 값을 가져야 한다
         * */
        System.out.println(b4.hashCode());
        System.out.println(b5.hashCode());

        System.out.println(b4 == b5);
        System.out.println(b4.equals(b5));







    }
}