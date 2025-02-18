package com.sezeme.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* java.util.Scanner 를 이용한 다양한 자료형 입력 받기 */
        /* 1. Scanner 객체 생성 */
        Scanner scanner = new Scanner(System.in);

        /* 2. 자료형 별 값 입력 받기 */
        /* 2-1. 문자열 */
        System.out.print("이름 입력 : ");
        String name = scanner.nextLine();
        System.out.println("name : " + name);

        /* 2-2. 정수
         * 숫자가 아닌 값을 입력하거나 int 범위를 넘어가는 정수를 입력하게 되면
         * java.util.InputMismatchException 이 발생한다. (런타임 에러) */
        System.out.print("나이 입력 : ");
        int age = scanner.nextInt();
        System.out.println("age : " + age);

        /* 2-3. 실수
         * 정수 값은 입력 가능하지만 숫자가 아닌 값을 입력하면
         * java.util.InputMismatchException 이 발생한다. (런타임 에러) */
        System.out.print("키 입력 : ");
        double height = scanner.nextDouble();
        System.out.println("height : " + height);

        /* 2-4. 논리값 입력
         * true or false 이외의 값은 java.util.InputMismatchException 발생 */
        System.out.print("참과 거짓 중 하나를 true or false로 입력 : ");
        boolean isTrue = scanner.nextBoolean();
        System.out.println("isTrue : " + isTrue);

        /* 2-5. 문자
         * 문자만 입력받는 메소드는 Scanner 에서 제공하지 않으므로
         * String 에서 제공하는 charAt(index) 메소드를 통해 문자를 분리해서 활용할 수 있다.
         * 문자열의 길이 범위를 넘어가는 index를 전달할 경우
         * java.lang.StringIndexOutOfBoundsException 이 발생할 수 있다.
         * */
        System.out.print("아무 문자나 입력 : ");
        char ch = scanner.nextLine().charAt(5);
        System.out.print("ch : " + ch);



    }
}