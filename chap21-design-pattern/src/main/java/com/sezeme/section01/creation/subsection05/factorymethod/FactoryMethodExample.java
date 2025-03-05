package com.sezeme.section01.creation.subsection05.factorymethod;

// 추상 Product 클래스
abstract class Product {
    abstract void use();
}

// 구체적인 Product 클래스들
class ConcreteProductA extends Product {
    @Override
    void use() {
        System.out.println("제품 A를 사용합니다.");
    }
}

class ConcreteProductB extends Product {
    @Override
    void use() {
        System.out.println("제품 B를 사용합니다.");
    }
}

// 추상 Creator 클래스: 객체 생성 책임을 정의
abstract class Creator {
    // 팩토리 메서드: 구체적인 객체 생성은 서브클래스에서 담당, 객체를 생성해서 반환
    abstract Product factoryMethod();
}

// 구체적인 Creator 클래스들
class ConcreteCreatorA extends Creator {
    @Override
    Product factoryMethod() {
        return new ConcreteProductA();
    }
}

class ConcreteCreatorB extends Creator {
    @Override
    Product factoryMethod() {
        return new ConcreteProductB();
    }
}

public class FactoryMethodExample {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.use();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.use();
        /* 새로운 상품 추가 시 기존 코드들은 하나도 건드리지 않고 creator과 product가 하나씩만 생기면 됨. 기존 코드 수정할 필요 x
        * 내가 추가해야 하는 코드만 추가로 만들면 됨. */
    }
}