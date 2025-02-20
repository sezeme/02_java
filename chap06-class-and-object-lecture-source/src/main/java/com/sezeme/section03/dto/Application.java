package com.sezeme.section03.dto;

public class Application {
    public static void main(String[] args) {
        /* 데이터를 추상화하는 기법을 이해하고 이를 사용하여 프로그래밍화 할 수 있다. */

        /* DTO(Data Transfer Object) : 계층 간의 데이터 전달 용도로 사용 되는 클래스
         * 캡슐화의 원칙에 따라 작성하기는 했으나 캡슐화가 의미 없을 정도로
         * 필드명을 그대로 사용한 setter, getter 메소드로 인해 유지보수성이 좋지는 않다.
         * */

        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setNumber(1);
        memberDTO.setName("홍길동");
        memberDTO.setAge(30);
        memberDTO.setGender('남');
        memberDTO.setHeight(178.5);
        memberDTO.setWeight(78.5);
        memberDTO.setActivated(true);

        System.out.println(memberDTO.getNumber());
        System.out.println(memberDTO.getName());
        System.out.println(memberDTO.getAge());
        System.out.println(memberDTO.getGender());
        System.out.println(memberDTO.getHeight());
        System.out.println(memberDTO.getWeight());
        System.out.println(memberDTO.isActivated());
    }
}