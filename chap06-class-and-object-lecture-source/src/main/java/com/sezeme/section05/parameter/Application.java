package com.sezeme.section05.parameter;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */
        /* 사용 가능 자료형 : 기본 자료형, 기본 자료형 배열,
         * 클래스 자료형, 클래스 자료형 배열, 가변 인자*/
        ParameterTest pt = new ParameterTest();

        /* 매개변수로 기본 자료형은 값(data)을 전달하고,
         * 참조 자료형은 주소 값(reference)를 전달한다. */
        int num = 0;
        pt.testPrimaryTypeParameter(num);
        System.out.println("main num : " + num);

        int[] arr = {1, 2, 3, 4, 5};
        pt.testPrimaryTypeArrayParameter(arr);
        System.out.println("main arr[0] : " + arr[0]);

        Rectangle r = new Rectangle(0, 0);
        pt.testClassTypeParameter(r);
        System.out.println("main rectangle : " + r.getWidth() + " " + r.getHeight());

        pt.testVariableLengthArrayParameter("홍길동", "코딩", "야구");
        pt.testVariableLengthArrayParameter("유관순", "테니스");
        pt.testVariableLengthArrayParameter("강감찬");
        pt.testVariableLengthArrayParameter("선덕여왕", new String[]{"축구", "영화감상"});
    }







}