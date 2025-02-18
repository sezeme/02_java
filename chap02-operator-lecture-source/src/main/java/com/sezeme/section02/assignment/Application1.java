package com.sezeme.section02.assignment;

public class Application1 {
    public static void main(String[] args) {
        /* 대입 연산자 (산술 복합 대입 연산자) 를 사용할 수 있다. */
        int num = 12;
        System.out.println("num : " +num);

        //3증가시
        num = num + 3;							//대입연산자의 오른쪽에는 값, 왼쪽에는 공간의 의미이다.
        System.out.println("num : " + num);

        num += 3;  								//num = num + 3; 과 같은 의미임
        System.out.println("num : " + num);

        num -= 5;  								//num = num - 5;
        System.out.println("num : " + num);

        num *= 2;  								//num값 2배 증가
        System.out.println("num : " + num);

        num /= 2;  								//num값 2배 감소
        System.out.println("num : " + num);

        /* 주의! 산술 복합 대입연산자의 작성 순서에 주의해야 한다. */
        /* 산술 대입 연산자가 아닌 '-5'를 num에 대입한 것이다. */
        num =- 5;
        System.out.println("num : " + num);
    }
}