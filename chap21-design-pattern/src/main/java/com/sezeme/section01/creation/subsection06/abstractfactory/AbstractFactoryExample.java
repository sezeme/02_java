package com.sezeme.section01.creation.subsection06.abstractfactory;

// 추상 제품군
interface Chair {
    void sit();
}

interface Sofa {
    void lieDown();
}

// 구체적인 제품: 서로 다른 스타일의 의자 구현
class ModernChair implements Chair {
    public void sit() {
        System.out.println("현대적인 의자에 앉았습니다.");
    }
}

class VictorianChair implements Chair {
    public void sit() {
        System.out.println("빅토리아 스타일 의자에 앉았습니다.");
    }
}

// 구체적인 제품: 서로 다른 스타일의 소파 구현
class ModernSofa implements Sofa {
    public void lieDown() {
        System.out.println("현대적인 소파에 누웠습니다.");
    }
}

class VictorianSofa implements Sofa {
    public void lieDown() {
        System.out.println("빅토리아 스타일 소파에 누웠습니다.");
    }
}

// 추상 팩토리 : 관련된 제품군(의자, 소파)을 생성하는 메서드 선언
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

// 구체적인 팩토리: 제품군 전체를 생성하는 방법 구현
class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }

    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

public class AbstractFactoryExample {
    public static void main(String[] args) {
        // 현대 스타일 가구 공장 사용
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        modernChair.sit();
        modernSofa.lieDown();

        // 빅토리아 스타일 가구 공장 사용
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        victorianChair.sit();
        victorianSofa.lieDown();
    }
}
