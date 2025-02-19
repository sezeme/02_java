package com.sezeme.section01.array;

public class Application2 {

    public static void main(String[] args) {
        /* 배열의 선언 : stack에 배열의 주소를 보관할 레퍼런스 변수 공간을 만드는 것 */
        int[] iarr;
        double[] darr;

        /* 선언한 레퍼런스 변수에 배열을 할당하여 대입할 수 있다.
         * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소 값을 반환한다.
         * 발생한 주소가 레퍼런스 변수(참조형 변수)에 저장 되고 이것을 참조하여 사용하기 때문에
         * 참조 자료형이라고 한다.*/
        iarr = new int[5];
        darr = new double[10];

        /* heap 영역은 이름으로 접근하지 않고 주소 값으로 접근하는 영역이다.
         * stack에 저장 된 주소로 heap에 할당 된 배열을 찾아갈 수 있다. */
        System.out.println("iarr : " + iarr);
        System.out.println("darr : " + darr);

        /* hashCode() : 객체의 주소 값을 10진수로 변환하여 생성한 객체의
         * 고유 정수값을 반환하는 메소드 */
        System.out.println("iarr.hashCode() : " + iarr.hashCode());
        System.out.println("darr.hashCode() : " + darr.hashCode());

        /* 배열의 길이를 알 수 있는 필드를 제공한다.
         * String 클래스는 메소드로 제공하여 length() 로 사용하는 점에 유의한다. */
        System.out.println("iarr.length : " + iarr.length);
        System.out.println("darr.length : " + darr.length);

        /* 한 번 지정한 배열의 길이는 변경할 수 없다.
         * 새로운 배열을 생성하여 그 주소 값을 레퍼런스 변수에 담는다.*/
        iarr = new int[100];
        System.out.println("수정 된 iarr.hashCode() : " + iarr.hashCode());
        System.out.println("수정 된 iarr.length : " + iarr.length);

        /* 레퍼런스 변수가 아무런 주소를 참조하지 않는 상태를 null 이라고 한다.
         * 100개 짜리의 배열이 더 이상 참조 되지 않으므로 GC(가비지 컬렉터)에 의해 제거 된다. */
        iarr = null;
        /* null 이라는 특수 값을 참조하고 있을 경우 참조 연산자 (.) 사용 시
         * java.lang.NullPointerException 이 발생한다. */
//        System.out.println("수정 된 iarr.hashCode() : " + iarr.hashCode());
//        System.out.println("수정 된 iarr.length : " + iarr.length);
    }
}