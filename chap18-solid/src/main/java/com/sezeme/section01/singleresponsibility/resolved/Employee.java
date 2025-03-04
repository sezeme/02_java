package com.sezeme.section01.singleresponsibility.resolved;

public class Employee {
    private String name;
    private int workingHours;
    private int payRate;
    public Employee(String name, int workingHours, int payRate) {
        this.name = name;
        this.workingHours = workingHours;
        this.payRate = payRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    public int getPayRate() {
        return payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }
}
