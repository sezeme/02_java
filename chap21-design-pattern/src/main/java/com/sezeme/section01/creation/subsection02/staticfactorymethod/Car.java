package com.sezeme.section01.creation.subsection02.staticfactorymethod;

public class Car {
    private String model;

    private Car(String model) {
        this.model = model;
    }

    /* 가독성 올라가고 필요하다면 캐싱처리해서 객체를 생성할 수 있기 떄문이다. static 메소드로 생성
    * 상속이 어렵다. -> car를 extends해서 활용하기에는 생성자가 private */
    public static Car createCar(String model) {
        return new Car(model);
    }

    public void showModel() {
        System.out.println("model: " + model);
    }

    public static void main(String[] args) {
        Car car = Car.createCar("Tesla");
        car.showModel();

        /* Java API 예제 */
        Integer num = Integer.valueOf(10);
//        Integer num2 = new Integer(10);
        /*
        *     @IntrinsicCandidate
    public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
        * */
    }
}
