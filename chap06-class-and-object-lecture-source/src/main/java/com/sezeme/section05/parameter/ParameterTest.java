package com.sezeme.section05.parameter;

import java.util.Arrays;

public class ParameterTest {

    /* 1. 기본 자료형 */
    public void testPrimaryTypeParameter(int num) {
        num += 10;
        System.out.println("testPrimaryTypeParameter : " + num);
    }

    /* 2. 기본 자료형 배열 */
    public void testPrimaryTypeArrayParameter(int[] arr) {
        arr[0] = 100;
        System.out.println("testPrimaryTypeArrayParameter : " + arr[0]);
    }

    /* 3. 클래스 자료형 */
    public void testClassTypeParameter(Rectangle rectangle) {
        rectangle.setWidth(32.5);
        rectangle.setHeight(42.5);
        System.out.println("testClassTypeParameter : " + rectangle.getWidth()
                + " " + rectangle.getHeight());
    }

    /* 4. 가변 인자
     * 인자로 전달하는 값의 개수가 정해져 있지 않은 경우 활용한다.
     * 단, 몇 개 전달 될 지 알 수 없으므로 반드시 매개변수 목록의 마지막에 작성 되어야 한다.
     * */
    public void testVariableLengthArrayParameter(String name, String... hobby) {
        System.out.println("name : " + name);
        System.out.println("hobby.length : " + hobby.length);
        System.out.println("hobby : " + Arrays.toString(hobby));
    }













}