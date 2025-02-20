package com.sezeme.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근 하는 경우 발생할 수 있는 문제점을 이해한다. */

        /* 필드에 직접 접근하면 필드의 변경이 발생하였을 때 사용한 코드를 모두 수정해야 한다.
         * 이는 유지보수적인 측면에서 악영향을 끼친다. */
        Monster m1 = new Monster();
//        m1.name = "두치";
        m1.hp = 200;
//        System.out.println("m1.name = " + m1.name);
        System.out.println("m1.hp = " + m1.hp);

        Monster m2 = new Monster();
//        m2.name = "뿌꾸";
        m2.hp = -200;
//        System.out.println("m2.name = " + m2.name);
        System.out.println("m2.hp = " + m2.hp);

        /* 메소드를 통한 간접 접근을 할 경우 실제 내부에서 name -> kinds로 변화된 것과 무관하게
         * 코드를 수정할 필요가 없어진다. */
        Monster m3 = new Monster();
        m3.setInfo("드라큘라");
        m3.hp = 100;
        System.out.println("m3.getInfo : " + m3.getInfo());
        System.out.println("m3.hp : " + m3.hp);

    }
}