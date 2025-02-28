package com.sezeme.section03.references;

import java.util.function.Function;

public class Application2 {
    public static void main(String[] args) {
        /* 생성자 메서드 참조를 이해하고 사용할 수 있다.
        * 해당 문법들을 steam에서 사용할 수 있음. */
        Function<String, Member> function = Member::new; //메서드명 == 클래스명이기 때문에 new로 가져옴

        Member member1 = function.apply("user01");
        Member member2 = function.apply("user02");
        System.out.println(member1);
        System.out.println(member2);











    }
}
