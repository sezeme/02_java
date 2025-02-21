package com.sezeme.section01.extend;

public class Car {
    private boolean runningStatus;

    public Car() {
        super();
        System.out.println("Car 클래스 기본 생성자 호출");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    /* private */ protected boolean isRunning() {
        return runningStatus;
    }

    public void soundHorn() {
        if(isRunning()) {
            System.out.println("빵!빵!");
        } else {
            System.out.println("주행 중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }




}