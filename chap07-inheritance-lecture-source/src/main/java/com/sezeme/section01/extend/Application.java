package com.sezeme.section01.extend;

public class Application {
    public static void main(String[] args) {
        /* Car 인스턴스 테스트 */
        Car car = new Car();
        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();
        car.soundHorn();

        /* FireCar is a Car.
         * RacingCar is a Car.
         * => IS-A 관계가 성립하는 경우 상속을 적용시킬 수 있다.
         * */

        /* FireCar 인스턴스 테스트 */
        FireCar fireCar = new FireCar();
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();
        fireCar.sprayWater();

//        car.sprayWater();  -> 부모는 자식의 멤버에 접근해서 사용할 수 없다.



    }
}