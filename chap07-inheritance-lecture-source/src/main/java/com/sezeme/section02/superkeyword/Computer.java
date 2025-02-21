package com.sezeme.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        super();
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        /* 위에 작성 된 생성자를 this()로 호출한다는 것은 super()를 두 번 호출하는 것과 같으므로
         * 허용 되지 않는다. */
//        this(cpu, hdd, ram, operationSystem);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    /* 부모 필드에 직접 접근은 불가능하지만 getter, setter 메소드는 자신의 것 처럼 사용 가능하므로
     * 자식 클래스에서 추가된 필드에 대해서만 getter, setter를 작성한다.
     * */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    @Override
    public String getInformation() {
        // super.getCode(), this.getCode() 등으로 부모 속성 필드에 접근 가능하다.
        // 단, this.getInformation()으로 작성하면 문제가 생길 수 있으니 유의한다.
        // 자기 자신을 호출하는 재귀호출이 무한으로 일어나면서 java.lang.StackOverflowError 가 발생
        return super.getInformation() + " " + cpu + " " + hdd + " " + ram + " " + operationSystem;
    }








}