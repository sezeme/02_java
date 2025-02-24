package com.sezeme.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 매개변수에 활용할 수 있다. */
        Application3 application3 = new Application3();
        application3.feed(new Rabbit());
        application3.feed(new Tiger());
    }
    /* 다형성을 적용하지 않을 시 각 동물별로 먹이를 주는 메소드가 작성 되어야 하며
     * 동물의 종류가 늘어나면 메소드도 추가 되어야 한다.
     * 하지만 Animal 상위 타입을 통해 다형성이 적용 되면 동물이 추가 되어도 동일 메소드를 활용할 수 있다.
     * */
    public void feed(Animal animal) {
        animal.eat();
    }
}
